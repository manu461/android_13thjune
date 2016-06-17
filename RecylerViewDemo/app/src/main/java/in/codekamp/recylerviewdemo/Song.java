package in.codekamp.recylerviewdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 17/06/16.
 */
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public static List<Song> allSongs() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song("Saadgi","Nusrat Fateh Ali Khan"));
        songs.add(new Song("Sar Jhukaya toh pathar","Nusrat Fateh Ali Khan"));

        for (int i = 0; i < 100; i++) {
            songs.add(new Song("New song " + 1,"Artist " + i));
        }

        return songs;
    }
}
