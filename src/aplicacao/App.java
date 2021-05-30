package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		metodo1();
		
		System.out.println("fim do programa");	
	}
	public static void metodo1() {
		System.out.println("******METODO1 START*****");
		metodo2();
		System.out.println("******METODO1 END*****");
	}
	
	public static void metodo2() {
		System.out.println("******METODO2 START*****");
		Scanner sc = new Scanner(System.in);
		try {
		String[] vetor = sc.nextLine().split(" ");
		int posicao= sc.nextInt();
		System.out.println(vetor[posicao]);
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("posição inválida");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Imput erro");
		}
		sc.close();
		System.out.println("******METODO2 ///END*****");
		
	}

}
