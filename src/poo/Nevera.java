package poo;

public class Nevera extends Electrodomestico {
    private String tipo;
    private double descuento;
    private double total;

    public Nevera(){

    }

    public Nevera(String nombre, String marca, String capacidad, int precio, double iva, String tipo, double descuento) {
        super(nombre, marca, capacidad, precio, iva);
        this.tipo = tipo;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double precioElectrodomestico() {
        super.precioConIva = precio * iva;
        System.out.println("Precio con IVA: " + precioConIva);
        descuento = precioConIva * descuento;
        total = precioConIva - descuento;
        return total;
    }

    @Override
    public void info() {
        System.out.println("\n-------DATOS DEL ELECTRODOMESTICO-------");
        System.out.println("Electrodomestico: " + getNombre());
        System.out.println("Marca: " + getMarca());
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("------------------------------");
        System.out.println("Precio sin IVA: $"+ getPrecio());
        System.out.println("Precio con descuento: $" + precioElectrodomestico());
    }
}
