package com.bcyahoofinance.bc_yahoo_finance.service.impl;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import com.bcyahoofinance.bc_yahoo_finance.entity.StockEntity;
import com.bcyahoofinance.bc_yahoo_finance.infra.web.BusinessException;
import com.bcyahoofinance.bc_yahoo_finance.infra.web.ErrorCode;
import com.bcyahoofinance.bc_yahoo_finance.mapper.StockMapper;
import com.bcyahoofinance.bc_yahoo_finance.model.Stock;
import com.bcyahoofinance.bc_yahoo_finance.repository.StockRepository;
import com.bcyahoofinance.bc_yahoo_finance.service.StockService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StockServiceImpl implements StockService {

  @Autowired
  private StockRepository stockRepository;
  @Autowired
  private RedisTemplate<String, String> redisTemplate;
  @Autowired
  private StockMapper stockMapper;
  @Autowired
  private ObjectMapper objectMapper;

  @Override
  public List<StockEntity> saveAll(List<StockEntity> entities) {
    return stockRepository.saveAll(entities);
  };

  @Override
  public List<StockEntity> findAll() {
    return stockRepository.findAll();
  }

  @Override
  public StockEntity findBySymbol(String symbol) {
    return this.stockRepository.findBySymbol(symbol).orElseThrow(
        () -> new BusinessException(ErrorCode.Entity_NOT_FOUND_EX));
  }

  @Override
  public List<Stock> findAllWithCache() throws JsonProcessingException {
    
    String json = this.redisTemplate.opsForValue().get("stock-list");

    if (json == null) {
      List<Stock> stocks = this.stockRepository.findAll().stream()//
          .map(s -> this.stockMapper.map(s))//
          .collect(Collectors.toList());

      String jsonToWrite = this.objectMapper.writeValueAsString(stocks);
      this.redisTemplate.opsForValue().set("stock-list", jsonToWrite,
          Duration.ofMinutes(10));
      return stocks;
    }

    StockEntity[] stockEntities =
        this.objectMapper.readValue(json, StockEntity[].class);
    return Arrays.asList(stockEntities).stream()//
        .map(e -> this.stockMapper.map(e))//
        .collect(Collectors.toList());
  }

  
}
