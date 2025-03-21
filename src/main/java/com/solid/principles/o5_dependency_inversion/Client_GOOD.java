package com.solid.principles.o5_dependency_inversion;

public class Client_GOOD {

  public void sendNotification() {
    MessageSender_GOOD emailSender = new EmailSender_GOOD();
    NotificationService_GOOD emailNotify = new NotificationService_GOOD(emailSender);
    emailNotify.notify("Good way of implementation");

    MessageSender_GOOD smsSender = new SmsSender_GOOD();
    NotificationService_GOOD smsNotify = new NotificationService_GOOD(smsSender);
    smsNotify.notify("Good way of implementation");
  }

}
