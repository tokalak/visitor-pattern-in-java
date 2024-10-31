package com.tklk;

class TraditionalCar extends Car {

  @Override
  void accept(CarVisitor visitor) {
    visitor.visitTraditionalCar(this);
  }
}
