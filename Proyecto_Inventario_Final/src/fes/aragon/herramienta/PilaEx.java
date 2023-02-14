package fes.aragon.herramienta;

public class PilaEx {

	private char pila[];
	private char dato;
	private int tope = -1;
	private int max = 0;
	private boolean res;

	public PilaEx(int max) {
		this.max = max;
		pila = new char[max];// se crea un arreglo del tamano pasado ateriormente
		dato = 0;
	}

	public PilaEx() {
		// TODO Auto-generated constructor stub
	}

	public void borrarpila() {// metodo para borrar toda la pila
		tope = -1;// mandamos el tope al principio, esto indica que la pila esta vacia
	}

	public boolean llena() {// metodo para cuando la pila esta llena
		if (tope == (max - 1)) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}

	public boolean vacia() {// metodo para cuando la pila es vacia
		if (tope == -1) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}

	// Los metodos push y pop te permiten simular una pila de objetos LIFO (al ultimo
	// en entrar, primero en salir).
	public boolean push(char dato) {// Metodo por si la pia esta llena
		if (llena()) {
			System.err.print("Error: Pila llena");// Si la pila esta llena nos manda un error
		} else {// Si la pila esta vacia continua con el progama
			tope++;
			pila[tope] = dato;
			res = true;
		}
		return res;
	}

	public char pop() {
		if (vacia()) {
			System.err.print("Sub-Desbordamiento: Pila vacia");
		} else {
			dato = pila[tope];
			tope--;
		}
		return dato;
	}

	public char getTope() {// Retorna un valor
		char top = 0;
		if (vacia()) {
		} else
			top = pila[tope];
		return top;
	}

	public String copiarPila(Object[] pila) {
		Object[] copy = new Object[pila.length];// Devuelve el número de caracteres del String.
		String muestra = "";
		System.arraycopy(pila, 0, copy, 0, pila.length);
		for (int i = 0; i > copy.length; i++) {
			muestra += copy[i] + " ";
		}
		return muestra;
	}
}
