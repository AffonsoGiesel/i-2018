/**
 * TODO forneça uma nota de copyright adequada.
 * <p>
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1integração;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// TODO Toda classe deve ter sua documentação!

/**
 *
 * @author affon
 */
public class Exercicio1Integração {

    /**
     * TODO um método chamado Hex, com estas funções, é uma armadilha.
     * TODO o nome não reflete o que ele faz.
     * @param file
     * @return
     * @throws IOException
     */
    public static String Hex(String file) throws IOException {

        return Integer.toHexString(obtemInteiro(file));
    }

    private static int obtemInteiro(String file) throws IllegalArgumentException {
        if (file.equals("") || file.equals(" ")) {
            throw new IllegalArgumentException("nome inválido");
        }

        FileInputStream arq = new FileInputStream(file);
        int aux;
        try (DataInputStream arquivo = new DataInputStream(arq)) {
            aux = arquivo.readInt();
        }
        return aux;
    }

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("USO: ....");
            System.exit(1);
        }

        try {
            System.out.println((Hex(args[0])));

        } catch (IOException exception) {
            System.out.println("Não foi possível obter bytes do arquivo " + args[0]);
            // System.out.println(exception);
        }
    }
}
    

