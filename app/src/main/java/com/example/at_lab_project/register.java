package com.example.at_lab_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ImageView backgroundImg = (ImageView) findViewById(R.id.background_image);
        backgroundImg.setImageResource(R.drawable.kids1);
        Button register_button=findViewById(R.id.register_button);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(), "Registered successfully!!!", Toast.LENGTH_SHORT);
                t.show();

                Intent intent = new Intent(register.this, login.class);
                startActivity(intent);
            }
        });
    }
}