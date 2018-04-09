/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1integração;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author affon
 */
public class Exercicio1Integração {

       public static String Hex(String file) throws IOException {

	if (file.equals("") || file.equals(" ")) {
            throw new IllegalArgumentException("Invalid");
	}

	FileInputStream arq = new FileInputStream(file);
        int aux;
           try (DataInputStream arquivo = new DataInputStream(arq)) {
               aux = arquivo.readInt();
           }

	return Integer.toHexString(aux);

}
    
    public static void main(String[] args) {
       
        try {
            System.out.println((Hex(args[0])));    		

    	} catch(IOException exception) {
    		System.out.println(exception);
    	}
        
    }
    
   

    }
    

