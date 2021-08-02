/**
 * 
 */
package businessLogic;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import data.Usuario;


/**
 * @author Mateo Ortiz & Andres Moreno
 * 
 */
public class ManagerDeUsuario extends AdmUsuario{
	private String fileName;

	
	
	public ManagerDeUsuario(String fileName) {
		this.fileName= fileName;
	}
	
	static void registrandoUsuario(Usuario u) {
		//Usuario u = new Usuario(username,contrase�a,nombre,id);
		usuario.add(u);
	}
	
	
	public void readData() {
		File inFile = new File(this.fileName);
		try {
			Scanner sc = new Scanner(inFile);
			readItem(sc);
			sc.close();
		} catch(FileNotFoundException e){
			System.out.println("Archivo no encontrado");
			System.exit(0);
		
		}
	}

	private void readItem(Scanner sc) {
		while(sc.hasNext()) {
			String line = sc.nextLine();
			processLine(line);
			//Usuario u = processLine(line);
			//usuarios[numeroUsuarios] = u;
			//numeroUsuarios ++;
		}
	}

	private void processLine(String line) {
		Scanner sc = new Scanner(line);
		sc.useDelimiter(",");
		String username = sc.next().trim();	
		String contrase�a = sc.next().trim();
		String nombre = sc.next().trim();
		int id = Integer.parseInt(sc.next().trim());
		sc.close();
		Usuario u = new Usuario(username,contrase�a,nombre, id);
		usuario.add(u);

	}

	public ArrayList<Usuario> getUsuarios() {
		return usuario;

	}
	
	public void writingRecords() {
		try {
			FileWriter myWriter = new FileWriter("usuarios.txt");
			for (Usuario u : usuario) {
				myWriter.write(u.toString());
				myWriter.write("\n");
			}
			myWriter.close();
		}
		catch (IOException e) {
			System.out.println("Error salvando el invetario");
		}
	}
	
	/*
	public static Usuario RegistroDeUsuario() {
		String username = null;
		String contrase�a = null;
		String nombre;
		int id;
		boolean correcto = false; //Controla la validez del nombre de usuario y de la contrase�a en el registro del usuario
		
		System.out.println("\n------------ REGISTRO ------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre de usuario");
		while (correcto == false) {
			username = sc.nextLine(); 
			if (username.length() == 0) {
				System.out.println("Introduzca su nombre de usuario (debe tener por lo menos 1 caracter)");
				correcto = false;
			}else {
				if (nombreDuplicado(username) == true) {
					System.out.println("Nombre de usuario ya en uso introduzca otro nombre de usuario");
					correcto = false;
				}else {
					correcto = true;
				}
			}
		}
		correcto = false;
		System.out.println("Introduzca su contrase�a");
		while (correcto == false) {
		contrase�a = sc.nextLine(); 
			if (contrase�a.length() < 5) {
				System.out.println("Contrase�a demasiado corta, intente con una m�s segura");
				correcto = false;
			}else {
				correcto = true;
			}
		}
		System.out.println("Introduzca su nombre real");
		nombre = sc.nextLine(); 
		id = usuario.size() + 1;
		Usuario u = new Usuario(username,contrase�a,nombre, id);
		usuario.add(u);
		return u;
	}*/
	
	public static boolean registroUsuarioUsername(String username) {
		boolean usuarioCorrecto = nombreDuplicado(username);
		if (username.length() == 0 || usuarioCorrecto == true) {
			return false;
		}
		return true;
	}
	
	public static boolean registroUsuarioContrase�a(String contrase�a) {
		if (contrase�a.length() < 5) {
			return false;
		}
		return true;
	}
	
	public static void registroUsuario(String username, String contrase�a, String nombre) {
		int id = usuario.size() + 1;
		Usuario u = new Usuario(username,contrase�a,nombre, id);
		usuario.add(u);
	}
	
	public static boolean loginUsuario(String username, String contrase�a) {
		boolean usuarioCorrecto = nombreDuplicado(username);
		boolean contrase�aCorrecta = contrase�aDuplicada(contrase�a);
		if(usuarioCorrecto == true && contrase�aCorrecta == true) {
			return true;
		}
		return false;
	}
	
	private static boolean nombreDuplicado(String username) {
		for (int i = 0; i < usuario.size();i++){
			if(((usuario.get(i)).getUsername()).equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean contrase�aDuplicada(String contrase�a) {
		for (int i = 0; i < usuario.size();i++){
			if(((usuario.get(i)).getContrase�a()).equals(contrase�a)) {
				return true;
			}
		}
		return false;
	}
	
}
