package com.example.at_lab_project;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class rhymes extends AppCompatActivity {

    private VideoView videoView,videoView1,videoView2;
    private MediaController mediaController,mediaController1,mediaController2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhymes);

        videoView = findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        videoView1 = findViewById(R.id.videoView1);
        mediaController1 = new MediaController(this);
        mediaController1.setAnchorView(videoView1);

//        videoView2 = findViewById(R.id.videoView2);
//        mediaController2 = new MediaController(this);
//        mediaController2.setAnchorView(videoView2);

        Button playVideoButton = findViewById(R.id.playVideoButton);
        playVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playVideo();
            }
        });

        Button playVideoButton1 = findViewById(R.id.playVideoButton1);
        playVideoButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playVideo1();
            }
        });
//        Button playVideoButton2 = findViewById(R.id.playVideoButton2);
//        playVideoButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                playVideo2();
//            }
//        });
    }

    private void playVideo() {
        // Replace the path with the path of your local video file
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.baa;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();
        videoView.start();
    }
    private void playVideo1() {
        // Replace the path with the path of your local video file
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.johny;
        Uri uri = Uri.parse(videoPath);
        videoView1.setVideoURI(uri);
        videoView1.setMediaController(mediaController1);
        videoView1.requestFocus();
        videoView1.start();
    }


}