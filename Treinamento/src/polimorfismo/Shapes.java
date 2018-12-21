package polimorfismo;

public class Shapes {
	public static void main(String[] args) {
		Shape c = new Circulo();
		c.desenhar();
		c.apagar();
		Shape q = new Quadrado();
		q.desenhar();
		q.apagar();
		Shape t = new Triangulo();
		t.desenhar();
		t.apagar();
	}
}
