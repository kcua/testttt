/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.io.Serializable;

/**
 *
 * @author fsheridan
 */
public class Book implements Serializable {
    private String author;
    private String title;
    private String isbn;
    
    public Book(){
        author = new String();
        title = new String();
        isbn = new String();
    }

    public Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getDetails(){
        return "Book:"+title+","+author+","+isbn;
    }
    
}