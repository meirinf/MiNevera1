package test.minevera;

/**
 * Created by mireia on 2/01/17.
 */

public class Receta {
    String imagen;
    String area;
    String nombreReceta;
    String ingredientes;
    String textoReceta;
    String categoria;


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
        return area;
    }

    public String getCategoria() {
        return categoria;
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
        this.area = area;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
