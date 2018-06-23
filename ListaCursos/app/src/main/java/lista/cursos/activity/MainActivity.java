package lista.cursos.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.ListView;

import com.example.erika.listacursos.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lista.cursos.adapter.CursoAdapter;
import lista.cursos.model.Categoria;
import lista.cursos.model.Curso;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Curso> cursos = todosOsCursos();

        ListView listaDeCursos = (ListView) findViewById(R.id.listaCurso);

        //chamada da implementaçao do android:
        //ArrayAdapter<Curso> adapter = new ArrayAdapter<Curso>(this,
        //android.R.layout.simple_list_item_1, cursos);

        //chamada da nossa implementação
        CursoAdapter adapter = new CursoAdapter(cursos, this);

        listaDeCursos.setAdapter(adapter);

    }

    private List<Curso> todosOsCursos() {
        return new ArrayList<>(Arrays.asList(
                new Curso("Java", "básico de Java", Categoria.JAVA),
                new Curso("HTML e CSS", "HTML 5 e suas novidades", Categoria.HTML),
                new Curso("Android", "boas de práticas", Categoria.ANDROID)));
    }
}
