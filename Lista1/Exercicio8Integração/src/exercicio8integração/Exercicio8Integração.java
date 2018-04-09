/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8integração;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 *
 * @author affon
 */
public class Exercicio8Integração {

   public static void visualizar(String arquivo, int linha) throws IOException {

		FileInputStream fis = new FileInputStream(arquivo);
		DataInputStream dis = new DataInputStream(fis);
		byte[] Bytes = new byte[4];
		int Index;
		int linhaByte;
		int amountSkip = 0;

		while ((Index = dis.read(Bytes)) != -1) {
			Index = ByteBuffer.wrap(Bytes).getInt();

			if (Index == linha) {
				
				linhaByte = ByteBuffer.wrap(Bytes).getInt();

				byte[] byteArray = new byte[linhaByte];
				dis.read(byteArray);

				String str = new String(byteArray, "UTF-8");
				System.out.println(str);
			} else {
				
				amountSkip = ByteBuffer.wrap(Bytes).getInt();
				dis.skipBytes(amountSkip);
			}
			
		}
}
    public static void main(String[] args) throws IOException {
        visualizar(args[0], Integer.parseInt(args[1]));
    }
    
}
