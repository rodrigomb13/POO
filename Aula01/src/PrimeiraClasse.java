
public class PrimeiraClasse {
	public static void main(String[] args) {
		System.out.println("Primeiro programa");
		Cachorro c = new Cachorro();
		c.idade = 10;
		c.nome = "Gaia";
		System.out.println("nome: " + c.nome + "\n idade:" + c.idade);
		c.latir();
		Cachorro c2 = new Cachorro();
		c2.nome = "hana";
		System.out.println("nome: " + c2.nome );
		
	}

}
