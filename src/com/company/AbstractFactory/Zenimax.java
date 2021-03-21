package com.company.AbstractFactory;

public class Zenimax implements GameDev {
    public Zenimax() {
        System.out.println("Zenimax");
    }

    @Override
    public Games CreateTESO() {
        return new TESO();
    }

    @Override
    public Publishier CreateTES() {
        return new Quake();
    }
}
