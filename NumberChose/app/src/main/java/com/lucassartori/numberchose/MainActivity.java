package com.lucassartori.numberchose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final int MAX_NUMBER = 11;
    private TextView randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumber = findViewById(R.id.txtNumber);
    }

    public void btnRandomNumber(View view){
        Random random = new Random();
        this.randomNumber.setText(""+random.nextInt(MAX_NUMBER));
    }

}
