package com.example.mantras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openShivTandav(View v){
        Intent intent = new Intent(this,ShivTandav.class);
        startActivity(intent);
    }
    public void openHanumanChalisa(View v){
        Intent intent = new Intent(this, HanumanChalisa.class);
        startActivity(intent);
    }
}