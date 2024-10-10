package Servicios;

import java.io.IOException;
import java.security.Identity;
import java.util.IllegalFormatWidthException;
import java.util.Scanner;

import Dtos.ClienteDatos;

public class GerenciaImplementacion implements GerenciaInterfaz{

	Scanner sc = new Scanner(System.in);
	
	@Override
	public int calculoId() {
		try {
			
			int id  = Controladores.InicioAplicacion.listClienteDatos.getLast().getIdCliente() + 1;
			
			return id;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return 99999;
		
	}
	
	public void crearCliente() {
		System.out.println("Indique el nombre del cliente");

		String nombre = sc.next();
		
		System.out.println("Indique los apellidos del cliente");

		String apellidos = sc.next();
		
		int id = calculoId();
		
		ClienteDatos nuevoCliente = new ClienteDatos(id,nombre,apellidos);
		
		Controladores.InicioAplicacion.listClienteDatos.add(nuevoCliente);
		
	}

}
