package com.company;

public class ServiceStation implements ServiceInterface {

    public ServiceStation() {
    }

    @Override
    public void check(ServiceStation serviceStation) {
        serviceStation.check();
    }
}
