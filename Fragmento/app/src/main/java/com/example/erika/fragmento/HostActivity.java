package com.example.erika.fragmento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class HostActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activityMainLayout, new SimpleFragment()).commit();
        }
    }
}
