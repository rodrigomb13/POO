
public class Cachorro {
	private String nome;
	private int idade;

	public Cachorro() {

	}
	public Cachorro(String n) {
		nome = n;
	}
	public Cachorro(String n, int i) {
		idade = i;
		nome = n;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String n) {
		nome = n;
	}
	public void setIdade(int i) {
		idade = i;
	}
}
