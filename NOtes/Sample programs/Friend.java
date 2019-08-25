package com.myob;

import java.time.LocalDate;

public class Friend implements  Comparable{
    private String name;
    private LocalDate dob;
    private String phoneNumber;

    public Friend(String name, LocalDate dob, String phoneNumber) {
        this.name = name;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof LocalDate)
            return this.dob.compareTo((LocalDate)o);
        else
            return -1;
    }
}
