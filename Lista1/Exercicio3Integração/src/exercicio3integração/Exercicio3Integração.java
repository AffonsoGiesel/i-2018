/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3integração;

/**
 *
 * @author affon
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Exercicio3Integração {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    
    //Scanner read;
                //read = new Scanner(System.in);
                //System.out.println("Escreva o local do arquivo a ser lido (com a extensão .txt no final):");
                //String n = read.next();
		FileReader arq = new FileReader(args[0]);
		BufferedReader myBuffer = new BufferedReader(arq);
		String linha = myBuffer.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = myBuffer.readLine();
		}

		arq.close();

	}

}
    
    

