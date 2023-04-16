package ejercicio1;

public class Coche {

    private String marca;
    private int modelo;
    private long precio;
    private double km;
    private boolean aireAcondicionado=true;
    public static void main(String[] args) {

        Coche objCoche=new Coche("Fiat",2016,2000,300000,true);

        System.out.println(objCoche);

    }

    public Coche() {

    }

    public Coche(String marca, int modelo, long precio, double km, boolean aireAcondicionado) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.km = km;
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", precio=" + precio +
                ", km=" + km +
                ", aireAcondicionado=" + aireAcondicionado +
                '}';
    }
}

