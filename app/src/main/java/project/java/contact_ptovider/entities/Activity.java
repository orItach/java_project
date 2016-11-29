package project.java.contact_ptovider.entities;

import java.util.Date;

import project.java.contact_ptovider.Description;

/**
 * Created by אור איטח on 28/11/2016.
 */

public class Activity
{
    Description description;
    String countryName;
    Date startDate;
    Date endDate;
    int price;
    String des;
    long businessID;

    public Activity(Description description, String countryName, Date startDate, Date endDate, int price, String des, long businessID) {
        this.description = description;
        this.countryName = countryName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.des = des;
        this.businessID = businessID;
    }

    //region get and set
    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public long getBusinessID() {
        return businessID;
    }

    public void setBusinessID(long businessID) {
        this.businessID = businessID;
    }
    //endregion

}
