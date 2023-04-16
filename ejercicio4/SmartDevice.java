package ejercicio4;

public abstract class SmartDevice {

    private boolean internet;
   private String marca;
   private int memoria;
   private int precio;


    public SmartDevice() {
    }

    public SmartDevice(boolean internet, String marca, int memoria, int precio) {
        this.internet = internet;
        this.marca = marca;
        this.memoria = memoria;
        this.precio = precio;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
                "internet=" + internet +
                ", marca='" + marca + '\'' +
                ", memoria=" + memoria +
                ", precio=" + precio +
                '}';
    }
}


