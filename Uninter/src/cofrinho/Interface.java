package cofrinho;

import java.util.Scanner;

//Criei essa classe pra separar a interface da logica do projeto
public class Interface extends Cofrinho{
	public static double moeda;
	public static int opção;
	public static int tipo;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Olá, Bem-vindo(a) ao Cofrinho java");
		menu();
		return;
	}
	
	public static void menu() throws InterruptedException  {

		Scanner usuario = new Scanner(System.in);
		System.out.println("Selecione umas das opção abaixo");
		Thread.sleep(500);
		System.out.println("1 - Adicionar moeda \n2 - Listar moeda(s) \n3 - Remover moedas \n4 - Converter tudo pra real \n5 - Sair");
		Thread.sleep(200);
		opção = usuario.nextInt();
		
		//Adicionar moedas
		if(opção == 1) {
			System.out.println("Selecione o tipo de moeda");
			System.out.println("1 - Real \n2 - Dolar \n3 - Euro \n4 - Voltar");
			tipo = usuario.nextInt();
			Thread.sleep(500);
			System.out.println("Digite o valor:");
			moeda = usuario.nextDouble();
			if(tipo == 1) {
				adicionar(moeda,"real");
				menu();
			}
			if(tipo == 2) {
				adicionar(moeda,"dolar");
				menu();
			}
			if(tipo == 3) {
				adicionar(moeda,"euro");
				menu();
			}
		}
		//Listar moedas
		if(opção == 2) {
			System.out.println("Moedas listadas");
			listar();
			Thread.sleep(500);
			menu();
		}
		//Remover moeda
		if(opção == 3) {
			System.out.println("Selecione qual moeda deseja remover");
			Thread.sleep(500);
			listar();
			opção = usuario.nextInt();
			remover(opção);
			menu();
		}
		//Converter tudo pra real
		if(opção == 4) {
			conveter();
			menu();
		}
		if(opção == 5) {
			System.out.println("Tchau!");
			System.exit(0);
			
		}
		else if(opção >= 6) {
			System.out.println("Opção invalida!");
			menu();
		}
	}
}


