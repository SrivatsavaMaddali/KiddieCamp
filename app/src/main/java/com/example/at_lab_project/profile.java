package com.example.at_lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class profile extends register {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        String username = sharedPreferences.getString("user", "");

       // Username VARCHAR not null,Password VARCHAR not null, Name VARCHAR, Parent_number VARCHAR, age VARCHAR,email
        Cursor cursor = mydatabase.rawQuery("SELECT * FROM child WHERE Username='" + username + "'", null);

        StringBuffer stb=new StringBuffer();
                while(cursor.moveToNext()){
                    stb.append("Username:"+cursor.getString(0)+"\n");
                    stb.append("Password:"+cursor.getString(1)+"\n");
                    stb.append("Name:"+cursor.getString(2)+"\n");
                    stb.append("Parent Mobile:"+cursor.getString(3)+"\n");
                    stb.append("Age of child:"+cursor.getString(4)+"\n");
                    stb.append("E-Mail:"+cursor.getString(5)+"\n\n");


                }
                AlertDialog.Builder builder=new AlertDialog.Builder(profile.this);
                builder.setCancelable(true);
                builder.setTitle("User Details:");
                builder.setMessage(stb.toString());
                builder.show();



    }
}