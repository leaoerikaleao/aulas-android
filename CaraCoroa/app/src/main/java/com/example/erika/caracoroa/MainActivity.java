package com.example.erika.caracoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     static String RESULT_INTENT = "resultado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view){

        Bundle bundle = new Bundle();
        bundle.putInt("resultado", resultado());
        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private int resultado() {
        Random random = new Random();
        int  resultado =  random.nextInt(2);
        return resultado;

    }
}
