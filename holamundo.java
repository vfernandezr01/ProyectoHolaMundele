package proyectoA;

import javax.swing.JOptionPane;

public class holamundo {
	
	public static void main(String[] args) {
		
		String nombre=JOptionPane.showInputDialog("Dame tu nombre");
		
		JOptionPane.showMessageDialog(null, "hola" + nombre);
	}

}
