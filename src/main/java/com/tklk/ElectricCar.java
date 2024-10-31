package com.tklk;

class ElectricCar extends Car {

  @Override
  void accept(CarVisitor visitor) {
    visitor.visitElectricCar(this);
  }
}
