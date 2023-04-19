public class hija extends padre {
    private String nombreHija = "Marcela";
    public static void main(String[] args) {
        hija hijaMenor = new hija();
        hijaMenor.saludo();

        System.out.printf("Soy: "+hijaMenor.nombreHija +" hija de: " + hijaMenor.nombre);
    }


}
