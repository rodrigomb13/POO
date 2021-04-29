import java.util.Scanner;


public class TestaCachorro {
	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		Cachorro c2 = new Cachorro("Gaia");
		Cachorro c3 = new Cachorro("pluto", 10);

		System.out.println(c2.getNome());
		System.out.println(c3.getNome() + "-" + c3.getIdade());
		c.setNome("banze");
		c.setIdade(3);
		System.out.println(c.getIdade() + "-" + c.getNome());

	}

}
