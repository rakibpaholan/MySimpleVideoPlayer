package com.example.playvideopractice;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private VideoView videoView;
    private Button btnId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoId);
        btnId = (Button) findViewById(R.id.btnId);
        btnId.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (btnId.getId()==R.id.btnId){

            Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.aphamarijanbangaye);
            videoView.setVideoURI(uri);
            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            videoView.start();
        }
    }
}