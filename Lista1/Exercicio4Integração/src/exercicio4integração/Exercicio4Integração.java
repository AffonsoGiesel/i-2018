package exercicio4integração;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio4Integração {

	public static void main(String[] args) {

            //Scanner leitor = new Scanner(System.in);
            //System.out.println("Local do arquivo:");
            //String local = leitor.nextLine();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]))) {

		              //System.out.println("O que deve ser persistido no arquivo:");	
                //String content = leitor.nextLine();

			bw.write(args[1]);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
