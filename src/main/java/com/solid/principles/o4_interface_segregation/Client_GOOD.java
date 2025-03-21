package com.solid.principles.o4_interface_segregation;

public class Client_GOOD {

  public void initiateTasks() {
    WorkManager_GOOD workManager = new WorkManager_GOOD();
    workManager.manageCook(new Chef_GOOD());
    workManager.manageDriver(new Driver_GOOD());
  }

}
