
package javaapplication5;

/**
 *
 * @author julie.goncalves
 */
public class Compra {
    double taxaDeCompra;
    double taxaDeVenda;

    void defineTaxaCompra(double taxa){
        this.taxaDeCompra = taxa;
    }
    void defineTaxaVenda(double taxa){
        this.taxaDeVenda = taxa;
    }
    void imprimeTaxas() {
        System.out.println("Taxa de compra: "+ this.taxaDeCompra);
        System.out.println("Taxa de venda: "+ this.taxaDeVenda);
    }
    double vendeDolar(double v){
        return v * this.taxaDeVenda;
    }
    double compraDolar(double v){
        return v * this.taxaDeCompra;
    }

    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.defineTaxaCompra(0.3);
        compra1.defineTaxaVenda(0.2);
        compra1.imprimeTaxas();
        System.out.println(compra1.vendeDolar(30));
        System.out.println(compra1.compraDolar(30));
    }
    
}