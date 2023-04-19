package main;
import poo.*;

public class Main {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora("Lavadora", "LG", "15 Kg", 2500000, 1.19, "Frontal");
        Nevera nevera = new Nevera("Nevera", "Haceb", "400 lt", 2200000, 1.19, "No frost", 0.3);

        lavadora.info();

        nevera.info();
    }
}
