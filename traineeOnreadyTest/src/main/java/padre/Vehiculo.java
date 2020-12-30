package padre;

public class Vehiculo implements Comparable<Vehiculo> {

    protected String marca;
    protected String modelo;
    protected Float precio;

    protected Vehiculo(String marca, String modelo, Float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Vehiculo o) {
        return precio.compareTo(o.getPrecio());
    }

}
