package modelos;

import java.util.ArrayList;
import java.util.List;

class Pilha<T> {

	private List<T> pilha = new ArrayList<T>();
	private int prox = 0;

	void push(T x) {
		pilha.add(prox++, x);

	}

	T pop() {
		return pilha.remove(--prox);
	}

	T top() {
		return pilha.get(prox - 1);

	}

	boolean empty() {
		return prox == 0;
	}

	boolean removeElement(T x) {
		prox--;// cf. aula
		return pilha.remove(x);
	}

}//