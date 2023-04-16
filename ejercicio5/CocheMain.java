package ejercicio5;

import ejercicio1.Coche;

public class CocheMain {
    public static void main(String[] args) {
        CocheCRUDImpl objCocheCRUD= new CocheCRUDImpl();
        objCocheCRUD.borrar();
        objCocheCRUD.crear();
    }
}
