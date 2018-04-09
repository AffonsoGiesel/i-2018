/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2integração;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author affon
 */
public class Exercicio2Integração {

    


private static Boolean isJPEG(File filename) throws Exception {
    DataInputStream ins = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));
    try {
        if (ins.readInt() == 0xffd8ffe0) {
            return true;
        } else {
            return false;

        }
    } finally {
        ins.close();
    }
}
    public static void main(String[] args) throws Exception {
        //System.out.println("Local do Arquivo:");
        //Scanner leitor = new Scanner(System.in);
        //String local = leitor.nextLine();
        Boolean status = isJPEG(new File(args[0]));
    System.out.println("É .Jpg ? " + status);
    }
    
}
