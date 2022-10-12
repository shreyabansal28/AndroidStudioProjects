package com.example.dice_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText edt1;
    Random myRandom = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b =(Button) findViewById(R.id.but1);
        EditText edt1=(EditText) findViewById(R.id.edt1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt1.setText(String.valueOf(myRandom.nextInt(6)));
            }
        });


    }

}
