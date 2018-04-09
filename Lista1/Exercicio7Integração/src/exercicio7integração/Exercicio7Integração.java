/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7integração;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author affon
 */
public class Exercicio7Integração {

    public static void BinaryConverter(String txt, String binary) throws IOException {

                Path file = Paths.get(txt);
                Charset utf = Charset.forName("UTF-8");	

    		FileOutputStream tmpBinary = new FileOutputStream(binary);
    		DataOutputStream arq = new DataOutputStream(tmpBinary);
                int index = 0;
        
    		for (String line : Files.readAllLines(file, utf)) {
			byte[] linhaBytes = line.getBytes(utf);
                        arq.writeInt(index);
			arq.writeInt(line.length());
			arq.write(linhaBytes, 0, line.length());
                        index ++;
    		}

    		arq.close();
}
    public static void main(String[] args) throws IOException {
        BinaryConverter(args[0], args[1]);
        System.out.println("Concluído!");
    }
    
}
