package PaqueteAnimal;

public class Canario extends Ave {
	public Canario () {
		super();
	}
	public Canario(char s) {
		super (s);
	}
	public void cantar() {
		System.out.println("estoy cantando");
		
	}
	public void alimentar() {
		System.out.println("me alimento de pienso");
		
	}
	public void volar() {
		System.out.println("estoy volando");
		
	}
}
