package view;

import java.util.Scanner;

import lista.Lista;
import lista.No;

public class InterfaceLista {
	private Lista lista;
	private Scanner scan;
	
	public InterfaceLista(Lista lista) {
		this.lista = lista;
		scan = new Scanner(System.in);
	}
	
	public void inserir() {
		int x;
		System.out.print(" > Valor a inserir: ");
		x = scan.nextInt();
		lista.inserir(x);
	}
	
	public void imprimir() {
		lista.imprimir();
	}
	
	public void buscar() {
		System.out.print(" > Buscar elemento: ");
		int x = scan.nextInt();
		No item = lista.buscar(x);
		if (item!=null) {
			System.out.println("Elemento " + x + " encontrado!");
		}
		else {
			System.out.println("Elemento nao encontrado!");
		}
	}
	
	public void remover() {
		int x;
		System.out.print(" > Valor a remover: ");
		x = scan.nextInt();
		boolean sucesso = lista.remover(x);
		if (sucesso) {
			System.out.println("Item removido com sucesso!");
		}
		else {
			System.out.println("Ocorreu um erro ao remover o item!");
		}
	}
	
}
