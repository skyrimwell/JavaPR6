package com.company.Prototype;

public class Song {
    private SongType type;

    public Song() {
    }

    public Song(SongType type) {
        this.type = type;
    }

    public SongType getType() {
        return type;
    }

    public void setType(SongType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Your song is "+type;
    }
}
