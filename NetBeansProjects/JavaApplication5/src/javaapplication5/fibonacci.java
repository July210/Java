
package javaapplication5;
/**
 *
 * @author julie.goncalves
 */
public class fibonacci {

    int fazCalculo(int i){
        if (i==0){
            return 1;
        } else {
            return i * fazCalculo(i-1);
        }
    }
    
    public static void main(String[] args) {
        fibonacci teste = new fibonacci();
        System.out.println(teste.fazCalculo(4));
    }
    
}