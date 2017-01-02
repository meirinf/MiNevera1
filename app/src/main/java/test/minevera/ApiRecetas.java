package test.minevera;
import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mireia on 30/10/16.
 */

public class ApiRecetas {

    private static String url = "http://www.themealdb.com/api/json/v1/1/randomselection.php";
    private static ArrayList<Receta> recetas = new ArrayList<>();

    //Esta clase se encarga de bajar la información de la Api

    public static ArrayList<Receta> getCardsTypes(String categoria, String nombreReceta) {

        //Aqui pasa los parametros de configuración categoria y nombre de receta
        Uri builtUri = Uri.parse(url)
                .buildUpon()
                .appendQueryParameter("strCategory", categoria)
                .appendQueryParameter("strMeal", nombreReceta)
                .build();

        String urls = builtUri.toString();

        try {
            String JsonResponse = HttpUtils.get(urls);

            JSONObject data = new JSONObject(JsonResponse);
            JSONArray jsonRecetas = data.getJSONArray("meals");

            //se cargan todos los parametros elejidos
            for (int i = 0; i < jsonRecetas.length(); i++) {
                Receta receta = new Receta();
                JSONObject object = jsonRecetas.getJSONObject(i);

                receta.setNombreReceta(object.getString("strMeal"));
                receta.setArea(object.getString("strArea"));

                if (object.has("strCategory"))
                    receta.setCategoria(object.getString("strCategory"));

                if (object.has("strIngredient1")) {
                    receta.setIngredientes(object.getString("strIngredient1"));
                }
                if (object.has("strInstructions")) {
                    receta.setTextoReceta(object.getString("strInstructions"));
                }
                if (object.has("strMealThumb")) {
                    receta.setImagen(object.getString("strMealThumb"));
                }
                recetas.add(receta);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return recetas;
    }
}


