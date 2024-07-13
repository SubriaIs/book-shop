package com.subria.fi.models;

import com.subria.fi.enums.TransactionType;
import com.subria.fi.interfaces.Book;
import com.subria.fi.interfaces.Person;

import java.util.Date;
import java.util.List;

public class Borrow extends Transaction{
    public Borrow(int id, Date date, Person person, List<Book> books) {
        super(TransactionType.BORROW, id, date,person,books);
    }
}
