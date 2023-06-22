package com.example.at_lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;
public class numbers extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    private VideoView videoView;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        videoView = findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);




        Button playVideoButton = findViewById(R.id.playVideoButton);
        playVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the path with the path of your local video file
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoplayback;
                Uri uri = Uri.parse(videoPath);
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaController);
                videoView.requestFocus();
                videoView.start();
                    }
                });


    ImageView one=findViewById(R.id.one);
    one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.one);//chnage this to play only a apple

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });

        ImageView twenty=findViewById(R.id.twenty);
        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.twenty);//chnage this to play only a apple

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        ImageView thirty=findViewById(R.id.thirty);
        thirty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.thirty);//chnage this to play only a apple

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