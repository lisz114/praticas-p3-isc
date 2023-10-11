package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		Desktop pc = new Desktop();

		pc.setCodBarras(123456l);
		pc.setFabricante("Positivo");
		pc.setGamer(false);

		ArrayList<String> pecas = new ArrayList<>();

		pecas.add("Teclado");
		pecas.add("Mouse");

		pc.setPecas(pecas);

		Desktop pc2 = new Desktop();

		pc2.setCodBarras(123456l);
		pc2.setFabricante("Positivo");
		pc2.setGamer(false);

		ArrayList<String> pecas1 = new ArrayList<>();

		pecas1.add("Placa mãe");
		pecas1.add("Tela");

		pc2.setPecas(pecas1);

		Desktop pc3 = new Desktop();

		pc3.setCodBarras(123456l);
		pc3.setFabricante("Positivo");
		pc3.setGamer(false);

		ArrayList<String> pecas2 = new ArrayList<>();

		pecas2.add("Teclado");
		pecas2.add("Mouse");

		pc3.setPecas(pecas2);

		ArrayList<Desktop> desktops = new ArrayList<>();

		desktops.add(pc);
		desktops.add(pc2);
		desktops.add(pc3);

		for (Desktop desktop : desktops) {
			System.out.println(desktop.getFabricante());
			System.out.println(desktop.getCodBarras());
			System.out.println(desktop.getGamer());

			for (String peca : desktop.getPecas()) {
				System.out.print(peca+" ");
			}
			System.out.println();
			System.out.println("---------");
		}

		Smartphone ph = new Smartphone();

		ph.setCodBarras(656465l);
		ph.setCor("Vermelho");
		ph.setDimensoesTela("15x6");
		ph.setFabricante("Max");

		Smartphone ph2 = new Smartphone();

		ph2.setCodBarras(545435l);
		ph2.setCor("Azul");
		ph2.setDimensoesTela("16x6");
		ph2.setFabricante("Bruna");

		Smartphone ph3 = new Smartphone();

		ph3.setCodBarras(9181465285l);
		ph3.setCor("Amarelo");
		ph3.setDimensoesTela("13x4");
		ph3.setFabricante("Jorge");

		ArrayList<Smartphone> celulares = new ArrayList<>(03);

		celulares.add(ph);
		celulares.add(ph2);
		celulares.add(ph3);

		for (Smartphone smartphone : celulares) {
			System.out.println(smartphone.getCor());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getFabricante());

		}
	}

}
