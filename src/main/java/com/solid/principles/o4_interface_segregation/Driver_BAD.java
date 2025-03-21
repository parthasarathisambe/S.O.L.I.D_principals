package com.solid.principles.o4_interface_segregation;

public class Driver_BAD implements Worker_BAD {

  @Override
  public void cookFood() {
    throw new UnsupportedOperationException("I cannot cook.");
  }

  @Override
  public void driveCar() {
    System.out.println("Driving Car...");
  }

}
