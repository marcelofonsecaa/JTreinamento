package Heranca;

public class Animais {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.comer();
		animal.dormir();
		
		Passaro passaro = new Passaro();
		passaro.comer();
		passaro.dormir();
		passaro.voar();
	}
}
