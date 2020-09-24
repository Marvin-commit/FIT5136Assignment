package com.monash.group61;

public class Store {
    private int storeId;
    private String street;
    private String city;
    private String suburb;
    private int postal;
    private String contactNumber;

    public Store(){

    }

    public Store(int storeId, String street, String city, String suburb, int postal, String contactNumber){
        this.storeId = storeId;
        this.street = street;
        this.city = city;
        this.suburb = suburb;
        this.postal = postal;
        this.contactNumber = contactNumber;
    }

    public int getStoreId(){
        return storeId;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String geySuburb(){
        return suburb;
    }

    public int getPostal(){
        return postal;
    }

    public String getContactNumber(){
        return contactNumber;
    }

    public void setStoreId(int storeId){
        this.storeId = storeId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
