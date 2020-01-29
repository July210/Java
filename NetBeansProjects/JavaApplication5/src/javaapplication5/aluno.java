/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;

/**
 *
 * @author julie.goncalves
 */
public class aluno {
    private static final Scanner ler = null;
	String nota1;
    String nota2;
    String nota3;
    String nota4;
    
    
    double media(){
    return (Double.parseDouble(this.nota1) + Double.parseDouble(this.nota2) + Double.parseDouble(this.nota3) + Double.parseDouble(this.nota4))/4;  
    }
    
    void veredito() {
        if (this.media() > 7.0){
            System.out.println("Média: " + this.media() + " -> aprovado");
        } else if (this.media() > 4.0){
            System.out.println("Média: " + this.media() + " -> recuperação");
        } else {
            System.out.println("Média: " + this.media() + " -> reprovado");
        }
    }
    
    void adicionaNotas(Scanner ler) {
        System.out.println("Digite a média final do primeiro bimestre: ");
        this.nota1 = ler.nextLine();
        System.out.println("Digite a média final do segundo bimestre: ");
        this.nota2 = ler.nextLine();
        System.out.println("Digite a média final do terceiro bimestre: ");
        this.nota3 = ler.nextLine();
        System.out.println("Digite a média final do quarto bimestre: ");
        this.nota4 = ler.nextLine();
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        aluno[] alunoList = new aluno[50];
        int i = 0;
        String status = "";
        System.out.println("Abaixo você pode digitar as notas dos alunos:");
        do {
            System.out.println("Digite a média final do primeiro bimestre: ");
            alunoList[i].nota1 = ler.nextLine();
        System.out.println("Digite a média final do segundo bimestre: ");
        alunoList[i].nota2 = ler.nextLine();
        System.out.println("Digite a média final do terceiro bimestre: ");
        alunoList[i].nota3 = ler.nextLine();
        System.out.println("Digite a média final do quarto bimestre: ");
        alunoList[i].nota4 = ler.nextLine();
            alunoList[i].veredito();
            System.out.println("Deseja verificar o status de algum aluno?: ('S' ou 'N')");
            status = ler.nextLine();
            i++;
        } while (status == "S");   
        ler.close();
    }
    // erro em algo referente a leitura de dados e talvez algo relativo ao array aluno verificar os dois
}
