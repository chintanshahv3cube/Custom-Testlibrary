package com.example.customlibrary;

import android.content.Context;
import android.widget.Toast;

public class CustomModelTest {

    public static void callToast(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
