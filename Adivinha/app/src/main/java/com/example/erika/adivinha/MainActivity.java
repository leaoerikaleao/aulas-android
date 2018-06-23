package com.example.erika.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final int MAX_NUMBER = 11;
    private TextView txtNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btEntrar = (Button) findViewById(R.id.btGerarNumero);
        txtNumero = findViewById(R.id.txtNumero);

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                txtNumero.setText(""+random.nextInt(MAX_NUMBER));
            }
        });



    }
}
