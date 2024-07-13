package com.subria.fi.models;

import com.subria.fi.enums.PersonType;

public class Customer extends Person {
    public Customer(String firstName, String lastName, String phoneNumber, String emailAddress, String address, int age) {
        super(PersonType.CUSTOMER, firstName, lastName, phoneNumber, emailAddress, address, age);
    }
}
