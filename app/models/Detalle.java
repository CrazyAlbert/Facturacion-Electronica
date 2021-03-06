package models;

import java.util.List;

public class Detalle {
	public Integer id;
	public Producto p;
	public float cantidad;
	
	public float importe(){
		return cantidad * p.valorUnitario;
	}
	
	public String fImporte(){
		return String.format("%.2f",importe());
	}

	public List<Impuesto> impuestos(){
		return p.impuestos;
	}
}
