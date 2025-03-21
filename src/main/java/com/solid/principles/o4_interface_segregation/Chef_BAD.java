package com.solid.principles.o4_interface_segregation;

public class Chef_BAD implements Worker_BAD {

  @Override
  public void cookFood() {
    System.out.println("Cooking food...");
  }

  @Override
  public void driveCar() {
    throw new UnsupportedOperationException("I cannot drive car.");
  }

}
