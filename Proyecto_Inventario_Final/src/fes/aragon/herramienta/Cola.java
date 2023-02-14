package fes.aragon.herramienta;

public class Cola<E> {
	private ListaSimple<E> cola = new ListaSimple<>();

	public void borrar() {
		cola = new ListaSimple<>();
	}

	public boolean estaVacia() {
		return cola.esVacia();
	}

	public void insertar(E dato) {
		cola.agregarEnCola(dato);
	}

	public E extraer() throws Exception {
		E tmp = null;
		if (!estaVacia()) {
			tmp = cola.obtenerCabeza();
			cola.eliminarCabeza();
		} else {
			throw new Exception("Cola vacia");
		}
		return tmp;
	}

	public E elementoSuperior() throws Exception{
		E tmp = null;
		if (!estaVacia()) {
			tmp = cola.obtenerCabeza();
			cola.agregarEnCabeza(tmp);
		}else {
			throw new Exception("Cola vacia");
		}
		return tmp;
	}

}