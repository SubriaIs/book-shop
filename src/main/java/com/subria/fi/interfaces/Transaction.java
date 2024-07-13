package com.subria.fi.interfaces;

import com.subria.fi.enums.TransactionType;

import java.util.Date;
import java.util.List;

public interface Transaction {
    public TransactionType getTransactionType();
    public void setTransactionType(TransactionType transactionType);
    public int getId();
    public void setId(int id);
    public Date getDate();
    public void setDate(Date date);
    public String toString();
    public Person getPerson();
    public void setPerson(Person person);
    public List<com.subria.fi.interfaces.Book> getBooks();
    public void setBooks(List<Book> books);

}
