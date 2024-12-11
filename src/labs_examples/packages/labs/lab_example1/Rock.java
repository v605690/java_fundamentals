package labs_examples.packages.labs.lab_example1;

public class Rock {
    private String genre;
    private String album;
    private String artists;

    public Rock(String genre, String album, String artists) {
        this.genre = genre;
        this.album = album;
        this.artists = artists;
    }

    protected void group() {
        System.out.println(genre);
        System.out.println(album);
        System.out.println(artists);
    }

    public void artist() {
        System.out.println(artists + " was an American rock band formed in Pasadena, California");
    }

}
