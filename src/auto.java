public class auto {

    int modelo;
    String marca;

    public auto(int year, String nombre) {
        modelo = year;
        marca = nombre;
    }
    public static void main(String[] args) {
        auto mi_auto = new auto(2020, "nissan");
        System.out.println("datos de mi auto: " + mi_auto.marca + " modelo: "+mi_auto.modelo);
    }
}
