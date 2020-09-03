package ua.com.alevel.coderepairing;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Book> {
    private List<T> books = new ArrayList<>();

    public void addAll(List<? extends T> list) {
        books.addAll(list);
    }
    // why extends T?
    public static void main(String[] args) {
        Storage<Book> storage = new Storage<>();
        List<Album> albums = new ArrayList<>();
        albums.add(new Album());
        storage.addAll(albums);

    }
}
