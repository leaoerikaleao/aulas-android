package lista.cursos.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.erika.listacursos.R;

import java.util.List;

import lista.cursos.model.Categoria;
import lista.cursos.model.Curso;

public class CursoAdapter extends BaseAdapter {

    private final List<Curso> cursos;
    private final Activity act;

    public CursoAdapter (List<Curso> cursos, Activity act) {
        this.cursos = cursos;
        this.act = act;
    }

    @Override
    public int getCount() {
        return cursos.size();
    }

    @Override
    public Object getItem(int position) {
        return cursos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_act, parent, false);
        Curso curso = cursos.get(position);


        TextView nome = view.findViewById(R.id.listaNome);
        TextView descricao = view.findViewById(R.id.listaDescricao);
        ImageView imagem =  view.findViewById(R.id.listaImg);

        nome.setText(curso.getNome());
        descricao.setText(curso.getDescricao());

        Categoria categoria = curso.getCategoria();

      /*  if (categoria.equals(Categoria.JAVA)) {
            imagem.setImageResource(R.drawable.java);
        } else if (categoria.equals(Categoria.ANDROID)) {
            imagem.setImageResource(R.drawable.android);
        } else if (categoria.equals(Categoria.HTML)) {
            imagem.setImageResource(R.drawable.html);
        }*/

        return view;
    }
}
