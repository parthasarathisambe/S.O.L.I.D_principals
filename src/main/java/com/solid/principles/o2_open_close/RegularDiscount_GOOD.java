package com.solid.principles.o2_open_close;

public class RegularDiscount_GOOD implements Discount_GOOD {

  @Override
  public double calculate(double totalAmount) {
    return totalAmount * 0.10;
  }

}
