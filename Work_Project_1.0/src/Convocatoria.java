import processing.core.*;
import controlP5.*;

public class Convocatoria {
	
	public static boolean ofert (ControlP5 cp5,PFont font) {
		cp5.addButton("ingresar").hide();
		cp5.addButton("clear").hide();
		cp5.addButton("aceptar").hide();
		cp5.addButton("volver").hide();
		cp5.addButton("acceder").hide();
		cp5.addTextfield("user").hide();
		cp5.addTextfield("password").hide();
		cp5.addTextfield("nombre").hide();
		cp5.addTextfield("apellido").hide();
		cp5.addScrollableList("carrera").hide();
		cp5.addTextlabel("label").hide();
		String textVal = "";
		Textlabel Title;
		Title = cp5.addTextlabel("lab").setText("OFERTAS").setPosition(150,20).setFont(font);
		cp5.addButton("cerrar").setPosition(340,365).setSize(50,25);
		return true;
		}
}