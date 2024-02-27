package rodriSports;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int escolha;

		System.out.println("::::::::::::::::::::   BEM VINDO A RODRISPORTS :::::::::::::::::");
		System.out.println("Selecione uma das opções abaixo para continuar:");
		System.out.println("Digite 1 para REALIZAR SEU CADASTRO");
		System.out.println("Digite 2 para ATUALIZAR CADASTRO");
		System.out.println("Digite 3 para DELETAR CADASTRO");
		System.out.println("Digite 4 para BUSCAR POR MATERIAL ESPORTIVO");
		System.out.println("Digite 0 para  SAIR");
		System.out.print("O que deseja fazer?  ");

		escolha = leia.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Digite seu CPF para cadastro");
			break;
		case 2:
			System.out.println("Digite seu ID para atualizar cadastro");
			break;
		case 3:
			System.out.println("Digite seu ID para deletar cadastro ");
			break;
		case 4:
			System.out.println("Digite o nome do produto para encontra-lo ");
			break;
		case 0:
			System.out.println("Muito obrigado e até a proxima ");
			break;
		default:
			System.out.println("Opção inválida ");

		}

	}

}
