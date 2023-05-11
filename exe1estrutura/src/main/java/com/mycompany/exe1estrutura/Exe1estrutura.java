package com.mycompany.exe1estrutura;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exe1estrutura {

    public static void main(String[] args) {
       ArrayList <Integer> num = new ArrayList();
       int numeroPesquisar = 2;
        
        
         int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos números deseja cadastrar?"));
        for (int i = 0; i < quantidade; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":"));
            num.add(numero);
        }

        
        for (int numero : num) {
            System.out.println(numero);
        }
        JOptionPane.showMessageDialog(null,"Pesquisa Linear "+"\n" +
                "O elemento "+numeroPesquisar+" está na posição: "+
                        pesquisaLinear(numeroPesquisar, num));
        JOptionPane.showMessageDialog(null,"Pesquisa Binaria "+"\n" +
                "O elemento "+numeroPesquisar+" está na posição: "+
                        pesquisaBinaria(numeroPesquisar, num));
   
       
    }
    public static int pesquisaLinear(int numPesq, ArrayList<Integer>vet){
        
        for (int i = 0; i < vet.size(); i++) {
            if(numPesq == vet.get(i)){
                return i;
            }
        }
        return numPesq;
    } 
       public static int pesquisaBinaria(int numPesq, ArrayList<Integer>vet){
        int esquerda, meio, direita;
        esquerda = 0;
        direita = vet.size() - 1;
        
        while(esquerda <= direita){
            meio = (esquerda + direita)/2;
            if(numPesq == vet.get(meio)){
                return meio;
            }
            if(numPesq > vet.get(meio)){
                esquerda = meio +1;
            }else{
                direita = meio -1;
            }
        }
        
        return numPesq;
       }
    
}
