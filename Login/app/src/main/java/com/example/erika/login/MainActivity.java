package com.example.erika.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final static String EMAIL = "erika@erika.com";
    private final static String PWD = "qwerty";

    EditText edEmail;
    EditText edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btEntrar = (Button) findViewById(R.id.btEntrar);

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edEmail = findViewById(R.id.edEmail);
                edPassword = findViewById(R.id.edPassword);
                login();
            }

        });


        }

        private boolean validate() {

            if(edEmail.getText().toString().equals(EMAIL)  && edPassword.getText().toString().equals(PWD)){
                return true;
            }else if(edEmail.getText().toString().trim().length() == 0 || edPassword.getText().toString().trim().length() == 0 ) {
                return false;
            } else{
                return false;
            }
        }

    public void login() {

        if( validate()==true) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this, "Usuário/Senha Inválido!",
                    Toast.LENGTH_LONG).show();
        }

    }
}
