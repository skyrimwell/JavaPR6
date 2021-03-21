package com.company.FactoryMethod;

public class Metallica extends Group {
    @Override
    protected Song makeSong(SongType type) {
        Song song = null;

        switch (type) {
            case SAD:
                song = new SadSong();
                break;
            case TRASH:
                song = new TrashSong();
                break;
            case FURIOUS:
                song = new FuriousSong();
                break;
            case INSTRUMENTAL:
                song = new InstrumentalSong();
                break;
        }
        return song;
    }
}
