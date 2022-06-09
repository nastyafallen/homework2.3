package com.company;

public class Bicycle extends Transport implements ServiceInterface {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre(Bicycle bicycle) {
        System.out.println("Меняем покрышку велосипеда");
    }

    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }


}