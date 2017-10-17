package hlavni;

public class Hlavni {

	public static void main(String[] args) {
		System.out.println("*****************************************");
		System.out.println("*          ZVIRE, PTAK                  *");
		System.out.println("*****************************************");
		Zvire zvire = new Zvire();
		System.out.println(zvire.pohybujeSe());
		System.out.println(zvire.vydavaZvuk());
		Ptak ptak = new Ptak();
		System.out.println(ptak.pohybujeSe());
		System.out.println(ptak.vydavaZvuk());
		System.out.println(zvire.pohybujeSe());
		System.out.println(zvire.vydavaZvuk());
	}

}
