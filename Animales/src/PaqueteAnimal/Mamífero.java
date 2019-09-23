package PaqueteAnimal;

public class Mamífero extends Animal{
//no añado atributos, solo tendremos
//el atributo heredado de la clase animal
//constructores
	public Mamífero() {
		super();
	}
	public Mamífero(char s) {
		super(s);
	}
	//metodos propios de la clase mamífero
	public void amamantar() {
		if (this.getSexo()=='H') {
			System.out.println("no puede amamantar");
		}else {
			System.out.println("AMAMANTAR...");
		}
	}
	public void cuidarCrias() {
		System.out.println("Estoy cuidadando a mis crias");
	}
	public void andar() {
		System.out.println("estoy andando...");
	}
}

