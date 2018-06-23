package com.example.erika.mediafinal;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Erika on 11/04/2018.
 */

public class CalcularMediaActivity extends Activity {

    private EditText n1;
    private EditText n2;
    private EditText n3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular_media_activity);
        this.n1 = findViewById(R.id.edNota1);
        this.n2 = findViewById(R.id.edNota2);
        this.n3 = findViewById(R.id.edNota3);
    }

    public void btCalcular(View view){
        Double resultado = (Double.valueOf(n1.getText().toString()) +  Double.valueOf(n2.getText().toString()) +
                Double.valueOf(n3.getText().toString())) / 3;
        Toast.makeText(CalcularMediaActivity.this, "A média é  " + resultado ,
                Toast.LENGTH_LONG).show();
    }

}
