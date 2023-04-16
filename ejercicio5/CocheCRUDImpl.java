package ejercicio5;

import java.sql.SQLOutput;

public class CocheCRUDImpl implements ICocheCRUD{
    @Override
    public void crear() {
        System.out.println("ESTE CREA UN OBJETO");
    }

    @Override
    public void borrar() {
            System.out.println("ESTE BORRA UN OBJETO");
    }
}
