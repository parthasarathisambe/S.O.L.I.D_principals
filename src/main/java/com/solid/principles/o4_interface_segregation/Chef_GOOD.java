package com.solid.principles.o4_interface_segregation;

public class Chef_GOOD implements Cook_GOOD {

  @Override
  public void cookFood() {
    System.out.println("Cooking food...");
  }

}
