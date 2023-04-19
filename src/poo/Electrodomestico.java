package poo;

import com.sun.jdi.connect.Connector;

public abstract class Electrodomestico {

    protected  String nombre;
    protected String marca;
    protected String capacidad;
    protected int precio;
    protected double iva;
    protected double precioConIva;

    protected Electrodomestico(){

    }

    protected Electrodomestico(String nombre, String marca, String capacidad, int precio, double iva){
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract double precioElectrodomestico();

    public abstract void info();

}
