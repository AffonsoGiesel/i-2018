/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5integração;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author affon
 */
public class Exercicio5Integração {

     public static void leitor(String path, String path2) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            
            linha = buffRead.readLine();
            if (linha != null) {
            escritor(path2,linha);
            }
        }
        buffRead.close();
     }
     
     
       public static void escritor(String path, String linha) throws IOException {
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true))) {
              byte[] bytes = linha.getBytes();
              System.out.println(bytes);
 
              String bytesString = bytes.toString();
              
            
            buffWrite.append(bytesString);
            buffWrite.newLine();
        }
    }
    
    
    
    public static void main(String[] args) throws IOException {
       //Scanner sc = new Scanner(System.in);
        //System.out.println("Local do arquivo de origem:");
       //String path = "C:\\Users\\affon\\Desktop\\aaa.txt"; 
               //= sc.nextLine();
        //System.out.println("Local do arquivo de destino:");
       //String path2 = "C:\\Users\\affon\\Desktop\\bbb.txt"; 
               //= sc.nextLine();
        leitor(args[0], args[1]);
    }
    
}
