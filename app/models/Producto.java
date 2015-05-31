package models;

import java.util.List;

public class Producto {
	public int    noIdentificacion;
	public String unidad;
	public String descripcion;
	public float  valorUnitario;
	public List<Impuesto> impuestos;
}
