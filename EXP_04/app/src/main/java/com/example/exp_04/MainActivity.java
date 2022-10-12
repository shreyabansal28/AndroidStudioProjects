package com.example.exp_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String tag = "Event";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag, "onCreate...");
       // Toast.makeText(MainActivity.this, "onCreate...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart...");
        Toast.makeText(MainActivity.this, "onStart...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart...");
        //Toast.makeText(MainActivity.this, "onRestart...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause...");
       // Toast.makeText(MainActivity.this, "onPause...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop...");
        //Toast.makeText(MainActivity.this, "onStop...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume...");
        //Toast.makeText(MainActivity.this, "onResume...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy...");
        //Toast.makeText(MainActivity.this, "onDestroy...", Toast.LENGTH_SHORT).show();
    }
}
