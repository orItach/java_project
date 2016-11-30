package project.java.contact_ptovider.backend;

import java.sql.SQLData;

import project.java.contact_ptovider.datasorce.ListDsManager;

/**
 * Created by אור איטח on 28/11/2016.
 */

public class ManagerFactory//implemnt singeltone
{
    public static IDataSource DataSource (int sourceType){
        switch (sourceType)
        {
            case 1:
                return  new ListDsManager();
            default:
                return null;
        }
    }
}
