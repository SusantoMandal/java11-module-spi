package my.company.impl;

import my.company.spi.Vehicle;

public class Truck implements Vehicle {
  public void wheels() {
    System.out.println("Number of wheels in truck are 8");
  };
  public void intro() {
    System.out.println("Method call from Truck.java");
  };
}
