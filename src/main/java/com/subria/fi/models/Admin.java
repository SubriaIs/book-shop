package com.subria.fi.models;

import com.subria.fi.enums.PersonType;

public class Admin extends Person {
    public Admin(String fistName, String lastName, String phoneNumber, String emailAddress, String address, int age) {
        super(PersonType.ADMIN, fistName, lastName, phoneNumber, emailAddress, address, age);
    }
}
