package com.example.mantras;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class HanumanChalisa extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanuman_chalisa);
        mediaPlayer = MediaPlayer.create(this,R.raw.hanuman);
    }
    public void playHanuman(View v){
        mediaPlayer.start();
    }
    public void pauseHanuman(View v){
        mediaPlayer.pause();
    }
}