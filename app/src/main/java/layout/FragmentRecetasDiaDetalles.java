package layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import test.minevera.R;
import test.minevera.Receta;

public class FragmentRecetasDiaDetalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fragment_recetas_dia_detalles);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Unim el codi en les Views del Layout
        TextView nombreReceta = (TextView) findViewById(R.id.adapterNombreReceta);
        TextView tipo = (TextView) findViewById(R.id.adapterCategoria);
        TextView area = (TextView) findViewById(R.id.adapterArea);
        ImageView imagenReceta = (ImageView) findViewById(R.id.adapterImagen);

        //Recogemos el intent y cargamos la carta que hemos pasado desde el MainActivity
        Intent intent = this.getIntent();

        if (intent != null) {

            Receta receta = (Receta) intent.getSerializableExtra("receta");

            if (receta != null) {

                tipo.setText("Tipo: " + receta.getCategoria());
                nombreReceta.setText("Nombre Receta: " + receta.getNombreReceta());
                area.setText("Area: " + receta.getArea());
                //tipo.setText("Tipo: "+carta.getTipo());

                Glide.with(this).
                        load(receta.getImagen()).
                        into(imagenReceta);

                getSupportActionBar().setTitle(receta.getNombreReceta());
            }
        } else {
            Toast.makeText(this, "Error al Receta", Toast.LENGTH_SHORT).show();
        }
    }
}
