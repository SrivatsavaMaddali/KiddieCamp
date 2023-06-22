package com.example.at_lab_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class register extends AppCompatActivity {
    SQLiteDatabase mydatabase;
String user="";
String passs="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mydatabase = openOrCreateDatabase("Project", MODE_PRIVATE, null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS child(Username VARCHAR not null,Password VARCHAR not null, Name VARCHAR, Parent_number VARCHAR, age VARCHAR,email VARCHAR);");
        Button register=findViewById(R.id.register);
        EditText email=findViewById(R.id.emails);
        EditText phone=findViewById(R.id.phones);
        EditText sname=findViewById(R.id.sname);
        EditText age=findViewById(R.id.age);
        EditText username=findViewById(R.id.username);
        EditText password=findViewById(R.id.password);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user=username.getText().toString();
                passs=password.getText().toString();
                String ag=age.getText().toString();
                String sn=sname.getText().toString();
                String ph=phone.getText().toString();
                String em=email.getText().toString();
                SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

// Get SharedPreferences editor
                SharedPreferences.Editor editor = sharedPreferences.edit();

// Put the value of the variable in SharedPreferences
                editor.putString("user", username.getText().toString());
                editor.putString("passs", password.getText().toString());
                editor.putString("age",ag);
                editor.putString("sname",sn);
                editor.putString("phone",ph);
                editor.putString("email",em);
// Apply changes
                editor.apply();
                mydatabase.execSQL("INSERT INTO child(Username,Password,Name, Parent_number, age,email )VALUES('" + username.getText().toString() + "','" + password.getText().toString() + "','" +sn + "','" + ph+ "','" + ag + "','" + em + "');");

                Toast t = Toast.makeText(getApplicationContext(), "Registered successfully!!!", Toast.LENGTH_SHORT);
                t.show();

                Intent intent = new Intent(register.this, login.class);
                startActivity(intent);
            }
        });
        ImageView backgroundImg = (ImageView) findViewById(R.id.background_image);
        backgroundImg.setImageResource(R.drawable.kids1);

    }
}