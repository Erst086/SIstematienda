package fes.aragon.herramienta;

public class Pila<E> {
	public ListaSimple<E> pila = new ListaSimple<>();

	public void borrar() {
		pila = new ListaSimple<>();
	}
	public void longitud() {
		pila.getLongitud();
	}

	public boolean estaVacia() {
		return pila.esVacia();
	}

	public void insertar(E dato) {
		pila.agregarEnCola(dato);
	}

	public E extraer() throws Exception {
		E tmp = null;
		if (!estaVacia()) {
			tmp = pila.obtenerCola();
			pila.eliminarCola();
		} else {
			throw new Exception("Pila vacía");
		}

		return tmp;
	}

	public E elementoSuperior() throws Exception {
		E tmp = null;
		if(!estaVacia()) {
			tmp = pila.obtenerCola();
			
		} else {
			throw new Exception("Pila vacia");
		}
		return tmp;
	}
	public String toString(char ch){
		String cadena = "";
		cadena += String.valueOf(ch);
		return  cadena;
	}

	
}
