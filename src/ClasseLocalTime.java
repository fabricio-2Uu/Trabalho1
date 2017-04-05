import java.time.*;

public class ClasseLocalTime {
	public static void main(String[] args) {
		//hor�rio atual
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora: " + horaAtual);
		
		//definindo hora espec�fica
		LocalTime horarioDeEntrada = LocalTime.of(19, 0);
		System.out.println(horarioDeEntrada); //19:00
		
		//hor�rio atual
		 System.out.println("Hora: minutos: " +horaAtual.getMinute());
		 //segundos do dia com rela��o � data
		 System.out.println("Segundos do dia: "+horaAtual.toSecondOfDay());
	}
}
