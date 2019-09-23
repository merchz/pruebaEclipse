package PaqueteAnimal;

public class Gato extends Mamífero {

	public Gato() {
		super();
	}
	public Gato(char s) {
		super (s);
	}
	public void maullar() {
		System.out.println("miau miau");
	}
	public void ronronear() {
		System.out.println("purr");
	}
	public void jugar() {
		System.out.println("Estoy jugando");
	}

}
