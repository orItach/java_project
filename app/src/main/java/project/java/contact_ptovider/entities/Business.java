package project.java.contact_ptovider.entities;

import android.location.Address;
import android.provider.ContactsContract.*;
import android.provider.ContactsContract;

/**
 * Created by אור איטח on 28/11/2016.
 */

public class Business {
    long ID;
    String name;
    Address address;
    CommonDataKinds.Phone phoneNum;
    CommonDataKinds.Email email;
    String link;

    public Business(long ID, String name, Address address, CommonDataKinds.Phone phoneNum, CommonDataKinds.Email email, String link) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
        this.link = link;
    }



    //region get and set
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CommonDataKinds.Phone getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(CommonDataKinds.Phone phoneNum) {
        this.phoneNum = phoneNum;
    }

    public CommonDataKinds.Email getEmail() {
        return email;
    }

    public void setEmail(CommonDataKinds.Email email) {
        this.email = email;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    //endregion
}

