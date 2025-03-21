package com.solid.principles.o4_interface_segregation;

public class WorkManager_GOOD {

  public void manageCook(Cook_GOOD cook) {
    cook.cookFood();
  }

  public void manageDriver(Drive_GOOD drive) {
    drive.driveCar();
  }

}
