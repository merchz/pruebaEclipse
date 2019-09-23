
package PaqueteAnimal;

public class Ave extends Animal{
public Ave () {
	super();
}
public Ave(char s) {
	super(s);
}
public void amamantar() {
	if (this.getSexo()=='H') {
		System.out.println("no puede poner huevo");
	}else {
		System.out.println("Pone Huevos");
	}
	
}
public void ala() {
	System.out.println("tengo alas");
}
public void cuidarCrias() {
	System.out.println("Estoy cuidadando a mis crias");
}
public void observar() {
	System.out.println("estoy observando...");
}
}
