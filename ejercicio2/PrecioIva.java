package ejercicio2;

public class PrecioIva {

    public static void main(String[] args) {

        double precio=1000;
        System.out.println("El precio del iva es:"+ getPrevioIva(precio));


    }


    public static double getPrevioIva(double precio){
        double iva=0.21;
        return precio*(1+iva);


    }

}
