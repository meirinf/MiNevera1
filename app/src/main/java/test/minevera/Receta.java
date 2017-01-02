package test.minevera;

/**
 * Created by mireia on 2/01/17.
 */

public class Receta {
    String imagen;
    String Area;
    String nombreReceta;
    String ingredientes;
    String textoReceta;
    String Categoria;


    //Getters

    public String getImagen() {
        return imagen;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getTextoReceta() {
        return textoReceta;
    }

    public String getArea() {
        return Area;
    }

    public String getCategoria() {
        return Categoria;
    }

    //Setters


    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public void setTextoReceta(String textoReceta) {
        this.textoReceta = textoReceta;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setArea(String area) {
        Area = area;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
}
