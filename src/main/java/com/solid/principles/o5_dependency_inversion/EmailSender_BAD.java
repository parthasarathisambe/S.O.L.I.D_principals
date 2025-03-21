package com.solid.principles.o5_dependency_inversion;

public class EmailSender_BAD {

  public void sendEmail(String message) {
    System.out.println("Sending email: " + message);
  }

}
