package ejercicio4;

public class SmartWatch extends SmartDevice{

   private  String color;

    public SmartWatch() {
    }

    public SmartWatch(boolean internet, String marca, int memoria, int precio, String color) {
        super(internet, marca, memoria, precio);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "color='" + color + '\'' +super.toString();
    }
}
