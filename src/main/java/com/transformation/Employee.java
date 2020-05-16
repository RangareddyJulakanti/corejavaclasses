package com.transformation;
//XMl schema class

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Employee  implements Serializable {
    @JsonProperty
    private String fname;
    @JsonProperty
    private String lname;
    private String city;
    private String state;

    public Employee(String fname, String lname, String city, String state) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.state = state;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

