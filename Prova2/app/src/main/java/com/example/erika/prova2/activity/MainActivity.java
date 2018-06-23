package com.example.erika.prova2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.example.erika.prova2.R;
import com.example.erika.prova2.model.Pedido;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edNome;
    Spinner spPrato;
    Spinner spBebida;
    String prato;
    String bebida;
    Double valorBebida;
    Double valorPrato;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSpinnerPrato();
        setSpinnerBebida();

        Button btPedido = (Button) findViewById(R.id.btPedido);

        btPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNome = findViewById(R.id.edNome);
                spPrato = (Spinner) findViewById(R.id.spPrato);
                prato = spPrato.getSelectedItem().toString();

                spBebida = (Spinner) findViewById(R.id.spBebida);
                bebida = spBebida.getSelectedItem().toString();


                if (edNome.getText().toString().trim().length() == 0) {
                    Toast.makeText(MainActivity.this, "Insira o Nome do Cliente!",
                            Toast.LENGTH_LONG).show();
                } else {

                    valorBebida();
                    valorPrato();
                    Pedido pedido = new Pedido(bebida,valorBebida,prato, valorPrato, edNome.getText().toString() );
                    Intent intent = new Intent(MainActivity.this, PedidoActivity.class);
                    intent.putExtra("pedido", pedido);
                    startActivity(intent);

                }




            }

        });


    }


    public void setSpinnerPrato() {
        Spinner spinner = (Spinner) findViewById(R.id.spPrato);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pratos, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    public void setSpinnerBebida() {
        Spinner spinner = (Spinner) findViewById(R.id.spBebida);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.bebidas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public Double valorBebida(){
        switch (bebida) {
            case "Vinho Tinto":
                return valorBebida = 60.1;
            case "Vinho Branco":
                return valorBebida = 50.1;
        }
        return null;
    };

    public Double valorPrato(){
        switch (prato) {
            case "Escondidinho":
                return valorPrato = 70.1;
            case "Strogonoff":
                return valorPrato = 100.1;
            case "Conchiglione":
                return valorPrato = 8.1;
        }
        return null;
    };

}
