package pruebasemillero;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author JonathanGar
 */
//@RunWith(value=Parameterized.class)
@RunWith(value=Enclosed.class)
public class FizzBuzzTest {
   
    @RunWith(Parameterized.class)
    public static class FizzBuzzTestParameterized {
        private int mod_fizz, mod_buzz, from, to;
        private String exp;
        private FizzBuzz instance;
        
        @Parameters
        public static Iterable<Object[]> getData(){
            return Arrays.asList(new Object[][]{
                {
                    3, 5, 1, 100, 
                    "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz"
                }, {
                    3, 5, -3, 5,
                    "Fizz -2 -1 FizzBuzz 1 2 Fizz 4 Buzz"
                }, {
                    2, 41, 1, 100,
                    "1 Fizz 3 Fizz 5 Fizz 7 Fizz 9 Fizz 11 Fizz 13 Fizz 15 Fizz 17 Fizz 19 Fizz 21 Fizz 23 Fizz 25 Fizz 27 Fizz 29 Fizz 31 Fizz 33 Fizz 35 Fizz 37 Fizz 39 Fizz Buzz Fizz 43 Fizz 45 Fizz 47 Fizz 49 Fizz 51 Fizz 53 Fizz 55 Fizz 57 Fizz 59 Fizz 61 Fizz 63 Fizz 65 Fizz 67 Fizz 69 Fizz 71 Fizz 73 Fizz 75 Fizz 77 Fizz 79 Fizz 81 FizzBuzz 83 Fizz 85 Fizz 87 Fizz 89 Fizz 91 Fizz 93 Fizz 95 Fizz 97 Fizz 99 Fizz"
                }, {
                    7, 12, -1, 30,
                    "-1 FizzBuzz 1 2 3 4 5 6 Fizz 8 9 10 11 Buzz 13 Fizz 15 16 17 18 19 20 Fizz 22 23 Buzz 25 26 27 Fizz 29 30"
                }, {
                    3, 5, -3, 5,
                    "Fizz -2 -1 FizzBuzz 1 2 Fizz 4 Buzz"
                }, {
                    1, -2, -10, -1,
                    "FizzBuzz Fizz FizzBuzz Fizz FizzBuzz Fizz FizzBuzz Fizz FizzBuzz Fizz"
                }, {
                    2, 4, 0, 0,
                    "FizzBuzz"
                }, {
                    2, 4, 50, 50,
                    "Fizz"
                }, {
                    3, 4, 1, 2,
                    "1 2"
                }, {
                    3, 4, 100, 111,
                    "Buzz 101 Fizz 103 Buzz Fizz 106 107 FizzBuzz 109 110 Fizz"
                }, {
                    1, 8, 8, 1,
                    ""
                }
            });
        }
    
        public FizzBuzzTestParameterized(int fizz, int buzz, int from, int to, String exp) {
            this.mod_fizz = fizz;
            this.mod_buzz = buzz;
            this.from = from;
            this.to = to;
            this.exp = exp;
        }
        
        @BeforeClass
        public static void setUpClass() {
            System.out.println("--------Pruebas parametrizadas--------");
        }
        
        @Before
        public void setUp() {
            instance = new FizzBuzz(mod_fizz, mod_buzz);
        }

        /**
         * Test of getFizzBuzz method, of class FizzBuzz.
         */
        @Test
        public void testGetFizzBuzz() {
            System.out.println(String.format(
                    "test getFizzBuzz fizz_mod=%d buzz_mod=%d from=%d to=%d",  
                    mod_fizz, mod_buzz, from, to));
            String result = instance.getFizzBuzz(from, to);
            assertEquals(exp, result);
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        }
    }
    
    public static class FizzBuzzTestNotParameterized {
        private FizzBuzz instance;    
        
        @BeforeClass
        public static void setUpClass() {
            System.out.println("--------Pruebas NO parametrizadas--------");
        }
        
        @Before
        public void setUp() {
            instance = new FizzBuzz(3, 5);
        }
            
        // Test of constructor of class FizzBuzz.
        @Test(expected=ArithmeticException.class)
        public void testFizzBuzzConstructorZero() {
            System.out.println("test new FizzBuzz(0, 0)");
            instance = new FizzBuzz(0, 0);
        }

        @Test(expected=ArithmeticException.class)
        public void testSetMod_fizz() {
            System.out.println("test setMod_fizz(0)");
            instance.setMod_fizz(0);
        }

        // Test of setMod_buzz method, of class FizzBuzz.     
        @Test(expected=ArithmeticException.class)
        public void testSetMod_buzz() {
            System.out.println("test setMod_buzz(0)");
            instance.setMod_buzz(0);
        }
    }
   
}
