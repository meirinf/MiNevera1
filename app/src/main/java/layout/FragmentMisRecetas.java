package layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import test.minevera.DetallesRecetas;
import test.minevera.R;
import test.minevera.Receta;


public class FragmentMisRecetas extends Fragment {

    public FragmentMisRecetas () {
    }

    private List<Receta> items;
    private RecetasAdapter adapter;
    GridView gvRecetas;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onStart() {
        super.onStart();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Conectamos la vista con el layout
        View view =inflater.inflate(R.layout.fragment_mis_recetas, container, false);


        //Instanciamos la list view
        gvRecetas = (GridView) view.findViewById(R.id.gvRecetas);
        items = new ArrayList<>();
        adapter = new RecetasAdapter (
                getContext(),
                0,
                items);

        gvRecetas.setAdapter(adapter);

        // Al pulsar en una posicion del listView se ejecuta el onClick
        gvRecetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent details = new Intent(getContext(), DetallesRecetas.class);
                details.putExtra("receta", items.get(position));
                startActivity(details);
            }
        });

        return view;
    }
}
