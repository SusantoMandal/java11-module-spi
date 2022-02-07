package my.company.impl;

import my.company.spi.Vehicle;

public class Car implements Vehicle {
  public void wheels() {
    System.out.println("Number of wheels in car are 4");
  };
  public void intro() {
    System.out.println("Method call from Car.java");
  };
}