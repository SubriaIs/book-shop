package com.subria.fi.interfaces;

import com.subria.fi.enums.PersonType;

public interface Person {
    public PersonType getType();
    public void setType(PersonType type);
    public String getFirstName();
    public void setFirstName(String firstName);
    public String getLastName();
    public void setLastName(String lastName);
    public String getPhoneNumber();
    public void setPhoneNumber(String phoneNumber);
    public String getEmailAddress();
    public void setEmailAddress(String emailAddress);
    public String getAddress();
    public void setAddress(String address);
    public int getAge();
    public void setAge(int age);
    public String toString();
}
