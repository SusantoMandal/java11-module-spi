package my.company.impl;

import my.company.spi.Vehicle;

public class Bike implements Vehicle {
  public void wheels() {
    System.out.println("Number of wheels in bike are 2");
  };
  public void intro() {
    System.out.println("Method call from Bike.java");
  };
}