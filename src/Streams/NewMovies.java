package Streams;

public class NewMovies {
    private String name;
    private int likes;

    public NewMovies(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "NewMovies{" +
                "title='" + name + '\'' +
                ", likes=" + likes +
                '}';
    }
}
