package models;

public class Impuesto {
	public String nombre;
	public float  porcentaje;
	public float  cantidad;

	public String fPorcentaje(){
		return String.format("%2.f",porcentaje);
	}

	public String fCantidad(){
		return String.format("%2.f",cantidad);
	}
}
