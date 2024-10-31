package com.tklk;

class FuelVisitor implements CarVisitor {

  @Override
  public void visitTraditionalCar(TraditionalCar traditional) {
    System.out.println("Fueling a traditional car with gasoline.");
  }

  @Override
  public void visitElectricCar(ElectricCar electric) {
    System.out.println("Fueling an electric car.");
  }
}
