import processing.core.*;
import java.util.*;
import controlP5.*;


public class Usuario extends EmpleandoUN{
	
	public static boolean init (ControlP5 cp5,PFont font) {
		inicio.hide();
		cp5.addTextfield("user").setPosition(100,100).setSize(200,30).setFont(font).setAutoClear(false);     
		cp5.addTextfield("password").setPosition(100,170).setSize(200,30).setFont(font).setAutoClear(false);
		//TODO Botón    
		cp5.addButton("acceder").setPosition(110,240).setSize(80,40);
		cp5.addButton("volver").setPosition(210,240).setSize(80,40);
		return true;
	}
	
	public static boolean crear (ControlP5 cp5,PFont font) {
		inicio.hide();
		String textVal = "";
		Textlabel Titulo;
		Titulo = cp5.addTextlabel("label").setText("CREAR NUEVO USUARIO").setPosition(70,20).setFont(font);
		cp5.addTextfield("user").setPosition(100,60).setSize(200,30).setFont(font).setAutoClear(false);      
		cp5.addTextfield("password").setPosition(100,95+15).setSize(200,30).setFont(font).setAutoClear(false);
		cp5.addTextfield("nombre").setPosition(100,145+15).setSize(200,30).setFont(font).setAutoClear(false);
		cp5.addTextfield("apellido").setPosition(100,195+15).setSize(200,30).setFont(font).setAutoClear(false);
		cp5.addButton("aceptar").setPosition(110,305+15).setSize(80,40);
		cp5.addButton("volver").setPosition(210,305+15).setSize(80,40);		  
		cp5.addButton("clear").setPosition(340,365).setSize(50,25);	
		List l = Arrays.asList("Arquitectura","Artes Plásticas", "Cine y Televisión",
			  "Diseño Gráfico","Diseño Industrial","Música","Música Instrumental", 
			  "Biología","Estadística","Farmacia","Física","Geología","Matemáticas",
			  "Química","Administración de Empresas","Contaduría Pública","Economía",
			  "Antropología","Español y Filología Clásica","Estudios Literarios",
			  "Filología e Idiomas (Alemán)","Filología e Idiomas (Francés)","Filología e Idiomas (Inglés)",
			  "Filosofía","Geografía","Historia","Lingüística","Psicología","Sociología",
			  "Trabajo Social","Ciencia Política","Derecho","Enfermería","Ingeniería Agrícola",
			  "Ingeniería Civil","Ingeniería de Sistemas y Computación","Ingeniería Eléctrica",
			  "Ingeniería Electrónica","Ingeniería Industrial","Ingeniería Mecánica","Ingeniería Mecatrónica",
			  "Ingeniería Química","Fisioterapia","Fonoaudiología","Medicina","Nutrición y Dietética",
			  "Terapia Ocupacional","Medicina Veterinaria","Zootecnia","Odontología");
	  /* add a ScrollableList, by default it behaves like a DropdownList */
		cp5.addScrollableList("carrera").setPosition(100,260).setSize(200, 100).setBarHeight(30).setItemHeight(30).addItems(l);
		return true;
	}
	
	public void clear() {
		cp5.get(Textfield.class,"user").clear();
		cp5.get(Textfield.class,"password").clear();
		cp5.get(Textfield.class,"nombre").clear();
	  	cp5.get(Textfield.class,"apellido").clear();
	}
	
	public void input(String theText) {
		  // automatically receives results from controller input
		  println("a textfield event for controller 'user' : "+theText);
	}
	
	public void controlEvent(ControlEvent theEvent) {
		if(theEvent.isAssignableFrom(Textfield.class)) {
			println("controlEvent: accessing a string from controller '"
					+theEvent.getName()+"': "
					+theEvent.getStringValue()
					);
	  }
	}

}
