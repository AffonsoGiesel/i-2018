/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6integração;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author affon
 */
public class Exercicio6Integração {

    
    public static void visualizar(String arquivo) throws IOException {

		if (arquivo.equals("") || arquivo.equals(" ")) {
    			throw new IllegalArgumentException("Invalid");
    		}

		FileInputStream tmp = new FileInputStream(arquivo);
		DataInputStream tmpfile = new DataInputStream(tmp);
		int i;

		while((i = tmpfile.read()) != -1){
        	    System.out.print((char)i);
        	}
}
    
    public static void main(String[] args){
        
        try {
	 		visualizar(args[0]);
	   	} catch (IOException exception) {
	   		System.out.println(exception);
}
    }
}