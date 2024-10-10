package Servicios;

import java.io.IOException;
import java.security.Identity;
import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	GerenciaInterfaz gi = new GerenciaImplementacion();
	@Override
	public int menuInicio() {
		
		System.out.println(" MENU PRINCIPAL");
		System.out.println("----------------");
		System.out.println("1. Empleado");
		System.out.println("2. Gerencia");
		System.out.println("0. Salir");

		return sc.nextInt();
	}

	public int menuGerencia() {

		System.out.println("  MENU GERENCIA");
		System.out.println("-----------------");
		System.out.println("1. nuevo cliente");
		System.out.println("0. Salir");

		return sc.nextInt();

	}
	
	public int menuEmpleado() {

		System.out.println("         MENU EMPLEADO");
		System.out.println("-------------------------------");
		System.out.println("1. Ventas mensuales");
		System.out.println("2. Añadir compras a un cliente");
		System.out.println("0. Salir");

		return sc.nextInt();
		
	}

	
	
	
	

}
