package com.company;

public class Truck extends Transport implements ServiceInterface {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre(Truck truck) {
        System.out.println("Меняем покрышку грузовика");
    }

    @Override
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        System.out.println("Проверяем двигатель, проверяем прицеп");
    }
}
