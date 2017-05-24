import processing.core.*;
import java.io.*;

public class Usuario extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("Funcionando Usuario"); 
	}
	//BufferedReader <----- Buscar, así se solicita datos.
	public static void inicio() throws IOException {
		//que el usuario decida si quiere crear un usuario o si quiere ingresar 
		println("Bienvenido Usuario"); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Por favor ingrese su nombre:");
		String nombre = br.readLine();		
		System.out.println("Por favor ingrese su edad:");
		String edad = br.readLine();
		System.out.println(nombre+": " + edad);
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
