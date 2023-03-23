package pila;

import javax.swing.JOptionPane;

public class Pila {
	
	private Nodo UltimoNodo; //permite conocer el ultimo valor ingresado
	//Inizializamos la lista con un tamaño de 0
	int tamaño = 0;
	String Lista =""; //Inicializamos la lista en blanco para poder mostrar todos los valores de la lista
	
	public Pila() {
		UltimoNodo = null;
		tamaño = 0;
	}
	
	//Metodo para saber si la pila está vacía
	public Boolean PilaVacia() {
		return UltimoNodo == null; //devuelve false si hay un ultimo valor ingresado distinto de null.
		
	}
	
	//Metodo para insertar un nodo en la pila
	public void InsertarNodo(int nodo) { //el atributo del constructor será la información del nuevo nodo
		Nodo NuevoNodo = new Nodo(nodo); //Construye el nuevo nodo
		NuevoNodo.siguiente = UltimoNodo; //Hace que el apuntador apunte al anterior nodo
		UltimoNodo = NuevoNodo; //Asigna a UltimoNodo el indice del nuevo nodo
		tamaño++; //Aumenta el tamaño de la lista
	}
	
	//Metodo para extraer un nodo de la pila
	public int ExtraeNodo() {
		int valor = UltimoNodo.informacion;
		UltimoNodo=UltimoNodo.siguiente; //hace que UltimoNodo sea el indice del anterior nodo en la lista
		tamaño--; //reduce el tamaño de la lista
		return valor;//la variable valor guarda el valor de la informacion del ultimo nodo ingresado y el método la devuelve.
	}
	
	//Metodo para obtener el ultimo valor sin extraerlo
	public int UltimoValor() {
		return UltimoNodo.informacion;
	}
	
	//Metodo para conocer el tamaño de la pila
	public int tamaño() {
		return tamaño;
	}
	
	//Metodo para devolver los datos de la pila
	
	public void ValoresLista() {
		Nodo ultimo = UltimoNodo;
		
		while (ultimo != null) {
			Lista += ultimo.informacion + "\n"; //Va añadiendo a la lista el valor de la información más un salto de linea para que sea más legible.
			ultimo = ultimo.siguiente; //Cambia el nodo al siguiente nodo en la lista, el que está debajo en la pila.
		}
		JOptionPane.showMessageDialog(null, Lista);;
		Lista = ""; /*Limpia la lista para que si en el futuro cambian los valores de la pila porque se añadan o se extraigan,
		al volver a llamar este método muestre los valores actuales, no todos los que han pasado por la lista*/
		
	}
	
	
	
}
