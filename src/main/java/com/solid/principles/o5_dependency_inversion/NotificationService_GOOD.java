package com.solid.principles.o5_dependency_inversion;

public class NotificationService_GOOD {

  private MessageSender_GOOD messageSender;

  public NotificationService_GOOD(MessageSender_GOOD messageSender) {
    this.messageSender = messageSender;
  }

  public void notify(String message) {
    messageSender.sendMessage(message);
  }

}
