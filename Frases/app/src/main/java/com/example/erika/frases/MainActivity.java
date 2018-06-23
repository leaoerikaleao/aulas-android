package com.example.erika.frases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewFrases;
    private ArrayList<String> frases = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewFrases = findViewById(R.id.txtFrases);

    }



    public void btnGerarFrases(View view){
        Random random =  new Random();
        frases.add("Se você encontrar um caminho sem obstáculos, ele provavelmente não leva a lugar nenhum.");
        frases.add("Se você encontrar um caminho sem obstáculos, ele provavelmente não leva a lugar nenhum.");
        frases.add("Ninguém faz cadeados sem chaves. Do mesmo modo, Deus não dá problemas sem soluções.");
        frases.add("Honestidade é um presente muito caro. Não espere isso de pessoas baratas.");
        frases.add("Nunca tenha certeza de nada porque a sabedoria começa com a dúvida.");
        frases.add("Faça o que for necessário para ser feliz. Mas não se esqueça que a felicidade é um sentimento simples, você pode encontrá-la e deixá-la ir embora por não perceber sua simplicidade.");
        frases.add("Que o vento leve o necessário e me traga o suficiente.");
        frases.add("Algumas vezes coisas ruins acontecem em nossas vidas para nos colocar na direção das melhores coisas que poderíamos viver.");

        this.textViewFrases.setText(frases.get(random.nextInt(frases.size())));

    }
}
