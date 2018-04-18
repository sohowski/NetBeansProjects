
package losowaniewfrp;

import java.util.Random;

/**
 *
 * @author Sohowski
 */
public class LosowanieWFRP {

    
    public static void main(String[] args) {
        
        int suma = 0;
        int wynik = 0;
        Random rzut = new Random();
        System.out.println(" WW  US  I  Zr  CP  Int Op SW  Ogd");
        for (int i = 0; i < 9; i++) {
            
            wynik=((rzut.nextInt(10)+1))+(rzut.nextInt(10)+1);
            suma+=wynik;
            System.out.print(" " + wynik + " ");
            
        }
        
        System.out.println(" suma: " + suma);
        
        int wynikk3 = 0;
        for (int i = 0; i < 3; i++) {
            wynikk3 = (rzut.nextInt(3)+1);
            System.out.print(" k3: " + wynikk3);
        }
        
    }
    
}
