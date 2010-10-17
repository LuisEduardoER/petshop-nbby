package com.sun.javaee.blueprints.petstore.controller;

public class AddressBean {

	private static final boolean bDebug = false;

    private String street;
    private String city;
    private String state;
    private String zip;

    public AddressBean() { }

    public void setStreet(String street) {
        if(bDebug) System.out.println("Setting street - " + street);
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        if(bDebug) System.out.println("Setting City - " + city);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        if(bDebug) System.out.println("Setting state - " + state);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZip(String zip) {
        if(bDebug) System.out.println("Setting zip - " + zip);
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

}
