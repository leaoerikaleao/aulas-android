package com.example.erika.servicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void starService(View View){
        Intent intent = new Intent(TESTE_SERVICE);
        intent.setPackage("");
        startService(intent);
    }


    public void stopService(View View){
        Intent intent = new Intent(TESTE_SERVICE);
        intent.setPackage("");
        startService(intent);
    }
}
