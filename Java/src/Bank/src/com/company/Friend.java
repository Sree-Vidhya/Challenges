package com.company;

public class Friend implements Comparable{
    private String name;
    private String month;
    private String age;
    private String phoneNumber;

    public Friend(String name, String month, String age, String phoneNumber) {
        this.name = name;
        this.month = month;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String  getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", month='" + month + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public int compareTo(Object obj) {
        if(obj instanceof Friend){

            Friend frnd1ToCompare = (Friend)(obj);
            return Integer.valueOf(this.getAge()).compareTo(Integer.valueOf(frnd1ToCompare.age));
        }
        return -1;
    }
}


