package models;

import java.util.List;

public class Producto {
	public int id;
	public String nombre;
	public String descripcion;
	public String unidad;
	public float valorUnitario;
	public List<Impuesto> impuestos;

	public String fValorUnitario(){
		return String.format("%.2f", valorUnitario);
	}
}
