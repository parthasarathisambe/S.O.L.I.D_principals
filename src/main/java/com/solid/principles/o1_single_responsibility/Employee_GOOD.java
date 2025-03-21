package com.solid.principles.o1_single_responsibility;

public class Employee_GOOD {

  private String name;
  
  private String designation;
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setDesignation(String designation) {
    this.designation = designation;
  }
  
  public String getDesignation() {
    return designation;
  }
  
}
