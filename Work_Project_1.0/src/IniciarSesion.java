
import processing.core.*;
import controlP5.*;

public class IniciarSesion extends PApplet{
	
	ControlP5 cp5;
	String textValue = "";
	
	public static void main(String[] args) {
		PApplet.main("IniciarSesion");
	}
	public void settings(){
		size(400,400);
	}
	/*TODO Solicitar datos al usuario: Usuario y contraseña
	 * 
	 */
	public void setup() {
		  PFont font = createFont("arial",20);
		  
		  cp5 = new ControlP5(this);
		  //Label Usuario
		  cp5.addTextfield("User")
		     .setPosition(100,100)
		     .setSize(200,30)
		     .setFont(font)
		     //.setFocus(true)
		     //.setColor(color(255,0,0))
		     .setAutoClear(false)
		     ;
		//Label Contraseña              
		  cp5.addTextfield("Password")
		     .setPosition(100,170)
		     .setSize(200,30)
		     .setFont(font)
		     .setAutoClear(false)
		     ;
		  //TODO Botón    
		  cp5.addBang("Ingresar")
		     .setPosition(110,240)
		     .setSize(80,40)
		     .getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
		     ; 
		  cp5.addBang("Cancelar")
		     .setPosition(210,240)
		     .setSize(80,40)
		     .getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
		     ; 
		     
		  textFont(font);
		}
	
	public void draw() {
		  background(180);
		  fill(255);
		  //text(cp5.get(Textfield.class,"User").getText(), 360,130);
		  text(textValue, 360,180);
		}

	public void Cancelar() {
		exit();
		}

	public void controlEvent(ControlEvent theEvent) {
		if(theEvent.isAssignableFrom(Textfield.class)) {
			println("controlEvent: accessing a string from controller '"
		            +theEvent.getName()+"': "
		            +theEvent.getStringValue()
		            );
		  }
		}


		public void input(String theText) {
		  // automatically receives results from controller input
		  println("a textfield event for controller 'User' : "+theText);
		}
	
}
