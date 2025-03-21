package com.solid.principles.o3_liskov_substitution;

public class Square_GOOD implements Shape_GOOD {

  private int length;

  public Square_GOOD(int length) {
    this.length = length;
  }

  @Override
  public int calculateArea() {
    return length * length;
  }

}
