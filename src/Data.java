import java.time.*;
import java.time.format.DateTimeFormatter;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	
	
	public Data(int dia, int mes, int ano) {		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}


	@Override
	public String toString() {
		LocalDate dateString = LocalDate.of(this.ano, this.mes, this.dia);
		
		return dateString.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + dateString.getDayOfWeek() + "(" + dateString.getMonth() + ").";
	}
	
	
}
