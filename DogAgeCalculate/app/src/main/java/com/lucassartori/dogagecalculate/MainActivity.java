package com.lucassartori.dogagecalculate;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class MainActivity extends AppCompatActivity {

    private static final Integer DOG_FACTOR = 7;
    TextView dogAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnCalculate(View view) {
        this.dogAge = findViewById(R.id.txtAge);
        String age = this.dogAge.getText().toString();
        if (age.isEmpty()) {
            this.errorMessage();
        } else {
            int finalAge = Integer.parseInt(age) * DOG_FACTOR;
            this.successMessage(finalAge);
        }
    }

    private void errorMessage() {
        new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Oops...")
                .setContentText("Por favor informe os anos do cão")
                .show();
    }

    private void successMessage(int finalAge) {
        new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Sucesso")
                .setContentText("A idade calculada para o seu cão é: "+finalAge)
                .show();
    }
}
