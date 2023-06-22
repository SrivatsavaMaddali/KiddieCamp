package com.example.at_lab_project;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class animals extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        ImageView bear=findViewById(R.id.bear);
        bear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                    stb.append("BEAR:\nBear eats fish and honey...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Bear information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bear);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        ImageView camel=findViewById(R.id.camel);
        camel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("CAMEL:\nCamel drinks water and eats leaves...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Camel information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.camel);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        ImageView deer=findViewById(R.id.deer);
        deer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("DEER:\nDeer eats grass...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Deer information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.deer);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        ImageView ele=findViewById(R.id.elephant);
        ele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("Elephant:\nElephant eats grass and sugarcanes...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Elephant information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.elephant);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        ImageView fox=findViewById(R.id.fox);
        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("FOX:\nFox eats squirrels and rabbits...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Fox information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fox);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        ImageView gif=findViewById(R.id.gireffe);
        gif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("GIRAFFE:\nGiraffe eats grass and leaves of tall piny trees...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Giraffe information:");
                builder.setMessage(stb.toString());
                builder.show();

            }
        });
        ImageView hippo=findViewById(R.id.hippo);
        hippo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("HIPPO:\nHippo eats fish and deer...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Hippo information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hippo);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        ImageView lion=findViewById(R.id.lion);
       lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("LION:\nLion eats deer and other animals...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Lion information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lion);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });

        ImageView monkey=findViewById(R.id.monkey);
       monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("MONKEY:\nMonkey eats bananas...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Monkey information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.monkey);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        ImageView rhino=findViewById(R.id.rhino);
       rhino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("RHINO:\nRhino eats grass and leaves...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Rhino information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rhino);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        ImageView zebra=findViewById(R.id.zebra);
        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("ZEBRA:\nZebra eats grass....");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Zebra information:");
                builder.setMessage(stb.toString());
                builder.show();

            }
        });
        ImageView tiger=findViewById(R.id.tiger);
        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer stb=new StringBuffer();
                stb.append("TIGER:\nTiger eats deer and other animals...");




                AlertDialog.Builder builder=new AlertDialog.Builder(animals.this);
                builder.setCancelable(true);
                builder.setTitle("Tiger information:");
                builder.setMessage(stb.toString());
                builder.show();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tiger);

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
    }
}