public class principal {
    public static void main(String[] args) {
        arroz nuevoArroz = new arroz();
        nuevoArroz.setMarca("Roa");
        nuevoArroz.setPeso(100);

        System.out.println("Arroz "+nuevoArroz.getMarca()+ " Peso en gramos: "+nuevoArroz.getPesoGr());
        System.out.printf("Arroz "+nuevoArroz.getMarca()+ "  Peso en kilogramos: "+nuevoArroz.getpesoKg());
    }
}
