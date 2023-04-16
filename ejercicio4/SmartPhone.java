package ejercicio4;

public class SmartPhone extends SmartDevice {

boolean gps;

    public SmartPhone() {
    }

    public SmartPhone(boolean internet, String marca, int memoria, int precio, boolean gps) {
        super(internet, marca, memoria, precio);
        this.gps = gps;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "gps= " + gps +" "+
                 super.toString();
    }
}
