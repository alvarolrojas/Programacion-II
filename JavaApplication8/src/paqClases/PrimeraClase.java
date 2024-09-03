package paqClases;

public class PrimeraClase {
    
    int unEntero;
    String unaCadena;

    void mostrar(){
        
        System.out.println("Atributos: " +unaCadena+ "y" +unEntero);
    }
    
    public static void main(String[] args) {
        
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();
        
        unObjeto1.unaCadena = "Ventilador";
        unObjeto2.unEntero = 5;
        unObjeto3.unaCadena = "Escritorio";
    }
    

    
}
