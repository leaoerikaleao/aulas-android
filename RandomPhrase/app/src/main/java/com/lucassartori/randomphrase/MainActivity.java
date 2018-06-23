package com.lucassartori.randomphrase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewPhrases;
    private ArrayList<String> phrases = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textViewPhrases = findViewById(R.id.txtPhrases);
        this.generatePhrase();
    }

    public void btnRandomPhrase(View view){
        Random random = new Random();
        this.textViewPhrases.setText(this.phrases.get(random.nextInt(this.phrases.size())));
    }

    private void generatePhrase(){
        for(int i = 0; i < 10; i ++){
            this.phrases.add("FRASE: "+i);
        }
    }
}
