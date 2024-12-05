package com.bcyahoofinance.bc_yahoo_finance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
  private Long id;
  private String symbol;
}
