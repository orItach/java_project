package project.java.contact_ptovider.datasorce;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

import java.util.HashMap;

import javax.sql.DataSource;

import project.java.contact_ptovider.backend.IDataSource;
import project.java.contact_ptovider.backend.ManagerFactory;
import project.java.contact_ptovider.entities.Business;

/**
 * Created by אור איטח on 28/11/2016.
 */

public class ContentProvide extends ContentProvider  //inerited from CO Prov
{
    //static final String PROVIDER_NAME = "java.project.java.contact_ptovider.datasource.ContentProvide";
    //static final String URL = "content://" + PROVIDER_NAME + "/cte";
    //static final Uri CONTENT_URI = Uri.parse(URL);

    private static final UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
    private static IDataSource manager = ManagerFactory.DataSource(1);


    //static final UriMatcher uriMatcher;
    //private static HashMap<String, String> values;
    //static {
    //    uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
    //    uriMatcher.addURI(PROVIDER_NAME, "cte", uriCode);
    //    uriMatcher.addURI(PROVIDER_NAME, "cte/*", uriCode);
    //}

    static {
        sUriMatcher.addURI("com.android.app.java.project.java.contact_ptovider.datasorce.ListDsManager", "BusList", 1);
        sUriMatcher.addURI("com.android.app.java.project.java.contact_ptovider.datasorce.ListDsManager", "ActList", 2);
        sUriMatcher.addURI("com.android.app.java.project.java.contact_ptovider.datasorce.ListDsManager", "UserList", 3);
    }


    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder)
    {
        String table = uri.getPath().substring(1);
        if (table.equalsIgnoreCase("BusList"))
        {
            try
            {
                return manager.getBusiness();
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
        if (table.equalsIgnoreCase("ActList"))
        {
            try
            {
                return manager.getActivity();
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
        if (table.equalsIgnoreCase("UserList"))
        {
            try
            {
                return manager.getUser();
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }



    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values)
    {
        String table = uri.getPath().substring(1);
        if (table.equalsIgnoreCase("BusList")) {
            manager.addBusiness(values);
            return null;
        }
        if(table.equalsIgnoreCase("ActList")){
            manager.addActivity(values);
            return null;
        }
        if(table.equalsIgnoreCase("UserList")){
            manager.addUser(values);
            return null;
        }

        throw new IllegalArgumentException("This Content Provider supports only trips insertion");
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
