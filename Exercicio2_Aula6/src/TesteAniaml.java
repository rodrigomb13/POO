
public class TesteAniaml {

	public static void main(String[] args) {
		Gato g1 = new Gato();
		Cobra c1 = new Cobra();
		Leao l1 = new Leao();
		g1.setNome("felix");
		g1.setIdade(15);
		System.out.println("nome: " + g1.getNome() + " idade: " + g1.getIdade());
		g1.mia();
		c1.setNome("cascavel");
		c1.setIdade(20);
		System.out.println("nome: " + c1.getNome() + " idade: " + c1.getIdade());
		c1.sibilar();
		l1.setNome("simba");
		l1.setIdade(20);
		System.out.println("nome: " + l1.getNome() + " idade: " + l1.getIdade());
		l1.rugir();

	}
}
