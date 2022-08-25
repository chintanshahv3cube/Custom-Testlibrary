package com.example.customlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.customlib.DaggerTest.DaggerTestInterFace;
import com.example.customlib.DaggerTest.Test;
import com.example.customlib.DaggerTest.TestInterFace;

public class CustomTestMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity_main);

        Toast.makeText(this, "main testing", Toast.LENGTH_SHORT).show();

        String data="testing";
        TestInterFace component= DaggerTestInterFace.create();
        Test testObj=component.getTest();
        testObj.testFun();





    }


    private void MainFun() {

    }

    private void TestFun()
    {
        Toast.makeText(this, "This is Test", Toast.LENGTH_SHORT).show();
    }


    private void fun1()
    {

    }

    private void fun2()
    {

    }



}