//import processing.core.*;

import java.awt.*;
import javax.swing.*;
public class Nuevo extends JFrame{
	// TODO textbox encontrados en: http://mrtoymo.blogspot.com.co/2012/09/como-crear-cajas-de-texto-para-meter.html
	
	private final JLabel Lb0 = new JLabel("CREAR CUENTA");
	private final JLabel Lb00 = new JLabel("*Por favor ingrese la totalidad de los datos solicitados");
	private final JLabel Lb01 = new JLabel("Usuario:   ");
	private final JLabel Lb02 = new JLabel("Contraseña:   ");
	private final JLabel Lb03 = new JLabel("Nombres:   ");
	private final JLabel Lb04 = new JLabel("Apellidos:   ");
	private final JLabel Lb05 = new JLabel("Telefono:   ");
	private final JLabel Lb06 = new JLabel("Carrera:   ");
	private final JTextField txt01 = new JTextField(23);
	private final JTextField txt02 = new JTextField(23);
	private final JTextField txt03 = new JTextField(23);
	private final JTextField txt04 = new JTextField(23);
	private final JTextField txt05 = new JTextField(23);
	private final JTextField txt06 = new JTextField(23);

	public static void main(String[] args) {
		JFrame frm = new Nuevo();
	     frm.setVisible(true);
	}
	
	public Nuevo(){
	     super("Nuevo Usuario");
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
	     layout.putConstraint(SpringLayout.NORTH, Lb01,50, SpringLayout.NORTH, contenedor);
	     layout.putConstraint(SpringLayout.WEST, txt01,100, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, txt01,50, SpringLayout.NORTH, contenedor);
	   //Contraseña
	     layout.putConstraint(SpringLayout.WEST, Lb02,26, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb02,80, SpringLayout.NORTH, contenedor);
	     layout.putConstraint(SpringLayout.WEST, txt02,100, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, txt02,80, SpringLayout.NORTH, contenedor);
	   //Nombres
	     layout.putConstraint(SpringLayout.WEST, Lb03,26, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb03,110, SpringLayout.NORTH, contenedor);
	     layout.putConstraint(SpringLayout.WEST, txt03,100, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, txt03,110, SpringLayout.NORTH, contenedor);
	   //Apellidos
	     layout.putConstraint(SpringLayout.WEST, Lb04,26, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb04,140, SpringLayout.NORTH, contenedor);
	     layout.putConstraint(SpringLayout.WEST, txt04,100, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, txt04,140, SpringLayout.NORTH, contenedor);
	   //Telefono
	     layout.putConstraint(SpringLayout.WEST, Lb05,26, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb05,170, SpringLayout.NORTH, contenedor);
	     layout.putConstraint(SpringLayout.WEST, txt05,100, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, txt05,170, SpringLayout.NORTH, contenedor);
	   //Carrera
	     layout.putConstraint(SpringLayout.WEST, Lb06,26, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb06,200, SpringLayout.NORTH, contenedor);
	     layout.putConstraint(SpringLayout.WEST, txt06,100, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, txt06,200, SpringLayout.NORTH, contenedor);
	     //Observación
	     layout.putConstraint(SpringLayout.WEST, Lb00,26, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb00,230, SpringLayout.NORTH, contenedor);
	     //titulo
	     layout.putConstraint(SpringLayout.WEST, Lb0,150, SpringLayout.WEST, contenedor);
	     layout.putConstraint(SpringLayout.NORTH, Lb0,25, SpringLayout.NORTH, contenedor);	     
	     
	     //Añadiendo componentes 
	     contenedor.add(Lb0);
	     contenedor.add(Lb00);
	     contenedor.add(Lb01);
	     contenedor.add(txt01);
	     contenedor.add(Lb02);
	     contenedor.add(txt02);
	     contenedor.add(Lb03);
	     contenedor.add(txt03);
	     contenedor.add(Lb04);
	     contenedor.add(txt04);
	     contenedor.add(Lb05);
	     contenedor.add(txt05);
	     contenedor.add(Lb06);
	     contenedor.add(txt06);
	    }
	
	/*TODO ingresar datos de usuario como: Nombre, apellido, usuario, contraseña, carrera
	 * 
	 */
	
}
