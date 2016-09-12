package editores;

import java.util.Stack;

import apliques.Quadro2;

import Interface.Fig;

public class Quadro3 extends Quadro2 {
	public Quadro3(int lar, int alt) {
		super(lar, alt);
	}

	// Pilha<Fig>
	// pundo = new Pilha<Fig>(),
	// predo = new Pilha<Fig>();

	Stack<Fig> pilhaundo = new Stack<Fig>(), pilharedo = new Stack<Fig>();

	public void addFig(Fig fig) {
		super.addFig(fig);
		pilhaundo.push(fig);
	}

	public void removeFig(Fig fig) {
		super.removeFig(fig);
		pilhaundo.removeElement(fig);
	}

	void undo() {
		if (pilhaundo.empty())
			return;
		Fig x;
		pilharedo.push(x = pilhaundo.pop());
		this.removeFig(x);
	}

	void redo() {
		if (pilharedo.empty())
			return;
		Fig x;
		pilhaundo.push(x = pilharedo.pop());
		this.addFig(x);
	}

}//