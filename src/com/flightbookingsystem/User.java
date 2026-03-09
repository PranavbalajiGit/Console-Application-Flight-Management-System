package com.flightbookingsystem;

//This is a Abstract class and admin class will implement the method showMenu.
abstract public class User {
    //This is protected because it must be used in Admin class
    protected String user;

    public User (String user) {
        this.user = user;
    }

    public abstract void showMenu();
}
