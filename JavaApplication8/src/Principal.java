
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        float x, y, z;
        
        x = 2f;
        y = 4f;
        z = 5f;
        
        ArrayList< Float > listaDeNumeros = new ArrayList< Float >();
        

        
        listaDeNumeros.add(x);   
        listaDeNumeros.add(y);
        listaDeNumeros.add(z);
        
        for(Float Mostrar : listaDeNumeros)
            System.out.println(Mostrar);

    }
}
