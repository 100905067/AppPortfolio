package com.amritapritam.www.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.firstProj);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.secProj);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.thirdProj);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.fourthProj);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.fifthProj);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.sixthProj);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String msg = "This button will launch my ";
        switch (v.getId()){
            case  R.id.firstProj:
                Toast.makeText(getApplicationContext(),msg+"Popular Movies Project",Toast.LENGTH_LONG).show();
                break;
            case R.id.secProj:
                Toast.makeText(getApplicationContext(),msg+"Stock Hawk Project",Toast.LENGTH_LONG).show();
                break;
            case R.id.thirdProj:
                Toast.makeText(getApplicationContext(),msg+"Build It Bigger Project",Toast.LENGTH_LONG).show();
                break;
            case R.id.fourthProj:
                Toast.makeText(getApplicationContext(),msg+"Make Your App Material Project",Toast.LENGTH_LONG).show();
                break;
            case R.id.fifthProj:
                Toast.makeText(getApplicationContext(),msg+"Go Ubiquitous Project",Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(getApplicationContext(),msg+"Capstone Project",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
