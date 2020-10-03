package com.example.hlwrld22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView simple_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.simple_txt = findViewById(R.id.simple_txt);
    }

    public void onBtnChangeTextPress(View view) {
        this.simple_txt.setText("beep beep boop boop");
    }
}