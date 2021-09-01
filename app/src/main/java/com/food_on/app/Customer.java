package com.food_on.app;

public class Customer {


    private String City, Confirm_Password, Email_Id, First_Name, Last_Name, Mobile_no, Passwordc, State, Suburbanc, Local_Address;

    public Customer() {

    }

    public Customer(String city, String confirm_Password, String email_Id, String first_Name, String last_Name, String mobile_no, String passwordc, String state, String suburbanc, String local_Address) {
        City = city;
        Confirm_Password = confirm_Password;
        Email_Id = email_Id;
        First_Name = first_Name;
        Last_Name = last_Name;
        Mobile_no = mobile_no;
        Passwordc = passwordc;
        State = state;
        Suburbanc = suburbanc;
        Local_Address = local_Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getConfirm_Password() {
        return Confirm_Password;
    }

    public void setConfirm_Password(String confirm_Password) {
        Confirm_Password = confirm_Password;
    }

    public String getEmail_Id() {
        return Email_Id;
    }

    public void setEmail_Id(String email_Id) {
        Email_Id = email_Id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getMobile_no() {
        return Mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        Mobile_no = mobile_no;
    }

    public String getPasswordc() {
        return Passwordc;
    }

    public void setPasswordc(String passwordc) {
        Passwordc = passwordc;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getSuburbanc() {
        return Suburbanc;
    }

    public void setSuburbanc(String suburbanc) {
        Suburbanc = suburbanc;
    }

    public String getLocal_Address() {
        return Local_Address;
    }

    public void setLocal_Address(String local_Address) {
        Local_Address = local_Address;
    }
}

