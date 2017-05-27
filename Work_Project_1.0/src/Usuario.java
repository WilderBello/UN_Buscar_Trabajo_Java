import processing.core.*;
import java.util.*;
import controlP5.*;


public class Usuario{
	
	public boolean init (ControlP5 inicio, ControlP5 us,PFont font) {
		inicio.hide();
		us.addTextfield("user").setPosition(100,100).setSize(200,30).setFont(font).setAutoClear(false);     
		us.addTextfield("password").setPosition(100,170).setSize(200,30).setFont(font).setAutoClear(false);
		//TODO Bot�n    
		us.addButton("acceder").setPosition(110,240).setSize(80,40);
		us.addButton("volver").setPosition(210,240).setSize(80,40);
		return true;
	}
	
	public boolean crear (ControlP5 inicio, ControlP5 us,PFont font) {
		inicio.hide();
		String textVal = "";
		Textlabel Titulo;
		Titulo = us.addTextlabel("label").setText("CREAR NUEVO USUARIO").setPosition(70,20).setFont(font);
		us.addTextfield("user").setPosition(100,60).setSize(200,30).setFont(font).setAutoClear(false);      
		us.addTextfield("password").setPosition(100,95+15).setSize(200,30).setFont(font).setAutoClear(false);
		us.addTextfield("nombre").setPosition(100,145+15).setSize(200,30).setFont(font).setAutoClear(false);
		us.addTextfield("apellido").setPosition(100,195+15).setSize(200,30).setFont(font).setAutoClear(false);
		us.addButton("aceptar").setPosition(110,305+15).setSize(80,40);
		us.addButton("volver").setPosition(210,305+15).setSize(80,40);		  
		us.addButton("clear").setPosition(340,365).setSize(50,25);	
		List l = Arrays.asList("Arquitectura","Artes Pl�sticas", "Cine y Televisi�n",
			  "Dise�o Gr�fico","Dise�o Industrial","M�sica","M�sica Instrumental", 
			  "Biolog�a","Estad�stica","Farmacia","F�sica","Geolog�a","Matem�ticas",
			  "Qu�mica","Administraci�n de Empresas","Contadur�a P�blica","Econom�a",
			  "Antropolog�a","Espa�ol y Filolog�a Cl�sica","Estudios Literarios",
			  "Filolog�a e Idiomas (Alem�n)","Filolog�a e Idiomas (Franc�s)","Filolog�a e Idiomas (Ingl�s)",
			  "Filosof�a","Geograf�a","Historia","Ling��stica","Psicolog�a","Sociolog�a",
			  "Trabajo Social","Ciencia Pol�tica","Derecho","Enfermer�a","Ingenier�a Agr�cola",
			  "Ingenier�a Civil","Ingenier�a de Sistemas y Computaci�n","Ingenier�a El�ctrica",
			  "Ingenier�a Electr�nica","Ingenier�a Industrial","Ingenier�a Mec�nica","Ingenier�a Mecatr�nica",
			  "Ingenier�a Qu�mica","Fisioterapia","Fonoaudiolog�a","Medicina","Nutrici�n y Diet�tica",
			  "Terapia Ocupacional","Medicina Veterinaria","Zootecnia","Odontolog�a");
	  /* add a ScrollableList, by default it behaves like a DropdownList */
		us.addScrollableList("carrera").setPosition(100,260).setSize(200, 100).setBarHeight(30).setItemHeight(30).addItems(l);
		return true;
	}
	

}
