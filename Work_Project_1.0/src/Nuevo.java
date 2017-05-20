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
	/*TODO ingresar datos de usuario como: Nombre, apellido, usuario, contraseña, carrera
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
