import processing.core.*;
import controlP5.*;
import java.util.*;
public class Nuevo extends PApplet{
	ControlP5 cp5;
	String textVal = "";
	Textlabel Titulo;

	public static void main(String[] args) {
		PApplet.main("Nuevo");
	}
	
	public void settings(){
		size(400,400);
	}
	/*TODO ingresar datos de usuario como: Nombre, apellido, usuario, contrase�a, carrera
	 * 
	 */
	public void setup() {
		 PFont font = createFont("arial",20);
		cp5 = new ControlP5(this);
////////////////// TITULO /////////////////////////////////////
		Titulo = cp5.addTextlabel("label")
				.setText("CREAR NUEVO USUARIO")
		        .setPosition(70,20)
		        //.setColorValue(0xffffff)
		        .setFont(font)
		        ;
////////////////////////// Textbox ///////////////////////////	  
		cp5.addTextfield("User")
		     .setPosition(100,60)
		     .setSize(200,30)
		     .setFont(font)
		     //.setFocus(true)
		     //.setColor(color(255,0,0))
		     .setAutoClear(false)
		     ;      
		  cp5.addTextfield("Password")
		     .setPosition(100,95+15)
		     .setSize(200,30)
		     .setFont(font)
		     .setAutoClear(false)
		     ;
		  
		  cp5.addTextfield("Nombre")
		     .setPosition(100,145+15)
		     .setSize(200,30)
		     .setFont(font)
		     .setAutoClear(false)
		     ;
		  
		  cp5.addTextfield("Apellido")
		     .setPosition(100,195+15)
		     .setSize(200,30)
		     .setFont(font)
		     .setAutoClear(false)
		     ;
		  
///////////////// BOTONES ////////////////
		  cp5.addButton("Aceptar")
		     .setPosition(110,305+15)
		     .setSize(80,40)
		     ;
		  cp5.addButton("Cancelar")
		     .setPosition(210,305+15)
		     .setSize(80,40)
		     ;		  
		  cp5.addButton("clear")
		     .setPosition(340,365)
		     .setSize(50,25)
		     ;	
////////////////////////// ScrollableList (Carreras) ////////////////////////////////////		 		     
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
		  cp5.addScrollableList("Carrera")
		     .setPosition(100,260)
		     .setSize(200, 100)
		     .setBarHeight(30)
		     .setItemHeight(30)
		     .addItems(l)
		     ;
		}

///////////////////////////////////////////////////////////////////	
	public void draw() {
		  background(180);
		  fill(255);
		  text(textVal, 360,180);
		}
	
	public void Cancelar(){
		exit();
	}
	
	public void clear() {
		  cp5.get(Textfield.class,"User").clear();
		  cp5.get(Textfield.class,"Password").clear();
		  cp5.get(Textfield.class,"Nombre").clear();
		  cp5.get(Textfield.class,"Apellido").clear();
		}
	
	//Imprime en consola el nombre de la casilla y el valor ingresado
	public void controlEvent(ControlEvent theEvent) {
		if(theEvent.isAssignableFrom(Textfield.class)) {
			println("controlEvent: accessing a string from controller '"
		            +theEvent.getName()+"': "
		            +theEvent.getStringValue()
		            );
		  }
		}
	
	
}
