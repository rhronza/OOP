package hlavni;

//import java.util.function.Function;

public class Zvire {
	
	protected String pohyb;
	protected String zvuk;
	
	
		
	public Zvire() {
		this.pohyb = "Zvire se pohybuje";
		this.zvuk = "Zvire vydava zvuk";
	}

	public String pohybujeSe() {
		return this.pohyb; 
	};
	
	public String vydavaZvuk() {
		return this.zvuk; 
	};
	
	
	
	

}
