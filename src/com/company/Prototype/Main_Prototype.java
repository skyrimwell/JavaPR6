package com.company.Prototype;

public class Main_Prototype {

    public static void main(String[] args) {
        Song furious = new Song(SongType.FURIOUS);
        Song instrumental = new Song(SongType.INSTRUMENTAL);
        furious.setType(SongType.SAD);

        System.out.println(furious);
        System.out.println(instrumental);
    }
}
