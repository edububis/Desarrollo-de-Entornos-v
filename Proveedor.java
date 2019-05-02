package examen;

import java.io.*;
import java.util.*;

public class Proveedor implements Pagable{
	
	public int codigo;
	public String cif;
	public String nombre;
	public String tipo;
	public Contacto contacto;
	ArrayList <Pagos> lista_pagos=new ArrayList<Pagos>();

	public Proveedor() {
		this.codigo=0;
		this.cif="";
		this.nombre="";
		this.tipo="";
		new Contacto();
	}
	
	public Proveedor(String[] datos) {
		this.codigo=Integer.parseInt(datos[0]);
		this.cif=datos[1];
		this.nombre=datos[2];
		this.tipo=datos[3];
		Contacto c=new Contacto(datos[8],datos[4],datos[9],datos[6],datos[5]);
	}
	
	public void AñadirPago(Pagos p) {
		lista_pagos.add(p);
	}

	
	public void listarPagos() {
		for(Pagos p:lista_pagos)
			System.out.println(nombre+":"+p);
	}
	
	public double TotalTrimestre(int t, int a) {
		double total=0.0;
		for(Pagos p: lista_pagos)
			if(p.trimestre==t && p.año==a)
				total+=p.importe;
		return total;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Proveedor p=new Proveedor();
		//p.AñadirPago();

	}



	
}
