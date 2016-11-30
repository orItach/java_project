package project.java.contact_ptovider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.sql.DataSource;

import project.java.contact_ptovider.backend.IDataSource;
import project.java.contact_ptovider.backend.ManagerFactory;
import project.java.contact_ptovider.datasorce.ListDsManager;

public class Contact_Provider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__provider);
        ManagerFactory mf =new ManagerFactory();
    }
}
