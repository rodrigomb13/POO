
public class Leao {
	private String nome;
	private String cor;
	private int idade;

	public Leao() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void rugir() {
		System.out.println("Leao rugindo...");
	}

}
