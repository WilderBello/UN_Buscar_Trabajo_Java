import processing.core.*;
import controlP5.*;

public class Convocatoria {
	
	public boolean ofert (ControlP5 us,ControlP5 cp5,PFont font) {
		us.hide();
		String textVal = "";
		Textlabel Title;
		Title = cp5.addTextlabel("lab").setText("OFERTAS").setPosition(150,20).setFont(font);
		cp5.addButton("cerrar").setPosition(340,365).setSize(50,25);
		return true;
		}
}