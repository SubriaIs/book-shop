package com.subria.fi.models;

import com.subria.fi.enums.PersonType;

public class Staff extends Person {
    public Staff(String fistName, String lastName, String phoneNumber, String emailAddress, String address, int age) {
        super(PersonType.STAFF, fistName, lastName, phoneNumber, emailAddress, address, age);
    }
}
