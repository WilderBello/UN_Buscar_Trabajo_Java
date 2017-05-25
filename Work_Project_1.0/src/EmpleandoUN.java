import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PFont;


public class EmpleandoUN extends PApplet {
	static ControlP5 inicio;
	ControlP5 cp5;
	
	public static void main(String[] args) {
		PApplet.main("EmpleandoUN");
	}
	
	public void settings(){
		size(400,400);
	}
	
	public void setup() {
	  noStroke();
	  inicio = new ControlP5(this);
	  inicio.addButton("ingresar").setPosition(100,200).setSize(80,40).show();
	  inicio.addButton("nuevo").setPosition(200,200).setSize(80,40).show(); 
	  cp5 = new ControlP5(this);
	}
	
	public void draw() {
		background(180);
	}
	
	public void nuevo(){
		PFont fonter = createFont("arial",20);
		Usuario.crear(cp5,fonter);
	}
	
	public void ingresar(){
		PFont fonter = createFont("arial",20);
		Usuario.init(cp5,fonter);
	}
	
	
	
	public void volver(){
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
		inicio.show();
	}
	
	public void cerrar(){
		exit();
	}
	
	public void acceder(){
		PFont fonter = createFont("arial",20);
		Convocatoria.ofert(cp5,fonter);
	}
	
	public void aceptar(){
		PFont fonter = createFont("arial",20);
		Convocatoria.ofert(cp5,fonter);
	}

}

