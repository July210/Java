/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requisicaohttp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author julie.goncalves
 */
public class Error {
    private String protocolo;
    private String recurso;
    private String metodo;
    private boolean manterViva = true;
    private long tempoLimite = 3000;
    private Map<String, List> cabecalhos;
    /**
     * @param args the command line arguments
     */
    public static Errorr lerRequisicao(InputStream entrada) throws IOException {
        Errorr requisicao = new Errorr();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
        System.out.println("Requisição: ");
        String linhaRequisicao = buffer.readLine();
        String[] dadosReq = linhaRequisicao.split(" ");
        requisicao.setMetodo(dadosReq[0]);
        requisicao.setRecurso(dadosReq[1]);
        requisicao.setProtocolo(dadosReq[2]);
        String dadosHeader = buffer.readline();
        while (dadosHeader != null && !dadosHeader.isEmpty()){
            System.out.println(dadosHeader);
            String[] linhaCabecalho = dadosHeader.split(":");
            requisicao.setCabecalho(linhaCabecalho[0], linhaCabecalho[1].trim().split(","));
            dadosHeader = buffer.readLine();
        }
        if (requisicao.getCabecalhos().containsKey("Connection")){
            requisicao.setManterViva(requisicao.getCabecalhos().get("Connection").get(0).equals("keep-alive"));
        }
        return requisicao;
    }
    public void setCabecalho()String chave, String... valores){
        if (cabecalhos == null){
            cabecalhos =new TreeMap<>();
        }
        cabecalhos.put(chave, Arrays.asList(valores));
    }
}
