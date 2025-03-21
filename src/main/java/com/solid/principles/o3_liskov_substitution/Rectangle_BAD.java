package com.solid.principles.o3_liskov_substitution;

public class Rectangle_BAD {

  protected int length;

  protected int breadth;

  public void setLength(int length) {
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  public void setBreadth(int breadth) {
    this.breadth = breadth;
  }

  public int getBreadth() {
    return breadth;
  }

  public int calculateArea() {
    return length * breadth;
  }

}
