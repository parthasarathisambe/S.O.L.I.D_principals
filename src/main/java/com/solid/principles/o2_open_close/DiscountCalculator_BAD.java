package com.solid.principles.o2_open_close;

/**
 * Adding a new customer type (e.g., "VIP") requires modifying the existing
 * DiscountCalculator class. Over time, the if-else block becomes bloated and
 * harder to maintain. Any change risks breaking the logic for existing customer
 * types.
 */
public class DiscountCalculator_BAD {

  public double calculateDiscount(String customerType, double totalAmount) {
    if ("Regular".equals(customerType)) {
      return totalAmount * 0.10;
    } else if ("Premium".equals(customerType)) {
      return totalAmount * 0.20;
    }
    return 0;
  }

}
