package examen;

import java.io.*;

public class Contacto {
	
	private String nombre;
	private String direccion;
	private String email;
	private String codigo_postal;
	private String telefono;
	
	public Contacto() {
		this.nombre = "";
		this.direccion = "";
		this.email = "";
		this.codigo_postal = "";
		this.telefono = "";
	}
	
	public Contacto(String nombre, String direccion, String email, String codigo_postal, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.codigo_postal = codigo_postal;
		this.telefono = telefono;
	}

	public String toString() {
		return "Contacto [nombre=" + nombre + ", direccion=" + direccion + ", email=" + email + ", codigo_postal="
				+ codigo_postal + ", telefono=" + telefono + "]";
	}
	
	/*public void imprimir() throws IOException {
		FileReader f=new FileReader("C:\\Users\\franp\\eclipse-workspace\\GeancarloPizarroTutiven_Programacion\\src\\examen\\proveedores.csv");
		BufferedReader entrada=new BufferedReader(f);
		String cadena=entrada.readLine();
		String[] linea;
		cadena=entrada.readLine();
		while(cadena!=null) {
			linea=cadena.split(";");
			cadena=entrada.readLine();
			this.NombreyApellidos=linea[8];
			this.Direccion=linea[4];
			this.CP=linea[6];
			this.Telefono=linea[5];
			this.Email=linea[9];
			System.out.println(this.NombreyApellidos+", direccion: "+this.Direccion+", Codigo Postal: "+this.CP
					+", telefono: "+this.Telefono+", email: "+this.Email);
			}
		}*/

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Contacto c=new Contacto();
		c.imprimir();*/

	}

}
