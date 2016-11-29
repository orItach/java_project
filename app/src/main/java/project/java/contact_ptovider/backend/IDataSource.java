package project.java.contact_ptovider.backend;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;

import project.java.contact_ptovider.entities.Business;
import project.java.contact_ptovider.entities.User;

/**
 * Created by אור איטח on 28/11/2016.
 */

public interface IDataSource
{
    public boolean addBusiness(ContentValues business);

    public Cursor getBusiness();

    public boolean addActivity(ContentValues activity);

    public Cursor getActivity();

    public boolean addUser(ContentValues user);

    public Cursor getUser();

}
