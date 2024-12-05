package com.bcyahoofinance.bc_yahoo_finance.service;

import java.util.List;
import com.bcyahoofinance.bc_yahoo_finance.entity.StockEntity;

public interface StockService {
  List<StockEntity> saveAll(List<StockEntity> list);
  List<StockEntity> findAll();
}
