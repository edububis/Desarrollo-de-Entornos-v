package examen;

import java.io.*;

public class Pagos {
	
	public String factura;
	public int trimestre;
	public int año;
	public double importe;
	/**
	*
	*Inicializa Pagos a sus valores nulos.
	*
	**/
	public Pagos() {
		this.factura="";
		this.trimestre=0;
		this.año=0;
		this.importe=0.0;
	}
	
	public Pagos(String[] datos) {
		this.factura=datos[1];
		this.trimestre=Integer.parseInt(datos[2]);
		this.año=Integer.parseInt(datos[3]);
		this.importe=Double.parseDouble(datos[4]);
		
	}
	
	public String ToString() {
	 return " Factura " + factura +  " perteneciente al trimestre " + trimestre + " del año " + año + " por importe de "+importe+" euros";
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Pagos P=new Pagos();
		P.ToString();

	}

}
