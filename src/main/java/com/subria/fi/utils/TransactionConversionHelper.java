package com.subria.fi.utils;

import com.subria.fi.enums.BookType;
import com.subria.fi.enums.TransactionType;
import com.subria.fi.interfaces.Book;
import com.subria.fi.interfaces.Person;
import com.subria.fi.models.Customer;
import com.subria.fi.models.Transaction;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public final class TransactionConversionHelper {
    private TransactionConversionHelper() {
    }

    public static void doSerialize(Transaction transaction) throws IOException {
        FileOutputStream fileOutputStream= new FileOutputStream("./src/main/resources/BookShopFile.txt");
        ObjectOutputStream inputStream = new ObjectOutputStream(fileOutputStream);
        inputStream.writeObject(transaction);
    }

    public static Transaction doDeserialize() throws IOException, ClassNotFoundException {
        Transaction transaction= null;
        FileInputStream fileInputStream= new FileInputStream("./src/main/resources/BookShopFile.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        return transaction=(Transaction) inputStream.readObject();
    }
}

