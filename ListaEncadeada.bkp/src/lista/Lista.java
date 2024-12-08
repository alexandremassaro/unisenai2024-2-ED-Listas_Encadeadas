package lista;

public class Lista {
	protected No inicio;
	
	public Lista() {
		// Inicialmente vazia
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio==null;
	}
	
	public void inserir(int x) {
		if (vazia()) { // Lista vazia
			inicio = new No(x);
		}
		else {
			No novo = new No(x);
			No atual = inicio;
			// Método para buscar o final da lista
			while (atual.prox!=null) {
				atual = atual.prox;
			}
			atual.prox = novo;
		}
	}
	
	/**
	 * Percorre a lista e busca pela existência do elemento
	 * @param x
	 * @return retorna null se não existir, e o No se existir
	 */
	public No buscar(int x) {
		No atual = inicio;
		while (atual!=null && atual.dado!=x) {
			atual = atual.prox;
		}
		return atual;
	}
	
	/**
	 * 1) Buscar se existe o elemento existe
	 * 2) Caso exista, remover o elemento considerando:
	 *  - O elemento está no início
	 *  - O elemento está no final
	 *  - O elemento está no meio
	 * @param x
	 */
	public boolean remover(int x) {
		// Buscar o elemento
		No atual = inicio;
		No ant = null;
		if (vazia()) return false;
		while (atual!=null && atual.dado!=x) {
			ant = atual;
			atual = atual.prox;
		}
		// Elemento não encontrado
		if (atual==null) return false;
		if (x == inicio.dado) { // É o primeiro
			inicio = atual.prox;
		}
		else if (atual.prox == null) { // É o último
			ant.prox = null;
			atual = null;
		}
		else { // É o do meio
			ant.prox = atual.prox;
		}
		return true;
	}
	
	public void imprimir() {
		No atual = inicio;
		while (atual!=null) {
			System.out.print(atual.dado + " ");
			atual = atual.prox;
		}
		System.out.println();
	}

  public boolean alterar(int x, int n) {
    No atual = inicio;
    No ant = null;
    if (vazia()) return false;
    while (atual!=null && atual.dado!=x) {
      ant = atual;
      atual = atual.prox;
    }
    // Elemento não encontrado
    if (atual==null) return false;
    
    atual.dado = n;

    return true;
  }
	
}
