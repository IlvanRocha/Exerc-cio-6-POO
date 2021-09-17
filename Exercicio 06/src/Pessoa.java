import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

	private String nome;
	private LocalDate nascimento;
	private float altura;
	
	// calcular a idade da pessoa
	public int idade() {
		LocalDate hoje = LocalDate.now();
		int idade = hoje.getYear() - nascimento.getYear();
		if(nascimento.getMonthValue() > hoje.getMonthValue() || 
				(nascimento.getMonthValue() == hoje.getMonthValue() && nascimento.getDayOfMonth() > hoje.getDayOfMonth())) {
			idade--;
		}
		return idade;
	}
	
	// imprimir todos os dados da pessoa
	public String dados() {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		return "Nome: "+nome + "\nData de nascimentoimento: "+nascimento + "\nAltura: "+altura + "\nIdade: "+idade();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getnascimento() {
		return nascimento;
	}
	
	public void setnascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	}
	
	
	
