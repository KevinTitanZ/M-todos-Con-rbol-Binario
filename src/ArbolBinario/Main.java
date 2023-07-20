package ArbolBinario;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArbolBinarioE arbol = new ArbolBinarioE();
		Scanner leer = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("------Bienvenido a mi Porgrama------");
			System.out.println("\n1-Insertar");
			System.out.println("\n2- Contar hojas");
			System.out.println("\n3- Imprimir");
			System.out.println("\n4- Localizar");
			System.out.println("\n5- Buscar");
			System.out.println("\n6- La suma de sus elementos que son múltiplos de 3.");
			System.out.println("\n7- La suma de sus elementos");
			System.out.println("\n8- Encuentre el nodo máximo y minimo");
			System.out.println("\n9-Salir");
			System.out.println("INGRESAR LA OPCION QUE DESEE");
			opcion = leer.nextInt();

			switch (opcion) {
			case 1:
				arbol.insertar("7");
				arbol.insertar("5");
				arbol.insertar("6");
				arbol.insertar("7");
				arbol.insertar("8");
				break;
			case 2:
				Nodo nodo1 = new Nodo("6");
				Nodo nodo2 = new Nodo("7");
				Nodo nodo3 = new Nodo("7");
				Nodo nodo4 = new Nodo("7");
				Nodo nodo5 = new Nodo("7");

				nodo1.setHijoIzquierdo(nodo2);
				nodo1.setHijoDerecho(nodo3);
				nodo2.setHijoIzquierdo(nodo4);
				nodo2.setHijoDerecho(nodo5);
				// Crear una instancia de ContadorHojas

				// Llamar al método contarHojas y mostrar el resultado
				int cantidadHojas = arbol.contarHojas(nodo1);
				System.out.println("El número de hojas en el árbol es: " + cantidadHojas);

				/*
				 * int cantidadHojas = arbol.contarHojas(arbol.getRaiz());
				 * System.out.println("Cantidad de hojas en el árbol: " + cantidadHojas);
				 */
				break;
			case 3:
				arbol.imprimirInOrden();
				break;
			case 4:
				// MAIN DE LOCALIZAR
				Nodo nodoEncontrado = arbol.localizar("B");
				if (nodoEncontrado != null) {
					System.out.println("Dato encontrado en el nodo: " + nodoEncontrado.getDato());
				} else {
					System.out.println("Dato no encontrado en el árbol.");
				}
				break;
			case 5:
				boolean encontrado = arbol.buscar("7");
				System.out.println("¿Se encontró el dato 'C'? " + encontrado);
				break;
			case 6:
				
				  // Crear el árbol de ejemplo
		        Nodo n1 = new Nodo("");
		        Nodo n2 = new Nodo("");
		        Nodo n3 = new Nodo("");
		        Nodo n4 = new Nodo("");
		        Nodo n5 = new Nodo("");

		        n1.setDato(12); // Múltiplo de 3
		        n2.setDato(7);
		        n3.setDato(9); // Múltiplo de 3
		        n4.setDato(6); // Múltiplo de 3
		        n5.setDato(15); // Múltiplo de 3

		        n1.setHijoIzquierdo(n2);
		        n1.setHijoDerecho(n3);
		        n2.setHijoIzquierdo(n4);
		        n2.setHijoDerecho(n5);
		        
		        int sumaMultiplosDeTres = arbol.calcularSumaMultiplosDeTres(n1);
		        System.out.println("La suma de los valores múltiplos de tres en el árbol es: " + sumaMultiplosDeTres);
		        
				//int sumaMultiplosDeTres = arbol.calcularSumaMultiplosDeTres(arbol.getRaiz());
				//System.out.println("Suma de los nodos múltiplos de tres del árbol: " + sumaMultiplosDeTres);
				break;
			case 7:
				Nodo nodo6 = new Nodo("");
				Nodo nodo7 = new Nodo("");
				Nodo nodo8 = new Nodo("");
				Nodo nodo9 = new Nodo("");
				Nodo nodo10 = new Nodo("");

				nodo6.setDato(5);
				nodo7.setDato(3);
				nodo8.setDato(7);
				nodo9.setDato(2);
				nodo10.setDato(8);

				nodo6.setHijoIzquierdo(nodo7);
				nodo6.setHijoDerecho(nodo8);
				nodo7.setHijoIzquierdo(nodo9);
				nodo7.setHijoDerecho(nodo10);
				// Crear una instancia de Cont
				// int sumaTotal = arbol.calcularSuma(arbol.getRaiz());
				// System.out.println("Suma de todos los nodos del árbol: " + sumaTotal);

				int sumaTotal = arbol.calcularSuma(nodo6);
				System.out.println("El número de hojas en el árbol es: " + sumaTotal);
				break;
			case 8:
				Nodo nodoMaximo = arbol.encontrarNodoMaximo();
				System.out.println("Nodo máximo del árbol: " + nodoMaximo.getDato());

				Nodo nodoMinimo = arbol.encontrarNodoMinimo();
				System.out.println("Nodo mínimo del árbol: " + nodoMinimo.getDato());
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("OPCION INCORRECTA");
			}
		} while (opcion != 5);

	}

}
