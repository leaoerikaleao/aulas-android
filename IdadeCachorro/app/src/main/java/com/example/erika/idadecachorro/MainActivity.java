package com.example.erika.idadecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final Integer IDADE_CALC = 7;
    EditText edIdade;
    Integer idadeReal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edIdade = findViewById(R.id.edIdade);
        Button btEntrar = (Button) findViewById(R.id.btCalcular);


        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idadeReal = Integer.parseInt(String.valueOf(edIdade.getText()))  * IDADE_CALC ;
                Toast.makeText(MainActivity.this, "A idade é real do cachorro é  " + idadeReal,
                        Toast.LENGTH_LONG).show();
            }
        });
    }


}
