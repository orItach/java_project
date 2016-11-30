package project.java.contact_ptovider.entities;

import android.location.Address;
import android.provider.ContactsContract.*;
import android.provider.ContactsContract;

/**
 * Created by אור איטח on 28/11/2016.
 */

public class Business {
    public static int countBus=0;
    private long ID;
    private String name;
    private String country;
    private String city;
    private String street;
    private String phoneNum;
    private String email;
    private String link;

    public Business(long ID, String name, String country, String city, String street, String phoneNum, String email, String link) {
        this.ID = ID;
        this.name = name;
        this.country = country;
        this.city = city;
        this.street = street;
        this.phoneNum = phoneNum;
        this.email = email;
        this.link = link;
    }


    //region get and set
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    //endregion
}

