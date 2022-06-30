
package vehiculobarato;

public class VehiculoBarato {
    private String marca;
    private int modelo;
    private String nombre;
    private float precio;

    public VehiculoBarato(String marca, String nombre, int modelo, float precio) {
        this.marca = marca;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos() {
        return ("Marca: "+marca+"\nNombre: "+nombre+"\nModelo: "+modelo+"\nPrecio: $"+precio);
    }
    
    
}
