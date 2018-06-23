package prova1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.erika.prova1.R;

import java.util.ArrayList;

import prova1.model.Produtos;

public class MainActivity extends AppCompatActivity {
        private static  final ArrayList<Produtos> PRODUTOS = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
