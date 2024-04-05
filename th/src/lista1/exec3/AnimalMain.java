package lista1.exec3;

public class AnimalMain {

	public static void main(String[] args) {
		Animal cavalo = new Animal();
		cavalo.nomeCientifico = "sherek";
		cavalo.familia = "shereks";
		cavalo.reino = "sei lá como é o nome do reino";
		 
		cavalo.nomeP = new String[5];
		cavalo.nomeP [0] = "sherek rebaixado";
		cavalo.nomeP [1] = "sherek sulista";
		cavalo.nomeP [2] = "shereks";
		cavalo.nomeP [3] = "sherekard"; //desculpa prof pela baixaria
		cavalo.nomeP [4] = "perdi a cratividade";
		System.out.println("\n" + cavalo.nomeCientifico + "\n" + cavalo.familia + "\n" + cavalo.reino);
		for(int i = 0; i < cavalo.nomeP.length; i++) {
			System.out.println(cavalo.nomeP[i]);
			
		}
		

	}

}
