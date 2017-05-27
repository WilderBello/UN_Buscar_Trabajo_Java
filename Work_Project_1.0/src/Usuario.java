import processing.core.*;
import java.util.*;
import controlP5.*;


public class Usuario{
	
	public boolean init (ControlP5 inicio, ControlP5 us,PFont font) {
		inicio.hide();
		us.addTextfield("user").setPosition(100,100).setSize(200,30).setFont(font).setAutoClear(false);     
		us.addTextfield("password").setPosition(100,170).setSize(200,30).setFont(font).setAutoClear(false);
		//TODO Botón    
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
		us.addScrollableList("carrera").setPosition(100,260).setSize(200, 100).setBarHeight(30).setItemHeight(30).addItems(l);
		return true;
	}
	

}
