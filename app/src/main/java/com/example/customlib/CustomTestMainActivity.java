package com.example.customlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class CustomTestMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity_main);

        Toast.makeText(this, "main testing", Toast.LENGTH_SHORT).show();

        String data="testing";




    }

    private void mainFun()
    {
        Log.d("Test","MainFun");
    }


}