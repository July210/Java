package javaapplication5;

/**
 *
 * @author julie.goncalves
 */
public class Inteiro {
    int valor;
    
    void carregaValor(int v){
        valor = v;
    }
    int devolveValor(){
        return valor;
    }
    // int devolveValorAbsoluto(int v){
    //     return abs(v);
    // }
    int soma (int v){
        valor = valor + v;
        return valor;
    }
    int subtrai(int v){
        valor = valor - v;
        return valor;
    }
    int multiplica(int v){
        valor = valor * v;
        return valor;
    }
    int divide(int v){
        if (v != 0){
        valor = valor/v;
        return valor;
        } else {
            System.out.println("O número não pode ser igual a zero");
            return valor;
        }
    }
    void imprime(){
        System.out.println("Valor: " + devolveValor());
    }
    
    public static void main(String[] args) {
        Inteiro i = new Inteiro();
        i.carregaValor(14);
        i.imprime();
        System.out.println("Valor: " + i.soma(3));
        System.out.println("Valor: " + i.subtrai(4));
        System.out.println("Valor: " + i.multiplica(5));
        System.out.println("Valor: " + i.divide(2));

    }
    
}
