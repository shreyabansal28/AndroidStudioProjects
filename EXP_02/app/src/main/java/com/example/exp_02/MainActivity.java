package com.example.exp_02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Hello World", Toast.LENGTH_SHORT).show();
         TextView edt1=(TextView) findViewById(R.id.text1);
        edt1.setBackgroundColor(0xFF12FF45);
        findViewById(R.id.text2);
    }
}