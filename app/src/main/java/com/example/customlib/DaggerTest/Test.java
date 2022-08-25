package com.example.customlib.DaggerTest;


import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class Test {


    @Inject
    Test() {

    }

    public void testFun() {

        Log.d("testFun","called");
    }
}
