package hlavni;

public class Ptak extends Zvire {

	private String pohyb;
	private String zvuk;
	private String maKridla;

	public Ptak() {
		this.pohyb="Jsem pták, mávám køídly a létám";
		this.zvuk="Jsem pták a zpívám";
		this.maKridla="Jsem pták a mám dlouhá køídla";
	};

	public String pohybujeSe() {
		return pohyb;
	}

	public String vydavaZvuk() {
		return zvuk;
	}


	
}
