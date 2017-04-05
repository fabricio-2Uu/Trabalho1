import java.text.NumberFormat;
import java.util.Currency;

public class Consulta {
	private double valor;
	private Paciente paciente;
	private Data data;
	private Horario horario;
	
	
	
	public Consulta(double valor, Paciente paciente, Data data, Horario horario){
		
		this.valor = valor;
		this.paciente = paciente;
		this.data = data;
		this.horario = horario;
	}




	@Override
	public String toString() {
		NumberFormat reais = NumberFormat.getCurrencyInstance();
		return "Consulta [valor=" + reais.format(valor) + ", paciente=" + paciente + ", data=" + data + ", horario=" + horario + "]";
	}


	
}
