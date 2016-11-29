package project.java.contact_ptovider.datasorce;

import android.content.ContentValues;
import android.database.Cursor;

import java.util.ArrayList;

import project.java.contact_ptovider.backend.IDataSource;
import project.java.contact_ptovider.entities.*;
import project.java.contact_ptovider.entities.Activity;

/**
 * Created by אור איטח on 28/11/2016.
 */

public class ListDsManager implements IDataSource
{
   private static ArrayList<Business> BusList=new ArrayList<Business>(5);
   private static ArrayList<android.app.Activity> ActList=new ArrayList<android.app.Activity>(5);
   private static ArrayList<User> UserList =new ArrayList<User>(5);


    @Override
    public void addBusiness(ContentValues business)
    {
        business.putAll(business);
        return true;
    }

    @Override
    public Cursor getBusiness() {
        return null;
    }

    @Override
    public boolean addActivity(ContentValues activity)
    {
        return true;
    }

    @Override
    public Cursor getActivity() {
        return null;
    }

    @Override
    public boolean addUser(ContentValues user)
    {
        return true;
    }

    @Override
    public Cursor getUser() {
        return null;
    }
}
