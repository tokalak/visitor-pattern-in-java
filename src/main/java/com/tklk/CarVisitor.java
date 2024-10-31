package com.tklk;

interface CarVisitor {

  void visitTraditionalCar(TraditionalCar traditional);

  void visitElectricCar(ElectricCar electric);
}
