
package ad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ad2 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.printf("Informe o nome de arquivo texto:\n");
    String nomeEntrada = ler.nextLine();
        try {
        FileReader arqEntrada = new FileReader(nomeEntrada);
        BufferedReader lerArq = new BufferedReader(arqEntrada);
        FileWriter arqSaida = new FileWriter("resp-"+nomeEntrada);
        PrintWriter gravarArq = new PrintWriter(arqSaida);
        String linha = lerArq.readLine(); 
        gravarArq.printf("Melhores caminhos:%n");
        String[][] result = new String[50][3];
        int TamResult = 0;
        int temp;
            while (linha != null) {
            String[] t = linha.split (Pattern.quote ("/"));
                for(int b=0; b < t.length-1; b++){
                temp=0;
                    if (TamResult!=0){ 
                        for(int c=0;c<TamResult;c++){
                            if ((t[b].equals(result[c][0])) && (t[b+1].equals(result[c][1]))){
                            result[c][2] = String.valueOf(Integer.parseInt(result[c][2]) + 1);
                            temp=1;
                            }
                        }
                    }
                    if (temp==0){
                    result[TamResult][0]=t[b];
                    result[TamResult][1]=t[b+1];
                    result[TamResult][2]=Integer.toString(1);        
                    TamResult++;
                    }
                }
            linha = lerArq.readLine();   
            }
            for (int d=0;d<TamResult;d++){
                if (Integer.parseInt(result[d][2])>1){
                gravarArq.println(result[d][0]+"/"+result[d][1]+" ->"+result[d][2]);
                }
            }
      System.out.println("O arquivo foi gerado com sucesso!");
      arqEntrada.close();
      arqSaida.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
    }
    }
    
}