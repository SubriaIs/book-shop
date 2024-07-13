package com.subria.fi.models;

import com.subria.fi.enums.TransactionType;
import com.subria.fi.interfaces.Book;
import com.subria.fi.interfaces.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction implements com.subria.fi.interfaces.Transaction, Serializable {
    private static final long serialVersionUID = 1L;
    private TransactionType transactionType;
    private int id;
    private Date date;
    private Person person;
    private List<com.subria.fi.interfaces.Book> books = new ArrayList<>();


    public Transaction(TransactionType transactionType, int id, Date date, Person person, List<com.subria.fi.interfaces.Book> books) {
        this.transactionType = transactionType;
        this.id = id;
        this.date = date;
        this.person = person;
        this.books = books;
    }

    @Override
    public TransactionType getTransactionType() {
        return transactionType;
    }

    @Override
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<com.subria.fi.interfaces.Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionType=" + transactionType +
                ", id=" + id +
                ", date=" + date +
                ", person=" + person +
                ", books=" + books +
                '}';
    }
}
