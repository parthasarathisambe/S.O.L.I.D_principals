package com.solid.principles.o5_dependency_inversion;

public class NotificationService_BAD {

  private EmailSender_BAD emailSender;

  public NotificationService_BAD(EmailSender_BAD emailSender) {
    this.emailSender = emailSender;
  }

  public void notify(String message) {
    emailSender.sendEmail(message);
  }

}
