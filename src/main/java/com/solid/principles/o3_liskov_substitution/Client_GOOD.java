package com.solid.principles.o3_liskov_substitution;

public class Client_GOOD {

  public void calculateArea() {
    Shape_GOOD shape1 = new Rectangle_GOOD(2, 3);
    shape1.calculateArea();

    Shape_GOOD shape2 = new Square_GOOD(2);
    shape2.calculateArea();
  }

}
