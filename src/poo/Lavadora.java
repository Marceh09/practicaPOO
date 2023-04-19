package poo;

public class Lavadora extends Electrodomestico{
    private String tipoDeCarga;

    public Lavadora(){

    }
    public Lavadora(String nombre, String marca, String capacidad, int precio, double iva, String tipoDeCarga){
        super(nombre, marca, capacidad, precio, iva);
        this.tipoDeCarga = tipoDeCarga;
    }

    @Override
    public double precioElectrodomestico() {
        super.precioConIva = precio * iva;
        return precioConIva;
    }

    @Override
    public void info() {
        System.out.println("\n-------DATOS DEL ELECTRODOMESTICO-------");
        System.out.println("Electrodomestico: " + getNombre());
        System.out.println("Marca: " + getMarca());
        System.out.println("Tipo de carga: " + tipoDeCarga);
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("------------------------------");
        System.out.println("Precio sin IVA: $"+ getPrecio());
        System.out.println("Precio con IVA: $" + precioElectrodomestico());
    }


}
