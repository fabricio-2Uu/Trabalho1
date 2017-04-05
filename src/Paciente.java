
public class Paciente extends Pessoa{
	private String telefone;
	private String endereco;
	
	
	
	public Paciente(String telefone, String endereco) {
		super();
		this.telefone = telefone;
		this.endereco = endereco;
	}



	@Override
	public String toString() {
		return "Paciente [telefone=" + telefone + ", endereco=" + endereco + "]";
	}
	
	
}
