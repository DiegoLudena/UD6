package pila;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opcion = 0, nodo = 0;
		Pila pila = new Pila();

		
	do {
		try {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menú de Opciones\n\n"
                    + "1. Insertar un nodo\n"
                    + "2. Extraer un nodo\n"
                    + "3. Estado de la pila\n"
                    + "4. Último valor ingresado en la pila\n"
                    + "5. Número de nodos en la pila\n"                    
                    + "6. Mostrar contenido de la Pila\n"
                    + "7. Salir.\n\n"));
			
			switch(opcion) {
			case 1:
                nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Por favor ingresa el valor a guardar en el nodo")); //JOptionPane.showInputDialog guarda variables tipo String y necesito Int, cambio el tipo de dato
                pila.InsertarNodo(nodo);				
				break;
			case 2:
				if(pila.PilaVacia()==false) {
                    JOptionPane.showMessageDialog(null, "El valor del nodo extraído es " + pila.ExtraeNodo());
				}else {
					JOptionPane.showMessageDialog(null, "La pila está vacía.");
				}					
				break;
			case 3:
				if(pila.PilaVacia()==false) {
					JOptionPane.showMessageDialog(null, "La pila no está vacía");
				}else {
					JOptionPane.showMessageDialog(null, "La pila está vacía.");
				}				
				break;
			case 4:
				if(pila.PilaVacia()==false) {
					JOptionPane.showMessageDialog(null, "El último valor ingresado es " + pila.UltimoValor());
				}else {
					JOptionPane.showMessageDialog(null, "La pila está vacía.");
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "La pila contiene " + pila.tamaño() + " nodos.");
				break;
			case 6:
				if(pila.PilaVacia()==false) {
					pila.ValoresLista();
				}else {
					JOptionPane.showMessageDialog(null, "La pila está vacía.");
				}
				break;
			case 7:
				break;
			default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta.");
                break;
			}
		}catch (NumberFormatException e){
			
		}
	
	}while(opcion!=7);

}
}
