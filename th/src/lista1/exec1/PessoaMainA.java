package lista1.exec1;

public class PessoaMainA {

	public static void main(String[] args) {
		Pessoa thalles = new Pessoa();
		
		thalles.cfp = 123456;
		thalles.Nome = "Thalles";
		thalles.datadeN = "19/10/2005";
		
		Pessoa prof = new Pessoa();
		prof.cfp = 765;
		prof.datadeN = "05/08/1983";
		prof.Nome = "Bruna";
		
		Pessoa amigo = new Pessoa ();
		amigo.cfp = 99999;
		amigo.datadeN = "04/08/2006";
		amigo.Nome = "seilakkkk";
		
		System.out.println(thalles.Nome + thalles.cfp + thalles.datadeN );
		System.out.println(prof.Nome + prof.cfp + prof.datadeN);
		System.out.println(amigo.Nome + amigo.cfp + amigo.datadeN);

	}

}
