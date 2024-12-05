package com.bcyahoofinance.bc_yahoo_finance.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.bcyahoofinance.bc_yahoo_finance.entity.StockEntity;
import com.bcyahoofinance.bc_yahoo_finance.service.StockService;

@Service
public class StockServiceImpl implements StockService{
  @Override
  public List<StockEntity> saveAll(List<StockEntity> list) {
    return null;
  };

  @Override
  public List<StockEntity> findAll() {
    return null;
  };
}
