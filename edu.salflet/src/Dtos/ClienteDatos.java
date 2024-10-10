package Dtos;

public class ClienteDatos {
	
	int idCliente;
	String nombreCliente = "aaaaa";
	String apellidosCliente = "aaaaa";
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	
	
	public ClienteDatos() {
		super();
	}
	
	public ClienteDatos(int idCliente, String nombreCliente, String apellidosCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
	}
	
	@Override
	public String toString() {
		return "ClienteDatos [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidosCliente="
				+ apellidosCliente + "]";
	}
	
	
}
