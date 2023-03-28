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
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menú de Opciones\n\n"
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
                    JOptionPane.showMessageDialog(null, "El valor extraído es " + posicion);
					}else {JOptionPane.showMessageDialog(null, "El valor no está en la pila");}
				}else {
					JOptionPane.showMessageDialog(null, "La pila está vacía.");
				}					
				break;
			case 3:
				if(!pila.isEmpty()) {
					JOptionPane.showMessageDialog(null, "La pila no está vacía");
				}else {
					JOptionPane.showMessageDialog(null, "La pila está vacía.");
				}				
				break;
			case 4:
				if(!pila.isEmpty()) {
					JOptionPane.showMessageDialog(null, "El valor extraído de la pila es " + pila.pop());
				}else {
					JOptionPane.showMessageDialog(null, "La pila está vacía.");
				}
				break;
			case 5:
				if(!pila.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Los valores en la pila son " + pila);
				}else {
					JOptionPane.showMessageDialog(null, "La pila está vacía.");
				}
				break;
			case 6:
				break;
			default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                break;
			}
		}catch (NumberFormatException e){
			
		}
	
	}while(opcion!=6);

}


}
