package javaapplication5;

/**
 *
 * @author julie.goncalves
 */
public class funcoesSegGrau {

    int baskara(int a, int b, int c){
        return (b*b) - 4*a*c;
    }

    int quantRaizesReais(int a, int b, int c){
        if (baskara(a, b, c) > 0) {
            return 2;
        } else if (baskara(a, b, c) < 0){
            return 0;
        } else {
            return 1;
        }
    }

    int raizesReais(){
        return 0;
    }
    int raizesImaginarias(){return 0;}
    public static void main(String[] args) {
        funcoesSegGrau teste = new funcoesSegGrau();
        System.out.println(teste.baskara(2,4,2));
        System.out.println(teste.quantRaizesReais(2,4,2));
        System.out.println();
    }
    
}
