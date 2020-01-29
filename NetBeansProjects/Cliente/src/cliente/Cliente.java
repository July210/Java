/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;


import static java.sql.DriverManager.println;
/**
 *
 * @author julie.goncalves
 */
class aluno {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
                
        aluno (double n1, double n2, double n3, double n4){
            nota1 = n1;
            nota2 = n2;
            nota3 = n3;
            nota4 = n4;
        }
        double media(){ return (nota1 + nota2 + nota3 + nota4) /4;}
        void veredito(){
            if (media() > 7.0 ){
                println("Média: "+ media() + "-> aprovado");
            } else if (media() > 3.0){
                println("Média: "+ media() + "-> recuperação");
            } else {
                println("Média: "+ media() + "-> reprovado");
            }
    
        }
    
        public void main(String[] args) {
          aluno aluno1 = new aluno(8.7, 7.2, 9.3, 7.4);
          aluno1.veredito();
        }
    }
