package models;

import play.*;
import play.mvc.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Factura {
	
	//Factura
	
	public String  serie;
	public Integer folio;
	public Date    fechaDeExpedicion;
	public String  formaDePago;
	public String  moneda;
	public String  tipoDeComprobante;
	public String  metodoDePago;
	public String  lugarDeExpedision;
	
	//Emisor
	
	public String eRFC;
	public String eNombre;
	public String eCalle;
	public String eNumExt;
	public String eNumInt;
	public String eColonia;
	public String eMunicipio;
	public String eEstado;
	public String ePais;
	public String eCP;
	public String eRegimenFiscal;
	
	//receptor
	
	public String rRFC;
	public String rNombre;
	public String rCalle;
	public String rNumExt;
	public String rNumInt;
	public String rColonia;
	public String rMunicipio;
	public String rEstado;
	public String rPais;
	public String rCP;

	//venta
	
	public List<Detalle> detalle;
	//timbrado
	
	/* pendiente */

	public Detalle(){
		this.detalle = new ArrayList <Detalle> ();
	}
	
	public float total(){
		float total = 0;
		for(Detalle d: detalle){
			total += d.importe();
		}
		return total;
	}
	
	public List<Impuesto> impuestos(){
		List <Impuesto> l= new ArrayList <Impuesto> ();
		for(Detalle d: detalle){
			for(Impuesto i: d.impuestos()){
				if(l.contains(i)){
					l.get(l.indexOf(i)).cantidad += i.cantidad;
				}else{
					l.add(i);
				}
			}
		}
		return l;
	}
	
	public float subTotal(){
		float subTotal = total();
		for(Impuesto i: impuestos()){
			subTotal -= i.cantidad;
		}
		return subTotal;
	}
	
	public String fechaDeExpedicion(){
		return String.format("%sT%s",
				String.format("%tY-%tm-%td", fechaDeExpedicion, fechaDeExpedicion, fechaDeExpedicion),  /*Fecha de calendario*/
				String.format("%tT", fechaDeExpedicion));         /*Hora  de reloj*/
	}
}