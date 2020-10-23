package ru.mirea.gib04.lab2;
import java.lang.*;
public class Author {
    private String author;
    private int page;
    private String name;
    public Author(String s, int i, String s1) {
        author = "Mihail Lermontov";
        name = "A Hero of Our Time";
        page = 400;
    }
    public Author(int p) {
        author = "Lev Tolstoy";
        name = "War and Peace";
        page = p;
    }
    public Author(int p, String n) {
        author = "Mihail Bulgakov";
        name = n;
        page = p;
    }
    public String getAuthor() { return author; }
    public int getPage() { return page; }
    public String getName() { return name; }
}