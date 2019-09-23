package PaqueteAnimal;

public class Perro extends Mamífero{

public Perro () {
		super ();
	}
public Perro(char s) {
	super (s);
}

public void ladrar() {
	System.out.println("Guau guau");
}
public void darPata() {
	System.out.println("Toma mi patita");
}
public void cazar() {
	System.out.println("Estoy cazando perdices");
}
}
