package com.company.AbstractFactory;

public class Main_Abstract {

    public static void main(String[] args) {
        Bethesda Beth = new Bethesda();
       Beth.CreateTESO();
        Beth.CreateTES();
        System.out.println();
        Zenimax Zen = new Zenimax();
        Zen.CreateTESO();
        Zen.CreateTES();
    }
}
