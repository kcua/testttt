/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.io.Serializable;

/**
 *
 * @author x23145234
 */
public class eBook implements Serializable {
    private String author;
    private String title;
    private String fileType;

    public eBook() {
    }

    public eBook(String author, String title, String fileType) {
        this.author = author;
        this.title = title;
        this.fileType = fileType;
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

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    
    
    
}
