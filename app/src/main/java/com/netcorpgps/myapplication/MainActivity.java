package com.netcorpgps.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is commit in localbranch
        //These comments should be in branch one
        //incheckout
        //This is 2nd commit for mylocalbranch

    }
    public void mytest(){
        //test
    }
}