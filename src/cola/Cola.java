package cola;
import pila.Nodo; //Importo la clase Nodo del paquete pila
import javax.swing.JOptionPane;

public class Cola {		
	private Nodo primeroCola, ultimoCola; //permite conocer el primer y el último valor de la cola 
	//Inizializamos la lista con un tamaño de 0
	int tamaño = 0;
	String Lista =""; //Inicializamos la lista en blanco para poder mostrar todos los valores de la lista
	
	public Cola() {
		primeroCola = null;
		ultimoCola=null;
		tamaño = 0;
		}
		
	//Metodo para saber si la pila está vacía
	public Boolean ColaVacia() {
		return primeroCola == null; //devuelve false si hay un valor ingresado distinto de null.
			
	}
		
	//Metodo para insertar un nodo en la pila
	public void InsertarNodo(int nodo) { //el atributo del constructor será la información del nuevo nodo
		Nodo NuevoNodo = new Nodo(nodo); //Construye el nuevo nodo
		NuevoNodo.siguiente = null; //El último valor de una cola no apunta a ningun valor
		if(ColaVacia()==true) { //si la cola está vacía, el nuevo nodo será tanto el primero como el último
			primeroCola = NuevoNodo;
			ultimoCola = NuevoNodo;
		}else { //si no está vacía hacemos que el anterior nodo apunte a este nuevo nodo, y declaramos este nuevo nodo como el último.
			ultimoCola.siguiente = NuevoNodo;
			ultimoCola = NuevoNodo;
		}
		tamaño++; //Aumenta el tamaño de la lista
	}
		
	//Metodo para extraer un nodo de la pila
	public int ExtraeNodo() {
		int valor = primeroCola.informacion;
		primeroCola=primeroCola.siguiente; //hace que el primer nodo en la cola sea el anterior nodo en la lista
		tamaño--; //reduce el tamaño de la lista
		return valor;//la variable valor guarda el valor de la informacion del ultimo nodo ingresado y el método la devuelve.
	}
		
	//Metodo para obtener el ultimo valor sin extraerlo
	public int UltimoValor() {
		return primeroCola.informacion;
	}
		
	//Metodo para conocer el tamaño de la pila
	public int tamaño() {
		return tamaño;
	}
		
	//Metodo para devolver los datos de la pila
		
	public void ValoresLista() {
		Nodo primero = primeroCola;
			
		while (primero != null) {
			Lista += primero.informacion + "\n"; //Va añadiendo a la lista el valor de la información más un salto de linea para que sea más legible.
			primero = primero.siguiente; //Cambia el nodo al siguiente nodo en la lista, el que está detrás en la cola.
		}
		JOptionPane.showMessageDialog(null, Lista);;
		Lista = ""; /*Limpia la lista para que si en el futuro cambian los valores de la pila porque se añadan o se extraigan,
		al volver a llamar este método muestre los valores actuales, no todos los que han pasado por la lista*/
			
		}
		
		
		
	}



