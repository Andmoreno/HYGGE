/**
 * 
 */
package businessLogic;
import java.io.File;
import data.Usuario;
import businessLogic.ManagerDeUsuario;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Mateo
 *
 */
public class RegistroDeUsuario extends AdmUsuario{
	private static String username;
	private static String contrase�a;
	private static String nombre;
	private static int id;
	private boolean correcto = false;
	
	public RegistroDeUsuario() {
		System.out.println("\n------------ REGISTRO ------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre de usuario");
		username = sc.nextLine(); 
		System.out.println("Introduzca su contrase�a");
		while (correcto == false) {
		contrase�a = sc.nextLine(); 
			if (contrase�a.length() < 5) {
				System.out.println("Contrase�a demasiado corta, intente con una m�s seguridad");
				correcto = false;
			}else {
				correcto = true;
			}
		}
		System.out.println("Introduzca su nombre real");
		nombre = sc.nextLine(); 
		id = usuario.size() + 1;

	}
	
	protected Usuario registro() {
		Usuario u = new Usuario(username,contrase�a,nombre, id);
		return u;
	}
	
	public String getUsuario() {
		return username;
	}
	
	public String getContrase�a() {
		return contrase�a;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getId() {
		return id;
	}
		
	
}
