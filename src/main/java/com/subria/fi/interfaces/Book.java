package com.subria.fi.interfaces;

import com.subria.fi.enums.BookType;

import java.util.Date;

public interface Book {
    public int getId();
    public void setId(int id);
    public BookType getBookType();
    public void setBookType(BookType bookType);
    public String getBookName();
    public void setBookName(String bookName);
    public String getAuthorName();
    public void setAuthorName(String authorName);
    public double getPrice();
    public void setPrice(double price);
    public Date getPublishDate();
    public void setPublishDate(Date publishDate);
    public String getIsbnNumber();
    public void setIsbnNumber(String isbnNumber);
    public String toString();
}
