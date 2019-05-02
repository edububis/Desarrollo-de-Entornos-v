package examen;

import java.io.*;
import java.util.ArrayList;

public class LeerProveedores{
	
	public FileReader Reader;
	public BufferedReader input;
	
	public void abrir() throws IOException{
		Reader=new FileReader("C:\\Users\\franp\\eclipse-workspace\\GeancarloPizarroTutiven_Programacion\\src\\examen\\proveedores.csv");
		input=new BufferedReader(Reader);
	}
	
	public void cerrar() throws IOException {
		if(input!=null)
			input.close();
	
	}

	public void LeerFichero(ArrayList<Proveedor> lista_proveedores) throws IOException {
	try {
	    String cadena=input.readLine();
		String[] linea;
		ArrayList<Proveedor> proveedores=new ArrayList<Proveedor>();
		while(cadena!=null) {
			linea=cadena.split(";");
			cadena=input.readLine();
			if(linea[3].equals("suministro")) {
				int retencion=Integer.parseInt(linea[7]);
			    suministros s=new suministros(linea,retencion);
			    //System.out.println(s.toString());
			    proveedores.add(s);
			}
			if(linea[3].equals("subcontrata")) {
				int personal=Integer.parseInt(linea[10]);
			    subcontrata s=new subcontrata(linea,personal);
			    //System.out.println(s.toString());
			    proveedores.add(s);
			}
		}
		for(Proveedor p: proveedores) {
			lista_proveedores.add(p);
		}
		 } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
		 } catch (IOException e) {
	            System.out.println(e.getMessage());
	     } finally {
	            input.close();
	     }
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	/*	FileReader f=new FileReader("C:\\Users\\franp\\eclipse-workspace\\GeancarloPizarroTutiven_Programacion\\src\\examen\\proveedores.csv");
		BufferedReader entrada=new BufferedReader(f);
		
		//Leo la primera linea del fichero
		String cadena=entrada.readLine();
		String[] linea;
		while(cadena!=null) {
			linea=cadena.split(";");
			cadena=entrada.readLine();
			System.out.println(linea[0]+" | "+linea[1]+" | "+linea[2]+" | "+linea[3]+" | "+linea[4]+" | "+linea[5]+" | "
					+linea[6]+" | "+linea[7]+" | "+linea[8]+" | "+linea[9]+" | "+linea[10]);
		}
		f.close();*/
		

	}

}
