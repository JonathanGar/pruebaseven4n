/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasemillero;

/**
 *
 * @author Chucho
 */
public class Utilities {
    
    /**
     *
     * @param n1
     * @param n2
     * @return devuelve el minimo comun multiplo entre n1 y n2
     */
    public static int mcm(int n1, int n2) {
        int _mcm = (n1 > n2) ? n1 : n2;

        while(true) {
            if( _mcm % n1 == 0 && _mcm % n2 == 0 ) {
                break;
            }
            _mcm++;
        }
        return _mcm;
    }
    
}
