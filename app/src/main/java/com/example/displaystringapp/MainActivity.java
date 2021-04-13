package com.example.displaystringapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //the following method will be called (run) when the button is click
    public void displayStrings(View view){
        TextView str1 = (TextView) findViewById(R.id.strOne);
        TextView str2 = (TextView) findViewById(R.id.strTwo);
        str1.setText("Diploma in IT");
        str2.setText("Group IT5Y - Apps Class");

    }
}