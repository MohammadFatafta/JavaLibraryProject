/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

import java.util.Date;

/**
 *
 * @author User
 */
abstract class Book implements Display{
    private String title;
    private Author author;
    private int bookNo;
    private String genre;
    private int version;
    private Date date;

    public Book(String title, Author author, int bookNo, String genre, int version, Date date) {
        this.title = title;
        this.author = author;
        this.bookNo = bookNo;
        this.genre = genre;
        this.version = version;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }   

    public void setDate(Date date) {
        this.date = date;
    }

    public String getinfo() {
        return "Book{" + "title=" + title + ", author=" + author + ", bookNo=" + bookNo + ", genre=" + genre + ", version=" + version + ", date=" + date + '}';
    }
    
    
    
    
    
    
    
    
}
