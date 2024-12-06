package com.bcyahoofinance.bc_yahoo_finance.service;

import java.util.List;
import com.bcyahoofinance.bc_yahoo_finance.entity.StockEntity;
import com.bcyahoofinance.bc_yahoo_finance.model.Stock;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface StockService {
  List<StockEntity> saveAll(List<StockEntity> entities);
  List<StockEntity> findAll();
  StockEntity findBySymbol(String symbol);
  List<Stock> findAllWithCache() throws JsonProcessingException;
}
