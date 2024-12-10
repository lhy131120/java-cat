package com.bcyahoofinance.bc_yahoo_finance.config;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bcyahoofinance.bc_yahoo_finance.entity.StockEntity;
import com.bcyahoofinance.bc_yahoo_finance.repository.StockRepository;
import com.bcyahoofinance.bc_yahoo_finance.service.StockService;

@Component
public class StockSymbolConfig implements CommandLineRunner {

  @Autowired
  private StockService stockService;

  @Autowired
  private StockRepository stockRepository;

  @Override
  public void run(String... args){

    /** Clear */
    this.stockRepository.deleteAll();

    String[] stockList = new String[] {"0388.HK", "0700.HK", "0005.HK"};
    List<StockEntity> entities = Arrays.stream(stockList)//
        .map(e -> StockEntity.builder().symbol(e).build())//
        .collect(Collectors.toList());
    this.stockService.saveAll(entities);
    System.out.println("Insert Symbols to DB!!!");
  }

}
