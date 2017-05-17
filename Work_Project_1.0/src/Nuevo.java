import processing.core.*;
import controlP5.*;
import java.util.*;
public class Nuevo extends PApplet{
	ControlP5 cp5;
	String textValue = "";
	Textlabel myTextlabelA;

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
		myTextlabelA = cp5.addTextlabel("label")
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
		  cp5.addBang("Aceptar")
		     .setPosition(110,305+15)
		     .setSize(80,40)
		     .getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
		     ; 
		  cp5.addBang("Cancelar")
		     .setPosition(210,305+15)
		     .setSize(80,40)
		     .getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
		     ; 
		  
		  cp5.addBang("clear")
		     .setPosition(340,365)
		     .setSize(50,25)
		     .getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
		     ; 
////////////////////////// ScrollableList (Carreras) ////////////////////////////////////		 		     
		  List l = Arrays.asList("Ingenieria", "Filologia", "c", "d", "e", "f", "g", "h");
		  /* add a ScrollableList, by default it behaves like a DropdownList */
		  cp5.addScrollableList("Carrera")
		     .setPosition(100,260)
		     .setSize(200, 100)
		     .setBarHeight(30)
		     .setItemHeight(30)
		     .addItems(l)
		     ;
		}
	
	public void dropdown(int n) {
		  /* request the selected item based on index n */
		  println(n, cp5.get(ScrollableList.class, "dropdown").getItem(n));
		  
		  /* here an item is stored as a Map  with the following key-value pairs:
		   * name, the given name of the item
		   * text, the given text of the item by default the same as name
		   * value, the given value of the item, can be changed by using .getItem(n).put("value", "abc"); a value here is of type Object therefore can be anything
		   * color, the given color of the item, how to change, see below
		   * view, a customizable view, is of type CDrawable 
		   */
		  
		   CColor c = new CColor();
		  c.setBackground(color(255,0,0));
		  cp5.get(ScrollableList.class, "dropdown").getItem(n).put("color", c);
		  
		}
	public void keyPressed() {
		  switch(key) {
		    case('1'):
		    /* make the ScrollableList behave like a ListBox */
		    cp5.get(ScrollableList.class, "dropdown").setType(ControlP5.LIST);
		    break;
		    case('2'):
		    /* make the ScrollableList behave like a DropdownList */
		    cp5.get(ScrollableList.class, "dropdown").setType(ControlP5.DROPDOWN);
		    break;
		    case('3'):
		    /*change content of the ScrollableList */
		    List l = Arrays.asList("Ingenieria-1", "Filologia-1", "c-1", "d-1", "e-1", "f-1", "g-1", "h-1", "i-1", "j-1", "k-1");
		    cp5.get(ScrollableList.class, "dropdown").setItems(l);
		    break;
		    case('4'):
		    /* remove an item from the ScrollableList */
		    cp5.get(ScrollableList.class, "dropdown").removeItem("k-1");
		    break;
		    case('5'):
		    /* clear the ScrollableList */
		    cp5.get(ScrollableList.class, "dropdown").clear();
		    break;
		  }
		}
///////////////////////////////////////////////////////////////////	
	public void draw() {
		  background(180);
		  fill(255);
		  text(textValue, 360,180);
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


		/*public void User(String theText) {
		  // automatically receives results from controller User
		  println("a textfield event for controller 'User' : "+theText);
			
		}*/
	
}
