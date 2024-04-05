package lista1.exec2;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		Pessoa[] Pessoas = new Pessoa [3];
		Scanner leitura = new Scanner(System.in);
		for(int i = 0; i < Pessoas.length; i++) {
			//instaciando a classe pessoa 
			Pessoa p = new Pessoa();
			// preencher valores 
			System.out.println("digite um nome");
			p.Nome = leitura.nextLine();
			System.out.println("digite o CPF");
			p.cfp = leitura.nextLine();
			System.out.println("digite a Data de Nascimento");
			p.datadeN = leitura.nextLine();
			Pessoas[i] = p;
		}
		for(int i = 0; i < Pessoas.length; i++) {
			System.out.println(Pessoas[i].Nome);
			System.out.println(Pessoas[i].cfp);
			System.out.println(Pessoas[i].datadeN);
		}
		
		

	}

}
