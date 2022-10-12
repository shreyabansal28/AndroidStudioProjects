package com.example.tailor_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    String[] size = { "L", "XL", "XXL"};
    String sizeval;
    String gender;
    double cost,length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,size);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        Button buttonSubmit = (Button) findViewById(R.id.button);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.genderid);



        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                RadioButton selectedRadioButton  = (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
                //get RadioButton text
                gender = selectedRadioButton.getText().toString();
                // display it as Toast to the user
                EditText height=(EditText) findViewById(R.id.heightid);
                length= Double.parseDouble(height.getText().toString());
                if(sizeval.equals("L"))
                {
                    if(gender.equals("Male"))
                    {
                        cost=300*length;
                    }
                    else
                    {
                        cost=500*length;
                    }
                }
                else if(sizeval.equals("XL"))
                {
                    if(gender.equals("Male"))
                    {
                        cost=400*length;
                    }
                    else
                    {
                        cost=700*length;
                    }
                }
                else
                {
                    if(gender.equals("Male"))
                    {
                        cost=500*length;
                    }
                    else
                    {
                        cost=900*length;
                    }
                }

                TextView num = (TextView) findViewById(R.id.resultid);
                num.setText(String.valueOf(cost));


            }


        });
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1,int position, long id) {
        sizeval=size[position];

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}
