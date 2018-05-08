
package pruebasemillero;

/**
 *
 * @author JonathanGar
 */
public class PruebaSemillero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        // System.out.println(FizzBuzz.printFizzBuzz(1, 15));
        FizzBuzz fb = new FizzBuzz(3, 5);
        try{
            System.out.println(fb.getFizzBuzz(1, 100));
        }catch(OutOfMemoryError e){
            System.out.println("Maxima capacidad de memoria alcanzada con el rango proporcionado...");
        } 
    }
    
}
