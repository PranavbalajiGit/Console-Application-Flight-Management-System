package com.flightbookingsystem;

//This is a Abstract class and admin class will implement the method showMenu.
abstract public class User {
    //This is protected because it must be used in Admin class
    protected String name;

    public User (String name) {
        this.name = name;
    }

    public abstract void showMenu();
}
