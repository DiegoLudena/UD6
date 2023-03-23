package cola;
import pila.Nodo; //Importo la clase Nodo del paquete pila
import javax.swing.JOptionPane;

public class Cola {		
	private Nodo primeroCola, ultimoCola; //permite conocer el primer y el �ltimo valor de la cola 
	//Inizializamos la lista con un tama�o de 0
	int tama�o = 0;
	String Lista =""; //Inicializamos la lista en blanco para poder mostrar todos los valores de la lista
	
	public Cola() {
		primeroCola = null;
		ultimoCola=null;
		tama�o = 0;
		}
		
	//Metodo para saber si la pila est� vac�a
	public Boolean ColaVacia() {
		return primeroCola == null; //devuelve false si hay un valor ingresado distinto de null.
			
	}
		
	//Metodo para insertar un nodo en la pila
	public void InsertarNodo(int nodo) { //el atributo del constructor ser� la informaci�n del nuevo nodo
		Nodo NuevoNodo = new Nodo(nodo); //Construye el nuevo nodo
		NuevoNodo.siguiente = null; //El �ltimo valor de una cola no apunta a ningun valor
		if(ColaVacia()==true) { //si la cola est� vac�a, el nuevo nodo ser� tanto el primero como el �ltimo
			primeroCola = NuevoNodo;
			ultimoCola = NuevoNodo;
		}else { //si no est� vac�a hacemos que el anterior nodo apunte a este nuevo nodo, y declaramos este nuevo nodo como el �ltimo.
			ultimoCola.siguiente = NuevoNodo;
			ultimoCola = NuevoNodo;
		}
		tama�o++; //Aumenta el tama�o de la lista
	}
		
	//Metodo para extraer un nodo de la pila
	public int ExtraeNodo() {
		int valor = primeroCola.informacion;
		primeroCola=primeroCola.siguiente; //hace que el primer nodo en la cola sea el anterior nodo en la lista
		tama�o--; //reduce el tama�o de la lista
		return valor;//la variable valor guarda el valor de la informacion del ultimo nodo ingresado y el m�todo la devuelve.
	}
		
	//Metodo para obtener el ultimo valor sin extraerlo
	public int UltimoValor() {
		return primeroCola.informacion;
	}
		
	//Metodo para conocer el tama�o de la pila
	public int tama�o() {
		return tama�o;
	}
		
	//Metodo para devolver los datos de la pila
		
	public void ValoresLista() {
		Nodo primero = primeroCola;
			
		while (primero != null) {
			Lista += primero.informacion + "\n"; //Va a�adiendo a la lista el valor de la informaci�n m�s un salto de linea para que sea m�s legible.
			primero = primero.siguiente; //Cambia el nodo al siguiente nodo en la lista, el que est� detr�s en la cola.
		}
		JOptionPane.showMessageDialog(null, Lista);;
		Lista = ""; /*Limpia la lista para que si en el futuro cambian los valores de la pila porque se a�adan o se extraigan,
		al volver a llamar este m�todo muestre los valores actuales, no todos los que han pasado por la lista*/
			
		}
		
		
		
	}



