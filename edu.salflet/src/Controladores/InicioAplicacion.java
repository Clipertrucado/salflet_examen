package Controladores;

import java.io.IOError;
import java.util.ArrayList;
import java.util.List;

import Dtos.ClienteDatos;
import Dtos.CompraDatos;
import Servicios.EmpleadoImplementacion;
import Servicios.EmpleadoInterfaz;
import Servicios.GerenciaImplementacion;
import Servicios.GerenciaInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class InicioAplicacion {

	public static List<ClienteDatos> listClienteDatos = new ArrayList<ClienteDatos>();
	public static List<CompraDatos> listCompraDatos = new ArrayList<CompraDatos>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			MenuInterfaz mi = new MenuImplementacion();
			GerenciaInterfaz gi = new GerenciaImplementacion();
			EmpleadoInterfaz ei = new EmpleadoImplementacion();

			boolean continuar = true;
			boolean continuarEmpleado = true;
			boolean continuarGeremcia = true;

			int seleccionPrincipal = mi.menuInicio();

			while (continuar) {
				switch (seleccionPrincipal) {
				case 1:

					int seleccionGerencia = mi.menuGerencia();
					while (continuarEmpleado) {
						switch (seleccionGerencia) {
						case 1:
							gi.crearCliente();
							break;
						case 0:
							continuarEmpleado = false;
							break;

						default:
							break;
						}

					}
					break;
				case 2:
					int seleccionEmpleado = mi.menuEmpleado();
					while (continuarGeremcia) {
						switch (seleccionEmpleado) {
						case 1:
							ei.anyadirCompra();
							break;
						case 2:
							for (ClienteDatos cliente : listClienteDatos) {

								System.out.println(cliente.toString());

							}
							for (CompraDatos cliente : listCompraDatos) {

								System.out.println(cliente.toString());

							}
							break;
						case 0:
							continuarGeremcia = false;
							break;

						default:
							break;
						}

					}
					break;
				case 0:
					continuar = false;
					break;

				default:
					break;
				}

			}

		} catch (IOError e) {
			// TODO: handle exception
		}
	}

}
