package test.minevera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetallesRecetasDelDia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_recetas_del_dia);


        // Referencias
        TextView texto = (TextView) findViewById(R.id.Instrucciones);
        TextView nombreRecta = (TextView) findViewById(R.id.adapterNombreReceta);
        TextView tipo= (TextView) findViewById(R.id.adapterCategoria);
        TextView area = (TextView) findViewById(R.id.adapterArea);
        ImageView imagen = (ImageView) findViewById(R.id.adapterImagen);
        TextView Ingredientes = (TextView)findViewById(R.id.Ingredientes) ;

        // Recogemos el intent y cargamos la receta que hemos pasado desde Recetas del dia
        Intent intent = this.getIntent();

        if (intent != null) {

           Receta receta = (Receta) intent.getSerializableExtra("receta");

            if (receta!= null) {

                texto.setText("Instructions : " + receta.getTextoReceta());
                nombreRecta.setText("Name : " + receta.getNombreReceta());
                area.setText("Area : " + receta.getArea());
                tipo.setText("Category : "+ receta.getCategoria());
                Ingredientes.setText("Ingredients : " + receta.getIngredientes());

                Glide.with(this).
                        load(receta.getImagen()).
                        into(imagen);
            }
        }
        else{
            Toast.makeText(this, "Error al cargar la carta", Toast.LENGTH_SHORT).show();
        }
    }

}


