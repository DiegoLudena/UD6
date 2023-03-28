package colecciones;

import java.util.LinkedList;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Pila {
	
	public static void main(String[] args) {
		
		Stack <String>  pila =  new Stack<>(); //creo la pila
		int opcion = 0;
	
	do {
		try {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Men� de Opciones\n\n"
                    + "1. Insertar un valor\n"
                    + "2. Extraer un valor\n"
                    + "3. Estado de la pila\n"
                    + "4. Extraer el primer valor en la pila\n"             
                    + "5. Mostrar contenido de la pila\n"
                    + "6. Salir.\n\n"));
			
			switch(opcion) {
			case 1:
				String valor;
		        valor = JOptionPane.showInputDialog(null, "Por favor ingresa el valor a guardar la pila"); 
		        pila.push(valor);		
				break;
			case 2:
				if(!pila.isEmpty()) {
					String posicion;
					posicion = JOptionPane.showInputDialog(null, "Indica el valor que quieres extraer");
					if (pila.remove(posicion)){
						pila.remove(posicion);
                    JOptionPane.showMessageDialog(null, "El valor extra�do es " + posicion);
					}else {JOptionPane.showMessageDialog(null, "El valor no est� en la pila");}
				}else {
					JOptionPane.showMessageDialog(null, "La pila est� vac�a.");
				}					
				break;
			case 3:
				if(!pila.isEmpty()) {
					JOptionPane.showMessageDialog(null, "La pila no est� vac�a");
				}else {
					JOptionPane.showMessageDialog(null, "La pila est� vac�a.");
				}				
				break;
			case 4:
				if(!pila.isEmpty()) {
					JOptionPane.showMessageDialog(null, "El valor extra�do de la pila es " + pila.pop());
				}else {
					JOptionPane.showMessageDialog(null, "La pila est� vac�a.");
				}
				break;
			case 5:
				if(!pila.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Los valores en la pila son " + pila);
				}else {
					JOptionPane.showMessageDialog(null, "La pila est� vac�a.");
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
