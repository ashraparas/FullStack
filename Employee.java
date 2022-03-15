package com.glearning.pg.model;

public class Employee {

    private final String firstName;

    private final String lastName;

    private String dept;

    private String emailAddress;

    private String password;

  //constructor to receive the first name and last name
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getDept() {
        return dept;
    }
}
