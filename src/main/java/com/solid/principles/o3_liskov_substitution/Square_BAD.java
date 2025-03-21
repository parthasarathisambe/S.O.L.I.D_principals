package com.solid.principles.o3_liskov_substitution;

/**
 * A Square violates the behavior expected of a Rectangle. If you set the width
 * and height of a Square independently, it breaks the expected functionality.
 * Substituting a Square in a place where a Rectangle is used may lead to
 * incorrect results.
 */
public class Square_BAD extends Rectangle_BAD {

  @Override
  public void setLength(int length) {
    this.length = length;
    this.breadth = length;
  }

  @Override
  public void setBreadth(int breadth) {
    this.length = breadth;
    this.breadth = breadth;
  }

}
