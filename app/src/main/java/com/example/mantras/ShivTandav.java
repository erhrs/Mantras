package com.example.mantras;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ShivTandav extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiv_tandav);
        mediaPlayer = MediaPlayer.create(this,R.raw.shiv);
    }
    public void playShiv(View v){
        mediaPlayer.start();
    }
    public void pauseShiv(View v){
        mediaPlayer.pause();
    }
}