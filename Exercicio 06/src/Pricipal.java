import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class Pricipal {

	public static void main(String[] args) {
		boolean repetir = true;
		do {
			try {
				Pessoa p1 = new Pessoa();
				p1.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
				DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/mm/yyyy");
				p1.setnascimento(LocalDate.parse(JOptionPane.showInputDialog("Digite sua data de nascimento no formato DD/MM/AAAA"), formatoData));
				p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Dgite sua altura").replace(",", ".")));		
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Valor numérico inválido");
			} catch (DateTimeParseException dtpe) {
				JOptionPane.showMessageDialog(null, "Data de nascimento invalida");
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Algo deu errado");
			} 
		} while (repetir);
	}

}