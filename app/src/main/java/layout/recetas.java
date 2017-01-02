package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import test.minevera.R;

public class recetas extends Fragment {

    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Conectamos la vista con el layout
        View view =inflater.inflate(R.layout.fragment_recetas, container, false);

        //Instanciamos la list view
        ListView lvRecetas = (ListView) view.findViewById(R.id.lvRecetas);

        //Array de Strings provisional
        String[] data = {
                "Los 400 golpes",
                "El odio",
                "El padrino",
                "El padrino. Parte II",
                "Ocurrió cerca de su casa",
                "Infiltrados",
                "Umberto D."
        };

        items = new ArrayList<>(Arrays.asList(data));

        //items = new ArrayList<>();

        //Pasamos las variables a las views
        adapter = new ArrayAdapter<>(
                getContext(),
                R.layout.recetas_row,
                R.id.adapterNombreReceta,
                items
        );

        lvRecetas.setAdapter(adapter);

        return view;
    }
    public recetas() {
        // Required empty public constructor
    }


}
