package com.company.FactoryMethod;

public abstract class Group {
    public void choseSong(SongType type){
        Song pizza = makeSong(type);
        System.out.println("You have ordered "+pizza.getSong());
    }
    protected abstract Song makeSong(SongType type);
}
