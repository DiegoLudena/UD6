package pila;

import javax.swing.JOptionPane;

public class Pila {
	
	private Nodo UltimoNodo; //permite conocer el ultimo valor ingresado
	//Inizializamos la lista con un tama�o de 0
	int tama�o = 0;
	String Lista =""; //Inicializamos la lista en blanco para poder mostrar todos los valores de la lista
	
	public Pila() {
		UltimoNodo = null;
		tama�o = 0;
	}
	
	//Metodo para saber si la pila est� vac�a
	public Boolean PilaVacia() {
		return UltimoNodo == null; //devuelve false si hay un ultimo valor ingresado distinto de null.
		
	}
	
	//Metodo para insertar un nodo en la pila
	public void InsertarNodo(int nodo) { //el atributo del constructor ser� la informaci�n del nuevo nodo
		Nodo NuevoNodo = new Nodo(nodo); //Construye el nuevo nodo
		NuevoNodo.siguiente = UltimoNodo; //Hace que el apuntador apunte al anterior nodo
		UltimoNodo = NuevoNodo; //Asigna a UltimoNodo el indice del nuevo nodo
		tama�o++; //Aumenta el tama�o de la lista
	}
	
	//Metodo para extraer un nodo de la pila
	public int ExtraeNodo() {
		int valor = UltimoNodo.informacion;
		UltimoNodo=UltimoNodo.siguiente; //hace que UltimoNodo sea el indice del anterior nodo en la lista
		tama�o--; //reduce el tama�o de la lista
		return valor;//la variable valor guarda el valor de la informacion del ultimo nodo ingresado y el m�todo la devuelve.
	}
	
	//Metodo para obtener el ultimo valor sin extraerlo
	public int UltimoValor() {
		return UltimoNodo.informacion;
	}
	
	//Metodo para conocer el tama�o de la pila
	public int tama�o() {
		return tama�o;
	}
	
	//Metodo para devolver los datos de la pila
	
	public void ValoresLista() {
		Nodo ultimo = UltimoNodo;
		
		while (ultimo != null) {
			Lista += ultimo.informacion + "\n"; //Va a�adiendo a la lista el valor de la informaci�n m�s un salto de linea para que sea m�s legible.
			ultimo = ultimo.siguiente; //Cambia el nodo al siguiente nodo en la lista, el que est� debajo en la pila.
		}
		JOptionPane.showMessageDialog(null, Lista);;
		Lista = ""; /*Limpia la lista para que si en el futuro cambian los valores de la pila porque se a�adan o se extraigan,
		al volver a llamar este m�todo muestre los valores actuales, no todos los que han pasado por la lista*/
		
	}
	
	
	
}
