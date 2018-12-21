package oops_herenca;

public class ExemploManagerSuper {
	public static void main(String[] args) {
		System.out.println("Main");
		System.out.println("Objeto da classe");
		Manager mm = new Manager(1001, "Jéssica", "Testes");
		System.out.println("Detalhes do Manager");
		mm.display();
		System.out.println("Fim");
	}

}
