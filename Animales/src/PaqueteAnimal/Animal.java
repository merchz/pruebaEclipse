package PaqueteAnimal;

public class Animal {
 private char sexo;
//constructores
public Animal() {
	this.sexo='M';
}
//sobrecargar constructores
public Animal (char s) {
	this.sexo=s;
}

public void dormir() {
	System.out.println("Estoy durmiendo");
}

public char getSexo() {
	return this.sexo;
}
public void comer(String comida) {
	System.out.println("Estoy comiendo" +comida);
}


@Override
public String toString() {
	return "Animal [sexo=" + sexo + "]";
}

}

