import java.time.LocalTime;

public class Horario {
	private int hora;
	private int minutos;
	private int segundos;
	
	
	
	public Horario(int hora, int minutos, int segundos) {
		super();
		LocalTime hour = LocalTime.of(hora, minutos, segundos) ;
		this.hora = hour.getHour();
		this.minutos = hour.getMinute();
		this.segundos = hour.getSecond();
	}



	@Override
	public String toString() {
		return this.hora + "/" + this.minutos + "/" + this.segundos;
	}
	
	
}
