package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] linhas = new String [] { 
				"1 - domingo",
				"2 - segunda-feira",
				"3 - terça-feira",
				"4 - quarta-feira",
				"5 - quinta-Feira",
				"6 - sexta-feira",
				"7 - sábado",
				"-------------"
		};
		String path = "C:\\Temp\\in2.txt";
		
		// Escrita de Dados ===================================================
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String l: linhas) {
				bw.write(l);
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.println("Erro> " + e.getMessage());
		}
		
		
		// Leitura de Dados ===================================================
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
