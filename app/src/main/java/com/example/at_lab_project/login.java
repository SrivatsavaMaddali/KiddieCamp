package com.example.at_lab_project;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.database.Cursor;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;
public class login extends register {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageView backgroundImg = (ImageView) findViewById(R.id.background_image);
        backgroundImg.setImageResource(R.drawable.kids1);

        EditText username=findViewById(R.id.username);
        EditText password=findViewById(R.id.password);
        Button login_button=findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor = mydatabase.rawQuery("SELECT * FROM child WHERE Username = '" + username.getText().toString() + "'", null);
                if(cursor.getCount()==0){
                    Toast.makeText(login.this,"Username doesn't exist!!!!!",Toast.LENGTH_SHORT).show();

                }
                if (cursor.moveToFirst()) {
                    // entry exists
                    String pass = "";
                    int passIndex = cursor.getColumnIndex("Password");
                    if (passIndex >= 0) {
                        pass = cursor.getString(passIndex);
                    }
                    System.out.println(pass);
                    String enteredpass =password.getText().toString();
                    if (pass.equals(enteredpass)) {
                        // Get SharedPreferences object
                        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

// Get SharedPreferences editor
                        SharedPreferences.Editor editor = sharedPreferences.edit();

// Put the value of the variable in SharedPreferences
                        editor.putString("user", username.getText().toString());
                        editor.putString("passs", password.getText().toString());
// Apply changes
                        editor.apply();
                        Toast t = Toast.makeText(getApplicationContext(), "Login successful!!!", Toast.LENGTH_SHORT);
                        t.show();

                        Intent intent = new Intent(login.this, dashboard.class);
                        startActivity(intent);
                    }

                    else {
                        Toast.makeText(login.this, "Wrong Password!!!!!", Toast.LENGTH_SHORT).show();
                    }
                }}});


    }
}
