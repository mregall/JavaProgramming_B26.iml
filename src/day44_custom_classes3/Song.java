package day44_custom_classes3;

public class Song {
    String name;
    double length;
    String artist;
    String genre;

    public Song(String name){
        this.name = name;
    }

    public Song(String name, double length) {
        //this.name = name;
        this(name); // new stuff - "chaining the constructor"
        this.length = length;
    }

    public Song(String name, double length, String artist) {
        this(name, length);
        this.artist = artist;
    }

    public Song(String name, double length, String artist, String genre) {
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
