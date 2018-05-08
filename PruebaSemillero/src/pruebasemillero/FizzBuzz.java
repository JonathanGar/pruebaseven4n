package pruebasemillero;
/**
 *
 * @author JonathanGar
 */
public class FizzBuzz {
    
    private int mod_fizz; // multiplo que imprime Fizz
    private int mod_buzz; // multiplo que imprime Buzz  
    private int mcm;
    
    // Constructor
    public FizzBuzz(int mod_fizz, int mod_buzz) throws ArithmeticException{            
        this.mod_fizz = mod_fizz;
        this.mod_buzz = mod_buzz;
        set_mcm(mod_fizz, mod_buzz);
    }
    
    /**
     *
     * @param from limite inferior de la cadena
     * @param to limite superior de la cadena
     * @return cadena que contiene los numeros FizzBuzz en el rango [from, to]
     */    
    public String getFizzBuzz(int from, int to){        
        StringBuilder sb = new StringBuilder();
        String result;
        
        if(from <= to) {
            for(int i = from; i <= to; i++){                  
                if(i % mcm == 0){
                    sb.append("FizzBuzz ");
                }else if(i % mod_buzz == 0){
                    sb.append("Buzz ");
                }else if(i % mod_fizz == 0){
                    sb.append("Fizz ");
                }else {
                    sb.append(i);
                    sb.append(" ");
                }                
            }
            // Se elimina el ulimo espacio en blanco
            result = sb.toString();            
            result = result.substring(0, result.length() - 1);
                                               
        }else {
            System.out.println("Modulos fizz buzz no permitidos from > to");
            result = "";
        }           
        return result;
    }
    
    private void set_mcm(int n1, int n2) { 
        if (n1 == 0 || n2 == 0){
            System.out.println("multiplos FizzBuzz deben ser diferentes de cero");
            throw new ArithmeticException();
        }
        mcm = Utilities.mcm(n1, n2);
    }
    
     public int getMod_fizz() {
        return mod_fizz;
    }

    public void setMod_fizz(int mod_fizz) throws ArithmeticException{
        this.mod_fizz = mod_fizz;
        set_mcm(mod_fizz, this.mod_buzz);
    }

    public int getMod_buzz() {
        return mod_buzz;
    }

    public void setMod_buzz(int mod_buzz) throws ArithmeticException{
        this.mod_buzz = mod_buzz;
        set_mcm(this.mod_fizz, mod_buzz);
    }
}
