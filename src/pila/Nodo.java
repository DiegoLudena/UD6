package pila;

//Esta clase crea nuevos nodos cada vez que introducimos un nuevo valor

public class Nodo {
	//el nodo tiene dos campos: el primero contiene la informacion, que vamos a hacer un int por ejemplo, y el segundo apunta al siguiente nodo
	//Los he hecho publicos para poder usarlos en el paquete cola
	public int informacion;
	public Nodo siguiente;

	//el constructor guarda lo que contiene cada nodo
	public Nodo (int valor) {
		informacion = valor;
		siguiente = null; //el apuntador inicial, que será el ultimo de la pila, debe ser nulo
	}
	
}
