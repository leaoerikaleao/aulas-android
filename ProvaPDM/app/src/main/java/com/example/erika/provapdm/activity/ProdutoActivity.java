package com.example.erika.provapdm.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.erika.provapdm.R;
import com.example.erika.provapdm.model.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProdutoActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produto_act);


    }

    private List<Produto> todosProdutos() {
        return new ArrayList<>(Arrays.asList(
                new Produto("Macarrão", "Com ovos", "Gramas", "Não", "Sim"),
                new Produto("Feijão", "Carioca", "Quilograma", "Não", "Sim")
        ));
    }
}
