package com.example.erika.provapdm.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.example.erika.provapdm.R;
import com.example.erika.provapdm.adapter.ProdutoAdapter;
import com.example.erika.provapdm.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edNome;
    EditText edDescricao;
    Spinner spUnidade;
    String unidade;
    Switch swPromocao;
    String promocao;
    RadioGroup rgPerecivel;
    List<Produto> produtos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSpinnerUnidade();
        edNome = findViewById(R.id.edNome);
        edDescricao = findViewById(R.id.edDescricao);
        produtos = new ArrayList<>();
        Button btCadastrar = (Button) findViewById(R.id.button);
        try {
            Produto produto = (Produto) getIntent().getExtras().getSerializable("produto");
            produtos.add(produto);
        } catch (Exception e) {
        }
        produtos.addAll(todosProdutos());


        ListView listaProdutos = (ListView) findViewById(R.id.lista);

        ProdutoAdapter adapter = new ProdutoAdapter(produtos, this);

        listaProdutos.setAdapter(adapter);


        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edNome = findViewById(R.id.edNome);
                edDescricao = findViewById(R.id.edDescricao);
                spUnidade = findViewById(R.id.spUnidade);
                spUnidade = (Spinner) findViewById(R.id.spUnidade);
                unidade = spUnidade.getSelectedItem().toString();
                rgPerecivel = (RadioGroup) findViewById(R.id.rgPerecivel);

                swPromocao = (Switch) findViewById(R.id.swPromocao);
                swPromocao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            promocao = "Produto em Promoção";
                        } else {
                            promocao = "Produto sem Produção";
                        }
                    }
                });

                if (edNome.getText().toString().trim().length() == 0 || edDescricao.getText().toString().trim().length() == 0) {
                    Toast.makeText(MainActivity.this, "Existem campos em branco! Insira valores válidos!",
                            Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    Produto produto = new Produto(edNome.getText().toString(), edDescricao.getText().toString(), unidade, "Sim", promocao);
                    produtos.add(produto);
                    intent.putExtra("produto", produto);
                    startActivity(intent);


                }


            }

        });


    }

    public void setSpinnerUnidade() {
        Spinner spinner = (Spinner) findViewById(R.id.spUnidade);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.unidades, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    private List<Produto> todosProdutos() {
        ArrayList<Produto> list = new ArrayList<>();
        list.add(new Produto("Macarrão", "Com ovos", "Gramas", "Não", "Sim"));
        list.add(new Produto("Feijão", "Carioca", "Quilograma", "Não", "Sim"));
        return list;
    }


}
