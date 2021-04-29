
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Mochila m[] = new Mochila[4];

		for (int i = 0; i < m.length; i++) {
			m[i] = new Mochila();
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o ano das mochilas:");
		m[0].ano = sc.nextInt();
		m[1].ano = sc.nextInt();
		m[2].ano = sc.nextInt();
		m[3].ano = sc.nextInt();
		sc.nextLine();
		System.out.println("digite a cor das mochilas:");
		m[0].cor = sc.nextLine();
		m[1].cor = sc.nextLine();
		m[2].cor = sc.nextLine();
		m[3].cor = sc.nextLine();
		

		double media = 0;
		double soma = 0;
		
		for (int j = 0; j < m.length; j++) {
			soma =   soma + m[j].ano ;
		}
		media = soma / m.length;
		System.out.println("a media das mochilas é:" + media);

		sc.close();
	}
}
