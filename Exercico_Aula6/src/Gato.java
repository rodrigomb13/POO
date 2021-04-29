
public class Gato {

	private String nome;
	private String cor;
	private int idade;

	public Gato() {

	}
	public Gato(String n) {
		nome = n;
	}
	public Gato(String c) {
		cor = c;
	}
	public Gato(int i) {
		idade = i;
	}
	public String getNome() {
		return nome;
	}
	public String getCor() {
		return cor;	
	}
	public int getIdade() {
		return idade;
	}
}
