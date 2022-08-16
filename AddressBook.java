package com.bridgelabz.com;

import java.util.Scanner;

public class AddressBook {
    //variables
    private String FirstName;
    private String LastName;

    private byte Age;
    private String Address;
    private String State;
    private String City;
    private long PhoneNO;
    //getters abd setters  for  each variable

    Scanner sc = new Scanner(System.in);

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        this.State = state;
    }
    public void setAge(byte age) {
        this.Age = age;
    }
    public byte getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }


    public void setAddress(String address) {
        this.Address = address;
    }

    public Long getPhoneNO() {
        return PhoneNO;
    }

    public void setPhoneNO(Long phoneNO) {
        PhoneNO = phoneNO;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public void display() {
        System.out.println("Enter a First name: ");
        setFirstName(sc.nextLine());

        System.out.println("Enter a Last name: ");
        setLastName(sc.nextLine());

        System.out.println("Enter a age");
        setAge(sc.nextByte());
        System.out.println("Enter a Address: ");
        setAddress(sc.next());

        System.out.println("Enter a State: ");
        setState(sc.next());

        System.out.println("Enter a City: ");
        setCity(sc.next());

        System.out.println("Enter a Phone NUmber: ");
        setPhoneNO(sc.nextLong());

        System.out.println("First Name:\t" + this.getFirstName());
        System.out.println("last name:\t" + this.getLastName());
        System.out.println("Age :\t" + this.getAge());
        System.out.println("Address:\t" + this.getAddress());
        System.out.println("State:\t" + this.getState());
        System.out.println("City:\t" + this.getCity());
        System.out.println("Phone Number:\t" + this.getPhoneNO());
    }
}


