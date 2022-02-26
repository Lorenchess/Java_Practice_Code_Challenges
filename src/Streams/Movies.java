package Streams;

public class Movies {
    private String title;
    private int likes;

    public Movies(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                '}';
    }
}
