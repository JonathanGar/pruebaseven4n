
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
        // pasamos los modulos fizz=2 buzz=5
        FizzBuzz fb = new FizzBuzz(3, 5);
        try{
            // generamos la cadena FizzBuzz en el rango [1, 100]
            System.out.println(fb.getFizzBuzz(1, 100));
        }catch(OutOfMemoryError e){
            System.out.println("Maxima capacidad de memoria alcanzada con el rango proporcionado...");
        } 
    }
    
}
