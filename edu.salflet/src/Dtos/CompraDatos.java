package Dtos;


import java.time.LocalDateTime;

public class CompraDatos {

	int idCompra;
	double importeCompra = 99999.9;
	int idClienteCompra;
	LocalDateTime InstanteCompra = LocalDateTime.now();
	
	
	public CompraDatos() {
		super();
	}


	public CompraDatos(int idCompra, double importeCompra, int idClienteCompra) {
		super();
		this.idCompra = idCompra;
		this.importeCompra = importeCompra;
		this.idClienteCompra = idClienteCompra;
	}


	public int getIdCompra() {
		return idCompra;
	}


	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}


	public double getImporteCompra() {
		return importeCompra;
	}


	public void setImporteCompra(double importeCompra) {
		this.importeCompra = importeCompra;
	}


	public int getIdClienteCompra() {
		return idClienteCompra;
	}


	public void setIdClienteCompra(int idClienteCompra) {
		this.idClienteCompra = idClienteCompra;
	}


	public LocalDateTime getInstanteCompra() {
		return InstanteCompra;
	}


	public void setInstanteCompra(LocalDateTime instanteCompra) {
		InstanteCompra = instanteCompra;
	}


	@Override
	public String toString() {
		return "CompraDatos [idCompra=" + idCompra + ", importeCompra=" + importeCompra + ", idClienteCompra="
				+ idClienteCompra + ", InstanteCompra=" + InstanteCompra + "]";
	}
	
	
	
	
	
}
