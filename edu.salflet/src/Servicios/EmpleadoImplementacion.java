package Servicios;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import Dtos.ClienteDatos;
import Dtos.CompraDatos;

public class EmpleadoImplementacion implements EmpleadoInterfaz {

	Scanner sc = new Scanner(System.in);
	
	private int calculoId() {
		try {
			
			int id  = Controladores.InicioAplicacion.listCompraDatos.getLast().getIdCompra() + 1;
			
			return id;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return 99999;
		
	}
	
	@Override
	public void anyadirCompra() {
		System.out.println("Indique el id del cliente");

		int idCliente = sc.nextInt();

		System.out.println("Indique el importe de la compra");

		int Importe = sc.nextInt();

		int id = calculoId();

		CompraDatos nuevaCompra = new CompraDatos(id, Importe, idCliente);
		

		Controladores.InicioAplicacion.listCompraDatos.add(nuevaCompra);

	}

	@Override
	public void ventaMensual() {
		// TODO Auto-generated method stub
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	
	}
	

}
