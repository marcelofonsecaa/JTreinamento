package oops_herenca;

class X{
	X(){
		System.out.println("Construtor X");
	}
}
class Y extends X{
	Y(){
		System.out.println("Construtor Y");
	}
}
class Z extends Y{
	 Z(){
		System.out.println("Construtor Z");
	}
}

public class OrdemConstrucao {
	public static void main(String[] args) {
		Z z = new Z();
	}
}
