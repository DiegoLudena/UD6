package colecciones;

import java.util.ArrayDeque;
import java.util.Queue;

import javax.swing.JOptionPane;


public class Cola {

	public static void main(String[] args) {
		
		Queue <String> cola =  new ArrayDeque<>(); //creo la cola
		int opcion = 0;
	
	do {
		try {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Men� de Opciones\n\n"
                    + "1. Insertar un nodo\n"
                    + "2. Extraer un nodo\n"
                    + "3. Estado de la cola\n"
                    + "4. Extraer el primer valor en la cola\n"             
                    + "5. Mostrar contenido de la cola\n"
                    + "6. Salir.\n\n"));
			
			switch(opcion) {
			case 1:
				String valor;
		        valor = JOptionPane.showInputDialog(null, "Por favor ingresa el valor a guardar la cola"); 
		        cola.add(valor);		
				break;
			case 2:
				if(!cola.isEmpty()) {
					String posicion;
					posicion = JOptionPane.showInputDialog(null, "Indica el valor que quieres extraer");
					if (cola.remove(posicion)){
						cola.remove(posicion);
                    JOptionPane.showMessageDialog(null, "El valor extra�do es " + posicion);
					}else {JOptionPane.showMessageDialog(null, "El valor no est� en la cola");}
				}else {
					JOptionPane.showMessageDialog(null, "La cola est� vac�a.");
				}					
				break;
			case 3:
				if(!cola.isEmpty()) {
					JOptionPane.showMessageDialog(null, "La cola no est� vac�a");
				}else {
					JOptionPane.showMessageDialog(null, "La cola est� vac�a.");
				}				
				break;
			case 4:
				if(!cola.isEmpty()) {
					JOptionPane.showMessageDialog(null, "El valor extra�do de la cola es " + cola.remove());
				}else {
					JOptionPane.showMessageDialog(null, "La cola est� vac�a.");
				}
				break;
			case 5:
				if(!cola.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Los valores en la cola son " + cola);
				}else {
					JOptionPane.showMessageDialog(null, "La cola est� vac�a.");
				}
				break;
			case 6:
				break;
			default:
                JOptionPane.showMessageDialog(null, "Opci�n incorrecta, vuelve intentar nuevamente.");
                break;
			}
		}catch (NumberFormatException e){
			
		}
	
	}while(opcion!=6);

}


}
