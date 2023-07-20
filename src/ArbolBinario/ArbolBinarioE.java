package ArbolBinario;

import javax.swing.JOptionPane;

public class ArbolBinarioE {
	private Nodo raiz;

	public ArbolBinarioE() {
		raiz = null;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	public Nodo localizar(Object dato) {
		return localizar(raiz, dato);
	}

	private Nodo localizar(Nodo nodo, Object dato) {
		if (nodo == null || dato == null) {
			return null;
		}

		if (dato.equals(nodo.getDato())) {
			return nodo;
		}

		Nodo nodoEncontrado = localizar(nodo.getHijoIzquierdo(), dato);
		if (nodoEncontrado == null) {
			nodoEncontrado = localizar(nodo.getHijoDerecho(), dato);
		}

		return nodoEncontrado;
	}

	// Método para buscar un dato en el árbol
	public boolean buscar(Object dato) {
		return buscar(raiz, dato);
	}

	private boolean buscar(Nodo nodo, Object dato) {
		if (nodo == null || dato == null) {
			return false;
		}

		if (dato.equals(nodo.getDato())) {
			return true;
		}

		return buscar(nodo.getHijoIzquierdo(), dato) || buscar(nodo.getHijoDerecho(), dato);
	}

	// Método para insertar un dato en el árbol
	public void insertar(Object dato) {
		raiz = insertar(raiz, dato);
	}

	private Nodo insertar(Nodo nodo, Object dato) {
		if (nodo == null) {
			return new Nodo(dato);
		}

		if (nodo.getHijoIzquierdo() == null) {
			nodo.setHijoIzquierdo(insertar(nodo.getHijoIzquierdo(), dato));
		} else {
			nodo.setHijoDerecho(insertar(nodo.getHijoDerecho(), dato));
		}

		return nodo;
	}

	//metodo para contar las hojas
	public int contarHojas(Nodo nodo) {
		if (nodo == null) {
			return 0;
		} else if (nodo.getHijoIzquierdo() == null && nodo.getHijoDerecho() == null) {
			return 1;
		} else {
			int hojasIzquierdo = contarHojas(nodo.getHijoIzquierdo());
			int hojasDerecho = contarHojas(nodo.getHijoDerecho());
			return hojasIzquierdo + hojasDerecho;
		}
	}
	//metodo para calcular suma
	public int calcularSuma(Nodo nodo) {
		if (nodo == null) {
			return 0;
		} else {
			int sumaIzquierdo = calcularSuma(nodo.getHijoIzquierdo());
			int sumaDerecho = calcularSuma(nodo.getHijoDerecho());

			int valorActual = (int) nodo.getDato();

			return valorActual + sumaIzquierdo + sumaDerecho;
		}
	}

	//Método para calcular la suma de los elementos múltiplos de 3 del árbol
	public int calcularSumaMultiplosDeTres(Nodo nodo) {
		if (nodo == null) {
			return 0;
		} else {
			int sumaIzquierdo = calcularSumaMultiplosDeTres(nodo.getHijoIzquierdo());
			int sumaDerecho = calcularSumaMultiplosDeTres(nodo.getHijoDerecho());

			int sumaActual = 0;

			if (nodo.getDato() instanceof Integer) {
				int valorActual = (int) nodo.getDato();
				if (valorActual % 3 == 0) {
					sumaActual = valorActual;
				}
			}

			return sumaActual + sumaIzquierdo + sumaDerecho;
		}
	}

	//Metodo para calcular el tamaño del arbol
	private int calcularTamaño(Nodo nodo) {
		if (nodo == null) {
			return 0;
		}

		int tamañoIzquierdo = calcularTamaño(nodo.getHijoIzquierdo());
		int tamañoDerecho = calcularTamaño(nodo.getHijoDerecho());

		return 1 + tamañoIzquierdo + tamañoDerecho;
	}

	//Recorrido en orden
	public void imprimirInOrdenRecursivo(Nodo nodo) {
		if (nodo != null) {
			imprimirInOrdenRecursivo(nodo.getHijoIzquierdo());
			System.out.println(nodo.getDato());
			imprimirInOrdenRecursivo(nodo.getHijoDerecho());
		}
	}	
	//Recorrido pre orden
	public void preOrden(Nodo nodo) {
		if (nodo != null) {
			JOptionPane.showMessageDialog(null,nodo.getDato());
			preOrden(nodo.getHijoIzquierdo());
			preOrden(nodo.getHijoDerecho());
		}
	}
	//Recorrido post orden
	public void postOrden(Nodo nodo) {
		if (nodo != null) {
			postOrden(nodo.getHijoIzquierdo());
			postOrden(nodo.getHijoDerecho());
			JOptionPane.showMessageDialog(null,nodo.getDato());
		}
	}
	//IMPRESION
	public void imprimirInOrden() {
		System.out.println("Recorrido en orden");
		imprimirInOrdenRecursivo(raiz);
	}

	public void imprimirPostOrden() {
		JOptionPane.showMessageDialog(null,"Recorrido post orden");
		postOrden(raiz);
	}

	public void imprimirPreOrden() {
		JOptionPane.showMessageDialog(null,"Recorrido pre orden");
		preOrden(raiz);
	}

	public int calcularTamaño() {
		return calcularTamaño(raiz);
	}

	//encontrar maximo
	private Nodo encontrarNodoMaximo(Nodo nodo) {
		if (nodo == null) {
			return null;
		}
		while (nodo.getHijoDerecho() != null) {
			nodo = nodo.getHijoDerecho();
		}
		return nodo;
	}
	//impresion del metodo encontrar nodo maximo
	public Nodo encontrarNodoMaximo() {
		return encontrarNodoMaximo(raiz);
	}

	//encontrar el minimo
	private Nodo encontrarNodoMinimo(Nodo nodo) {
		if (nodo == null) {
			return null;
		}   
		while (nodo.getHijoIzquierdo() != null) {
			nodo = nodo.getHijoIzquierdo();
		}
		return nodo;
	}
	//impresion del metodo encontrar nodo minimo
	public Nodo encontrarNodoMinimo() {
		return encontrarNodoMinimo(raiz);
	}
}
