package com.example.customlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import com.example.customlib.DaggerTest.DaggerTestInterFace;
import com.example.customlib.DaggerTest.DaggerTestInterface2;
import com.example.customlib.DaggerTest.Test;
import com.example.customlib.DaggerTest.Test1;
import com.example.customlib.DaggerTest.Test2;
import com.example.customlib.DaggerTest.Test3;
import com.example.customlib.DaggerTest.TestInterFace;
import com.example.customlib.DaggerTest.TestInterface2;

public class CustomTestMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity_main);

        Toast.makeText(this, "main testing", Toast.LENGTH_SHORT).show();

        String data = "testing";
        //simple dagger using inject & Components
        TestInterFace component = DaggerTestInterFace.create();
        Test testObj = component.getTest();
        testObj.testFun();

        // using module & Providers
        TestInterface2 component2 = DaggerTestInterface2.builder().test3(new Test3(new Test1(), new Test2())).build();
        Test testObj1 = component2.getTest();

        component2.getTest1().testFun();
        component2.getTest2().testFun();


    }


    private void MainFun() {

    }

    private void TestFun() {
        Toast.makeText(this, "This is Test", Toast.LENGTH_SHORT).show();
    }


    private void fun1() {

    }

    private void fun2() {

    }


}