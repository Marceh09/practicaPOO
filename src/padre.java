class padre {
    public String nombre = "Dairo";

    public void saludo(){
        System.out.println("Hola familia.....");
    }

}

class hijo extends padre{
    protected String nombreHijo ="Andrés";


    public static void main(String[] args) {
        hijo nuevoHijo = new hijo();
        nuevoHijo.saludo();

        System.out.println("Soy: "+nuevoHijo.nombreHijo + "tu hijo");
        System.out.println("Soy: "+nuevoHijo.nombre + " tu padre");
    }
}


