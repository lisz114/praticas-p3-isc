package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {

		Veiculo vei = new Veiculo();
		
		vei.setCor("Cinza");
		vei.setFabricante("Chico");
		vei.setNumeroderodas(5);
		vei.setNome("Celta");
		vei.setAno(2015);
		
		Veiculo vei2 = new Veiculo();
		
		vei2.setCor("Vermelho");
		vei2.setFabricante("Lucas");
		vei2.setNumeroderodas(4);
		vei2.setAno(2014);
		vei2.setNome("Fusca");
		
		Veiculo vei3 = new Veiculo();
		
		vei3.setCor("Azul");
		vei3.setFabricante("Jorge");
		vei3.setNumeroderodas(5);
		vei3.setAno(2016);
		vei3.setNome("Gol");
		
		ArrayList<Veiculo> lista = new ArrayList<>();
		
		lista.add(vei);
		lista.add(vei2);
		lista.add(vei3);
		
		for (Veiculo veiculo : lista) {
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumeroderodas());
			System.out.println("\n");	
		}
		
}

}
