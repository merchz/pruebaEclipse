package PaqueteAnimal;

public class Lagarto extends Animal {

	public Lagarto(char s) {
	super(s);
}
	public void amamantar() {
		if (this.getSexo()=='H') {
			System.out.println("no puede poner huevo");
		}else {
			System.out.println("Pone Huevos");
		}
		
	}
	public void vivir() {
		System.out.println("No vivo en la antártida");
	}
	public void sangre() {
		System.out.println("Soy de sangre fria");
	}	
	public void tomarsol() {
		System.out.println("me gusta tomar el sol");
	}
}
