package com.solid.principles.o5_dependency_inversion;

public class SmsSender_GOOD implements MessageSender_GOOD {

  @Override
  public void sendMessage(String message) {
    System.out.println("Sending message: " + message);
  }

}
