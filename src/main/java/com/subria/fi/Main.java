package com.subria.fi;

import com.subria.fi.enums.BookType;
import com.subria.fi.enums.TransactionType;
import com.subria.fi.interfaces.Book;
import com.subria.fi.interfaces.Person;
import com.subria.fi.interfaces.Transaction;
import com.subria.fi.models.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Customer("Kamal", "Talukder", "+32823847", "kamal.takla@bikrompuri.com", "kivi 7", 53);
        Book book = new com.subria.fi.models.Book(1, BookType.NON_FICTION,"Talka","Bijoy Takla",45.99,new Date(),"JKSL_47585");
        Book book2 = new com.subria.fi.models.Book(2, BookType.FICTION,"Talka-friction","Bijoy Takla",45.99,new Date(),"JKSL_47585");

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        com.subria.fi.models.Transaction transaction = new com.subria.fi.models.Transaction(TransactionType.BORROW,3,new Date(),person,books);

        System.out.println(transaction);

    }
}