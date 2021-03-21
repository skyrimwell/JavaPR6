package com.company.FactoryMethod;

public class Ghost extends Group {
    @Override
    protected Song makeSong(SongType type) {
        Song song = null;

        switch (type) {
            case SAD:
                song = new SadSong2();
                break;
            case TRASH:
                song = new TrashSong2();
                break;
            case FURIOUS:
                song = new FuriousSong2();
                break;
            case INSTRUMENTAL:
                song = new InstrumentalSong2();
                break;
        }
        return song;
    }
}
