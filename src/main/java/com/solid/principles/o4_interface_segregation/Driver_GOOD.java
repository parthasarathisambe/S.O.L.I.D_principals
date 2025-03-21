package com.solid.principles.o4_interface_segregation;

public class Driver_GOOD implements Drive_GOOD {

  @Override
  public void driveCar() {
    System.out.println("Driving Car...");
  }

}
