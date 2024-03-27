package exemplo;

public class exmp {

	public static void main(String[] args) {
		
		// INSTANCIAR A CLASSE 
		Pessoa thalles = new Pessoa ();
		
		thalles.cpf = "123456";
		thalles.primeiroNome = "Thalles";
		thalles.sobrenome = "Santos";
		
		System.out.println(thalles.primeiroNome);
		System.out.println(thalles.sobrenome);
		System.out.println(thalles.cpf);

	}

}
