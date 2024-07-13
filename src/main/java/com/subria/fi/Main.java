package com.subria.fi;

import com.subria.fi.enums.BookType;
import com.subria.fi.enums.TransactionType;
import com.subria.fi.interfaces.Book;
import com.subria.fi.interfaces.Person;
import com.subria.fi.interfaces.Transaction;
import com.subria.fi.models.Customer;
import com.subria.fi.utils.TransactionConversionHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Customer("Kamal", "Smith", "+32823847", "kamal.smith@gmail.com", "Pori 7", 53);
        Book book = new com.subria.fi.models.Book(1, BookType.NON_FICTION,"The Power of Your Subconscious Mind","Joseph Murphy",22.00,new Date(),"16178970198");
        Book book2 = new com.subria.fi.models.Book(2, BookType.FICTION,"Incidents Around the House","Josh Malerman",14.99,new Date(),"8593723129");

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        com.subria.fi.models.Transaction transaction = new com.subria.fi.models.Transaction(TransactionType.BORROW,3,new Date(),person,books);

        System.out.println(transaction);

        try {
            TransactionConversionHelper.doSerialize(transaction);
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            System.out.println(TransactionConversionHelper.doDeserialize());
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }


    }
}