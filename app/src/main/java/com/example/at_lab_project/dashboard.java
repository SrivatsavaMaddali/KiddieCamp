package com.example.at_lab_project;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.cardview.widget.CardView;
        import androidx.core.app.ActivityCompat;
        import androidx.core.content.ContextCompat;

        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.Manifest;

public class dashboard extends AppCompatActivity {


    private static final int REQUEST_CALL_PHONE_PERMISSION = 1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ImageView backgroundImg = (ImageView) findViewById(R.id.background_image);
        backgroundImg.setImageResource(R.drawable.kids1);
        CardView logout=findViewById(R.id.cardLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, MainActivity.class);
                startActivity(intent);
            }
        });
        CardView about=findViewById(R.id.cardAbout);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, about.class);
                startActivity(intent);
            }
        });

        CardView animals=findViewById(R.id.cardAnimals);
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, animals.class);
                startActivity(intent);
            }
        });

        CardView colorss=findViewById(R.id.cardColors);
        colorss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, colorss.class);
                startActivity(intent);
            }
        });


        CardView alph=findViewById(R.id.cardAlphabets);
        alph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, alph.class);
                startActivity(intent);
            }
        });

        CardView shapes=findViewById(R.id.cardShapes);
        shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, shapes.class);
                startActivity(intent);
            }
        });

        CardView numbers=findViewById(R.id.cardNumbers);
       numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, numbers.class);
                startActivity(intent);
            }
        });

        CardView maths=findViewById(R.id.cardMaths);
       maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, maths.class);
                startActivity(intent);
            }
        });
        CardView profile=findViewById(R.id.cardProfile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, profile.class);
                startActivity(intent);
            }
        });
        CardView rhymes=findViewById(R.id.cardRhymes);
        rhymes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, rhymes.class);
                startActivity(intent);
            }
        });

Button call=findViewById(R.id.sos_button);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeSosCall();
            }
        });
    }
    private void makeSosCall() {
        String phoneNumber = "tel:" + "+916309626907"; // Replace with the desired phone number, including country code
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse(phoneNumber));

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL_PHONE_PERMISSION);
        } else {
            startActivity(callIntent);
        }
        String smsPhoneNumber = "sms:" + "+916309626907"; // Replace with the desired phone number, including country code
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
        smsIntent.setData(Uri.parse(smsPhoneNumber));
        smsIntent.putExtra("sms_body", "I have a doubt"); // Replace with the desired message

        startActivity(smsIntent);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL_PHONE_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                makeSosCall();
            }
        }
    }
}