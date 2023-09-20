package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
		Gato siames = new Gato();
		siames.mia();
		siames.caminha();
		siames.setComprimento(30f);
		siames.setCor("Siâmes");
		siames.setEcossistema("Todo o mundo");
		siames.setNumeroDePatas(4);
		
		Cachorro dalmata = new Cachorro();
		dalmata.late();
		dalmata.caminha();
		dalmata.setComprimento(40f);
		dalmata.setCor("Branco e Preto");
		dalmata.setEcossistema("Floresta");
		dalmata.setNumeroDePatas(3);
	}
}
