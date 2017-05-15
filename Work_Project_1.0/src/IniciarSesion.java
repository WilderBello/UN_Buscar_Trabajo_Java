//import processing.core.*;
import java.awt.*;

import javax.swing.*;

public class IniciarSesion extends JFrame{
	
	private final JLabel Lb0 = new JLabel("INICIAR SESION");
	private final JLabel Lb01 = new JLabel("Usuario:   ");
	private final JLabel Lb02 = new JLabel("Contraseña:   ");
	private final JTextField txt01 = new JTextField(23);
	private final JTextField txt02 = new JTextField(23);
	
	public static void main(String[] args) {
		JFrame frm = new IniciarSesion();
	    frm.setVisible(true);
	}
	
	public IniciarSesion(){
	     super("Iniciar sesion");
	     setLocation(350,150);
	     setSize(400,400);
	     setResizable(false);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     //TODO Adherir elementos
	     Container contenedor = getContentPane();
	     SpringLayout layout = new SpringLayout();
	     contenedor.setLayout(layout);
	     //Coordenadas de los elementos
	     //Usuario
	     layout.putConstraint(SpringLayout.WEST, Lb01,26, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb01,130, SpringLayout.NORTH, contenedor);
	     layout.putConstraint(SpringLayout.WEST, txt01,100, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, txt01,130, SpringLayout.NORTH, contenedor);
	   //Contraseña
	     layout.putConstraint(SpringLayout.WEST, Lb02,26, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb02,160, SpringLayout.NORTH, contenedor);
	     layout.putConstraint(SpringLayout.WEST, txt02,100, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, txt02,160, SpringLayout.NORTH, contenedor);
	   
	     //titulo
	     layout.putConstraint(SpringLayout.WEST, Lb0,150, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb0,95, SpringLayout.NORTH, contenedor);	     
	     
	     //Añadiendo componentes 
	     contenedor.add(Lb0);
	     contenedor.add(Lb01);
	     contenedor.add(txt01);
	     contenedor.add(Lb02);
	     contenedor.add(txt02);
	     
	    }
	/*TODO Solicitar datos al usuario: Usuario y contraseña
	 * 
	 */
	
	
}
