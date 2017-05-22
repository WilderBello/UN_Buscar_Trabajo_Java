import processing.core.*;
import javax.*;
public class Usuario extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Usuario");
		println("Funcionando Usuario");
		inicio();
	}
	//Bufferedreader <----- Buscar, así se solicita datos.
	
	public static void inicio(){
		//que el usuario decida si quiere crear un usuario o si quiere ingresar 
		println("Corriendo inicio");
	}
	public void crear(){
		//Solicitar datos al usuario: nickname, contraseña, nombre, apellido, carrera.
		println("crear");
	}

	public void ingresar(){
		//Solicitar al usuario: nickname, contraseña.
		println("Ingresar");
	}

}
