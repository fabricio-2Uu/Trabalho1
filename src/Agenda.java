import java.util.*;

public class Agenda {
	private List<Consulta> consultas = new ArrayList<Consulta>();
	
	public List<Consulta> getHistorico(){
		return consultas;
	}
	
	public void registraConsulta(Consulta consulta) {
		consultas.add(consulta);
	}
	
	public void listarConsultas(){
		for(Consulta consulta : consultas){
			System.out.println(consulta);
		}
	}
}

