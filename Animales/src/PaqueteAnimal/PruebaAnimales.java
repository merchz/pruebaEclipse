package PaqueteAnimal;

public class PruebaAnimales {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
Perro laika = new Perro ('H');

laika.comer(" pienso para perros");
laika.dormir();
laika.amamantar();
laika.cuidarCrias();
laika.andar();
laika.darPata();
laika.cazar();
laika.ladrar();
	System.out.println("\nCREAMOS UN MAMÍFERO");
	Mamífero m=new Mamífero('H');
	
	m.comer(" comida");
	m.dormir();
	m.amamantar();
	m.cuidarCrias();
	m.andar();

	System.out.println("\nCREAMOS UN GATO");
	Gato gardfield = new Gato ('H');
	gardfield.comer(" atun");
	gardfield.dormir();
	gardfield.amamantar();
	gardfield.cuidarCrias();
	gardfield.jugar();
	gardfield.maullar();
	gardfield.ronronear();
	
	System.out.println("\nDiseñamos Ave");
	Ave a=new Ave('H');
	a.ala();
	a.amamantar();
	a.observar();
	a.cuidarCrias();
	a.comer("comida");
	a.dormir();
	System.out.println("\nCreamos un pingüino");
	Pinguino p=new Pinguino('M');
	p.agua();
	p.alimentar();
	p.nadar();
	p.ala();
	p.amamantar();
	p.cuidarCrias();
	p.comer(" peces");
	
	System.out.println("\nCreamos un canario");
	Canario c=new Canario();
	c.alimentar();
	c.cantar();
	c.volar();
	c.cuidarCrias();
	c.dormir();

	System.out.println("\nCreamos un lagarto");
	Lagarto l=new Lagarto('M');
	l.amamantar();
	l.vivir();
	l.sangre();
	l.tomarsol();
	l.comer(" insectos");


	}

	

}
