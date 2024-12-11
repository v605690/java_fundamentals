package labs_examples.packages.labs.lab_example2;

public class Alternative {
        private String genre;
        private String album;
        private String artists;

        public Alternative(String genre, String album, String artists) {
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
            System.out.println(artists + " is an American alternative band formed in Poway, California in 1992");
    }
}
