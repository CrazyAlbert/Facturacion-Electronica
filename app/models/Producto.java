package models;

import java.util.List;

public class Producto {
	public int id;
	public String nombre;
	public String descripcion;
	public float precioUnitario;
	public List<Impuesto> impuestos;
}
