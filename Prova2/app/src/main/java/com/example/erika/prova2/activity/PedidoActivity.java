package com.example.erika.prova2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.erika.prova2.R;
import com.example.erika.prova2.model.Pedido;

public class PedidoActivity  extends Activity {

    TextView txNome;
    TextView txBebida;
    TextView txPrato;
    TextView txValorBebida;
    TextView txValorPrato;
    TextView txTotal;
    Double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedido_act);
        Pedido pedido = (Pedido) getIntent().getExtras().getSerializable("pedido");

        txNome = findViewById(R.id.txNome);
        txNome.setText(pedido.getNome());

        txBebida= findViewById(R.id.txBedida);
        txBebida.setText(pedido.getBebida());

        txValorBebida= findViewById(R.id.txValorBebida);
        txValorBebida.setText(pedido.getValorBebida().toString());

        txPrato= findViewById(R.id.txPrato);
        txPrato.setText(pedido.getPrato());

        txValorPrato= findViewById(R.id.txValorPrato);
        txValorPrato.setText(pedido.getValorPrato().toString());

        txTotal= findViewById(R.id.txTotal);
        txTotal.setText(pedido.total().toString());









    }
}
