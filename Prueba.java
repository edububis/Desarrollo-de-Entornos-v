package examen;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        ArrayList<Proveedor> lista_proveedores=new ArrayList<Proveedor>();
        Proveedor p=new Proveedor();
        LeerProveedores lp=new LeerProveedores();
		LeerPagos lpg=new LeerPagos();
        Pagos pg=new Pagos();
        lp.abrir();
        lpg.abrir();
		
		System.out.println("Men�");
		System.out.println("1. Leer proveedores");
		System.out.println("2. Leer pagos");
		System.out.println("3. Generar IVA de un trimestre");
		System.out.println("4. Informe de pagos anuales");
		
		System.out.println("Dame una opci�n");

		int opcion=sc.nextInt();
		
		System.out.println("la opci�n es "+opcion);
		
		do {
		switch(opcion) {
		case 1: lp.LeerFichero(lista_proveedores); System.out.println("fichero leido");lp.cerrar();break;
		case 2: lpg.LeerFichero(lista_proveedores); System.out.println("fichero leido"); lpg.cerrar();break;
		case 3: lp.LeerFichero(lista_proveedores); 
		
			System.out.println("Introduzca el trimestre: ");
		        int trimestre=sc.nextInt();
		        System.out.println("Introduzca el a�o: ");
		        int a�o=sc.nextInt();
		        lpg.LeerFichero(lista_proveedores);
		        System.out.println("Informe de IVA del trimestre "+trimestre+" del a�o "+a�o);
		        for(Proveedor p2: lista_proveedores) {
					System.out.println("Proveedor "+p2.nombre+" "+p2.TotalTrimestre(trimestre,a�o));}
				System.out.println("********************************************************"); break;
				//p.A�adirPago();
		        //System.out.print(p.TotalTrimestre(trimestre, a�o)); break;
		//case 4: break;
		default: System.out.println("La opci�n es incorrecta."); break;
		}
		}while(opcion<=4);
		sc.close();

	}

}
