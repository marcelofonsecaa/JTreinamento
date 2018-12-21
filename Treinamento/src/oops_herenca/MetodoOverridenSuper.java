package oops_herenca;

class A {
	void exibeMsg()
	{
		System.out.println("A");
	}
}

class B extends A{
	int exibeMsg()
	{
		super.exibeMsg();
		System.out.println("B");
	}
}

public class MetodoOverridenSuper {
	public static void main(String[] args) {
		B b = new B();
		b.exibeMsg();
	}
}
