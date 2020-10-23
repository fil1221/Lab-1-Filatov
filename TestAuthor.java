package ru.mirea.gib04.lab2;
import java.lang.*;
public class TestAuthor {
    public static void  main(String[] args) {
        Author k1 = new Author("Mihail Lermontov",400, "A Hero of Our Time");
        System.out.println(" Author " + k1.getAuthor() + " Pages "+ k1.getPage()
                + " Name " + k1.getName());
        Author k2 = new Author( 1300);
        System.out.println(" Author " + k2.getAuthor() + " Pages " + k2.getPage()
                + " Name is " + k2.getName());
        Author k3 = new Author(450,"Master and Margarita");
        System.out.println(" Author " + k3.getAuthor() + " Pages " + k3.getPage()
                + " Name is " + k3.getName());
    }
}