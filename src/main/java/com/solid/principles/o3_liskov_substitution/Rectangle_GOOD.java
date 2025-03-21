package com.solid.principles.o3_liskov_substitution;

public class Rectangle_GOOD implements Shape_GOOD {

  private int length;
  private int breadth;

  public Rectangle_GOOD(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public int calculateArea() {
    return length * breadth;
  }

}
