package com.bcyahoofinance.bc_yahoo_finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bcyahoofinance.bc_yahoo_finance.entity.StockEntity;

public interface StockRepository extends JpaRepository<StockEntity, Long>{
  
}
