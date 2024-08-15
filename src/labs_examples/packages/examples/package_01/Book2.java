package labs_examples.packages.examples.package_01;


public class Book2 {
    private final String title;
    private final String author;
    private final int pubDate;

    // Now public.
    public Book2(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    // Now public.
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}