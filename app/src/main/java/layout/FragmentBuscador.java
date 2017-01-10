package layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import test.minevera.R;

import static test.minevera.R.id.editText;

public class FragmentBuscador extends Fragment {

    public FragmentBuscador() {
        // Required empty public constructor
    }
    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_buscador, container, false);

        Button boton = (Button) view.findViewById(R.id.Search);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

        return view;
    }

}
