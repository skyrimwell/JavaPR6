package com.company.FactoryMethod;

public class Main_Factory {

    public static void main(String[] args) {
        System.out.println("Best group in the world creates songs");
        Group Met = new Metallica();
        Met.choseSong(SongType.SAD);
        Met.choseSong(SongType.TRASH);
        Met.choseSong(SongType.FURIOUS);
        Met.choseSong(SongType.INSTRUMENTAL);
        System.out.println();
        System.out.println("Best group in the second world creates songs");
        Group Gst = new Ghost();
        Gst.choseSong(SongType.SAD);
        Gst.choseSong(SongType.TRASH);
        Gst.choseSong(SongType.FURIOUS);
        Gst.choseSong(SongType.INSTRUMENTAL);
    }
}
