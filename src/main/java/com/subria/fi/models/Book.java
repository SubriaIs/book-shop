package com.subria.fi.models;

import com.subria.fi.enums.BookType;

import java.util.Date;

public class Book implements com.subria.fi.interfaces.Book {
    private int id;
    private BookType bookType;
    private String bookName;
    private String authorName;
    private double price;
    private Date publishDate;
    private String isbnNumber;

    public Book(int id, BookType bookType, String bookName, String authorName, double price, Date publishDate, String isbnNumber) {
        this.id = id;
        this.bookType = bookType;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
        this.publishDate = publishDate;
        this.isbnNumber = isbnNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookType=" + bookType +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", publishDate=" + publishDate +
                ", isbnNumber='" + isbnNumber + '\'' +
                '}';
    }
}
