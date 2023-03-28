package cola;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opcion = 0, nodo = 0;
		Cola cola = new Cola();

		
	do {
		try {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Men� de Opciones\n\n"
                    + "1. Insertar un nodo\n"
                    + "2. Extraer un nodo\n"
                    + "3. Estado de la cola\n"
                    + "4. Primer valor en la cola\n"
                    + "5. N�mero de nodos en la cola\n"                    
                    + "6. Mostrar contenido de la cola\n"
                    + "7. Salir.\n\n"));
			
			switch(opcion) {
			case 1:
                nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Por favor ingresa el valor a guardar en el nodo")); //JOptionPane.showInputDialog guarda variables tipo String y necesito Int, cambio el tipo de dato
                cola.InsertarNodo(nodo);				
				break;
			case 2:
				if(cola.ColaVacia()==false) {
                    JOptionPane.showMessageDialog(null, "El valor del nodo extra�do es " + cola.ExtraeNodo());
				}else {
					JOptionPane.showMessageDialog(null, "La cola est� vac�a.");
				}					
				break;
			case 3:
				if(cola.ColaVacia()==false) {
					JOptionPane.showMessageDialog(null, "La cola no est� vac�a");
				}else {
					JOptionPane.showMessageDialog(null, "La cola est� vac�a.");
				}				
				break;
			case 4:
				if(cola.ColaVacia()==false) {
					JOptionPane.showMessageDialog(null, "El �ltimo valor ingresado es " + cola.UltimoValor());
				}else {
					JOptionPane.showMessageDialog(null, "La cola est� vac�a.");
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "La cola contiene " + cola.tama�o() + " nodos.");
				break;
			case 6:
				if(cola.ColaVacia()==false) {
					cola.ValoresLista();
				}else {
					JOptionPane.showMessageDialog(null, "La cola est� vac�a.");
				}
				break;
			case 7:
				break;
			default:
                JOptionPane.showMessageDialog(null, "Opci�n incorrecta, vuelve intentar nuevamente.");
                break;
			}
		}catch (NumberFormatException e){
			
		}
	
	}while(opcion!=7);

}
}
