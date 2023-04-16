package ejercicio4;

public class SmartMain {
    public static void main(String[] args) {

     SmartDevice objPhone= new SmartPhone(true,"Samsung",300,20000,true);

        System.out.println("El smart phone posee los siguientes atributos:"+ objPhone);

        SmartDevice objWatch= new SmartWatch(true,"adidas",200,30000,"rojo");

        System.out.println("El smart Watch posee los siguientes atributos:"+ objWatch);
    }
}
