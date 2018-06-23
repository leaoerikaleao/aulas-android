package com.example.erika.provapdm.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.erika.provapdm.R;
import com.example.erika.provapdm.R;

import java.util.List;

import com.example.erika.provapdm.model.Produto;


public class ProdutoAdapter  extends BaseAdapter {

    private final List<Produto> produtos;
    private final Activity act;

    public ProdutoAdapter(List<Produto> produtos, Activity act) {
        this.produtos = produtos;
        this.act = act;
    }

    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Object getItem(int position) {
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_act, parent, false);
        Produto produto = produtos.get(position);


        TextView nome = view.findViewById(R.id.produtoNome);
        TextView descricao = view.findViewById(R.id.produtoDescricao);

        nome.setText(produto.getNome());
        descricao.setText(produto.getDescricao());
        return view;
    }
}
