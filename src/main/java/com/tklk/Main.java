package com.tklk;

public class Main {

  public static void main(String[] args) {
    var fuel = new FuelVisitor();

    new TraditionalCar().accept(fuel);
    new ElectricCar().accept(fuel);
  }
}
