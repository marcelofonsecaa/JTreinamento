package classesobjetos;

public class Pacients {
	public static void main(String[] args) {

		String nomePaciente = new String();
		Double imcPaciente = 0.0;
		
		Pacient pacient = new Pacient("Jéssica", 60.0, 1.65);
		nomePaciente = pacient.getName();
		imcPaciente = pacient.calcularIMC();		
		
		System.out.println("Paciente: " + nomePaciente + "\nIMC: " + imcPaciente);
	}
}
