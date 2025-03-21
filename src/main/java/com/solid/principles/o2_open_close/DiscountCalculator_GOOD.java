package com.solid.principles.o2_open_close;

public class DiscountCalculator_GOOD {

  public void calculateDiscount(double totalAmount) {
    // for Regular Customer
    Discount_GOOD discount1 = new RegularDiscount_GOOD();
    discount1.calculate(totalAmount);
    
    // for Premium Customer
    Discount_GOOD discount2 = new PremiumDiscount_GOOD();
    discount2.calculate(totalAmount);
  }

}
