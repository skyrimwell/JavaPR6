package com.company.AbstractFactory;

public class Bethesda implements GameDev {
    public Bethesda() {
        System.out.println("Bethesda game studios");
    }

    @Override
    public Games CreateTESO() {
        return new Fallout();
    }

    @Override
    public Publishier CreateTES() {
        return new TES();
    }
}
