import java.time.*;

public class ClasseLocalTime {
	public static void main(String[] args) {
		//horário atual
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora: " + horaAtual);
		
		//definindo hora específica
		LocalTime horarioDeEntrada = LocalTime.of(19, 0);
		System.out.println(horarioDeEntrada); //19:00
		
		//horário atual
		 System.out.println("Hora: minutos: " +horaAtual.getMinute());
		 //segundos do dia com relação à data
		 System.out.println("Segundos do dia: "+horaAtual.toSecondOfDay());
	}
}
