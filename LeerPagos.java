package examen;

import java.io.*;
import java.util.ArrayList;

public class LeerPagos {
	
	public FileReader Reader;
	public BufferedReader input;
	
	public void abrir() throws IOException{
		Reader=new FileReader("C:\\Users\\franp\\eclipse-workspace\\GeancarloPizarroTutiven_Programacion\\src\\examen\\pagos.csv");
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
		cadena=input.readLine();

 		while(cadena!=null) {
			linea=cadena.split(";");
			int proveedor=Integer.parseInt(linea[0]);
			cadena=input.readLine();
			for(Proveedor p: lista_proveedores) {
            	if(p.codigo==proveedor)
            		p.AñadirPago(new Pagos(linea));
            }
		}
		 } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            input.close();
	        }
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*FileReader f=new FileReader("C:\\Users\\franp\\eclipse-workspace\\GeancarloPizarroTutiven_Programacion\\src\\examen\\pagos.csv");
		BufferedReader entrada=new BufferedReader(f);
		
		String cadena=entrada.readLine();
		String[] linea;
		while(cadena!=null) {
			linea=cadena.split(";");
			cadena=entrada.readLine();
			//System.out.println(linea[0]+" | "+linea[1]+" | "+linea[2]+" | "+linea[3]+" | "+linea[4]);
		}
		f.close();*/

	}

}
