package project.java.contact_ptovider.datasorce;

import android.content.ContentValues;
import android.database.Cursor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import project.java.contact_ptovider.Description;
import project.java.contact_ptovider.backend.IDataSource;
import project.java.contact_ptovider.entities.*;


/**
 * Created by אור איטח on 28/11/2016.
 */

public class ListDsManager implements IDataSource
{
   private boolean busCount =true;
   private boolean actCount =true;
   private boolean userCount =true;
   private static ArrayList<Business> BusList=new ArrayList<Business>(5);
   private static ArrayList<Activity> ActList=new ArrayList<Activity>(5);
   private static ArrayList<User> UserList =new ArrayList<User>(5);


    @Override
    public boolean addBusiness(ContentValues business)
    {
        busCount =false;
       return BusList.add(new Business(
               business.getAsLong("ID"),
               business.getAsString("name"),
               business.getAsString("country"),
               business.getAsString("city"),
               business.getAsString("street"),
               business.getAsString("phoneNum"),
               business.getAsString("email"),
               business.getAsString("link")
       ));
    }

    @Override
    public Cursor getBusiness()
    {
        return (Cursor) BusList;
    }

    @Override
    public boolean addActivity(ContentValues activity)
    {
        try {
            SimpleDateFormat format =new SimpleDateFormat("dd/MM/yyyy");
            return ActList.add(new Activity(
                    (Description.values()[activity.getAsInteger("description")]),
                    activity.getAsString("countryName"),
                    format.parse(activity.getAsString("startDate")),
                    format.parse(activity.getAsString("endDate")),
                    activity.getAsInteger("price"),
                    activity.getAsString("des"),
                    activity.getAsLong("businessID")
            ));

        }
        catch (ParseException e)
        {

        }
        return true;
    }

    @Override
    public Cursor getActivity() {
        return null;
    }

    @Override
    public boolean addUser(ContentValues user)
    {
        return UserList.add(new User(
                user.getAsLong("userNum"),
                user.getAsString("name"),
                user.getAsString("password"),
                user.getAsBoolean("authorization")
        ));
    }

    @Override
    public Cursor getUser() {
        return null;
    }
    public boolean busUpdate()
    {
        if (busCount)
        {
            return true;//update
        }
        busCount =true;
        return false;//not update
    }
    public boolean actUpdate()
    {
        if (busCount)
        {
            return true;//update
        }
        busCount =true;
        return false;//not update
    }

}
