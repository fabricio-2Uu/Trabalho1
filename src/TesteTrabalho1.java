
public class TesteTrabalho1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente p1 = new Paciente("3174-2569", "Rua do Pé.");
		Data d1 = new Data(9,8,2017);
		Horario h1 = new Horario(20,20,20);
		
		Consulta consulta1 = new Consulta(50.00, p1, d1, h1);
		Consulta consulta2 = new Consulta(70.00, p1, d1, h1);
		
		System.out.println(consulta1.toString());
		
		Agenda agenda = new Agenda();
		agenda.registraConsulta(consulta1);
		agenda.registraConsulta(consulta2);
		agenda.listarConsultas();
		
		
	}

}
