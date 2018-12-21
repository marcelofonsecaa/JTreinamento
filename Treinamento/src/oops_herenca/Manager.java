package oops_herenca;

public class Manager extends Employee {
	String deptName;
	public Manager(int employeeno, String employeeName, String deptName)
	{
		super(employeeno, employeeName);
		
		System.out.println("3 construtor começa");
		this.deptName = deptName;
		System.out.println("Fim");
		
	}

	public void display()
	{
		super.display();
		super.employeeName = "123";
		System.out.println("Departamento: " + deptName);
	}
}
