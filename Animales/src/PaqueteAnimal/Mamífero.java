package PaqueteAnimal;

public class Mam�fero extends Animal{
//no a�ado atributos, solo tendremos
//el atributo heredado de la clase animal
//constructores
	public Mam�fero() {
		super();
	}
	public Mam�fero(char s) {
		super(s);
	}
	//metodos propios de la clase mam�fero
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

