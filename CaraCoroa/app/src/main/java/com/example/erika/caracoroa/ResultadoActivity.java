package com.example.erika.caracoroa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.Toast;

public class ResultadoActivity  extends Activity {

    ImageView imgResultado;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
        imgResultado = findViewById(R.id.resultado_img);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int r = bundle.getInt("resultado");
        if(r == 0){
            imgResultado.setImageResource(R.mipmap.cara_foreground);
        }else{
            imgResultado.setImageResource(R.mipmap.coroa_background);
        }
    }



}
