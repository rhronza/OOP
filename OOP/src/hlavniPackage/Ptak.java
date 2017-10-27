package hlavniPackage;

//import hlavni.Zvire;

public class Ptak extends Zvire {

	private String pohyb;
	private String zvuk;
	private String maKridla;

	public Ptak() {
		this.pohyb="Jsem pt�k, m�v�m k��dly a l�t�m";
		this.zvuk="Jsem pt�k a zp�v�m";
		this.maKridla="Jsem pt�k a m�m dlouh� k��dla";
	};

	public String pohybujeSe() {
		return pohyb;
	}

	public String vydavaZvuk() {
		return zvuk;
	}
	
	public String getMaKridla() {
		return maKridla;
	}


	
}
