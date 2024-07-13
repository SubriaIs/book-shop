package com.subria.fi.models;

import com.subria.fi.enums.TransactionType;
import com.subria.fi.interfaces.Book;
import com.subria.fi.interfaces.Person;

import java.util.Date;
import java.util.List;

public class Return extends Transaction{
    public Return(int id, Date date, Person person, List<Book> books) {
        super(TransactionType.RETURN, id, date,person,books);
    }
}
