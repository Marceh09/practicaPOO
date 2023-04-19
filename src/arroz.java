public class arroz {
    String marca;
    double peso;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPesoGr() {
        return peso;
    }

    public void setPeso(double pesoGr) {
        peso = pesoGr;
    }

    public double getpesoKg(){
        return peso/1000;
    }
}
