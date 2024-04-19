package exec6Lista;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Desktop> desktops = new ArrayList<>();
		
		Desktop a = new Desktop();
		a.setFabricante("AMD");
		a.setCodBarras(123434);
		a.setGamer(false);
		
		ArrayList<String> pecas = new ArrayList<>();
		pecas.add("Mause");
		pecas.add("Monitor alienware ");
		pecas.add("Teclado");
		pecas.add("processador");
		
		a.setPecas(pecas);
		desktops.add(a);
		
		Desktop b = new Desktop();
		b.setFabricante("INTEL");
		b.setCodBarras(2022);
		b.setGamer(true);
		
		ArrayList<String> pecasb = new ArrayList<>();
		pecasb.add("Mause");
		pecasb.add("Monitor alienware ");
		pecasb.add("Teclado gamer");
		pecasb.add("processador i9-13900K ");
		b.setPecas(pecasb);
		desktops.add(b);
		
		ArrayList<String> pecasc = new ArrayList<>();
		Desktop c = new Desktop();
		c.setFabricante("AMP");
		c.setCodBarras(732);
		c.setGamer(false);
		
		pecas.add("Mause");
		pecas.add("Monitor alienware ");
		pecas.add("Teclado");
		pecas.add("processador");
		c.setPecas(pecasc);
		desktops.add(c);
		
		ArrayList<Smartphone> Smartphones = new ArrayList<>();
		Smartphone t = new Smartphone();
		
		t.setCodBarras(123423);
		t.setFabricante("Casas Bhaia");
		t.setDimensoes("1800x1000");
		Smartphones.add(t);
		
		Smartphone l = new Smartphone();
		
		l.setCodBarras(9678);
		l.setFabricante("Magalu");
		l.setDimensoes("1800x1000");
		Smartphones.add(l);
		
		Smartphone n = new Smartphone();
		
		n.setCodBarras(2345);
		n.setFabricante("Magalu");
		n.setDimensoes("1800x1000");
		Smartphones.add(n);
		
		
		for (Smartphone smartphone : Smartphones) {
			System.out.println(smartphone.getFabricante());
			System.out.println(smartphone.getDimensoes());
			System.out.println(smartphone.getCodBarras());
			
		} for (Desktop Desktop : desktops) {
			System.out.println(Desktop.getFabricante());
			System.out.println(Desktop.isGamer());
			System.out.println(Desktop.getCodBarras());
			System.out.println(Desktop.getPecas());
			
			for (String pecasstr : Desktop.getPecas()) {
				System.out.println(pecasstr);
				
			}
		}
		
		
		


	}

}
