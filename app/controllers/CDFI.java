package controllers;

import play.*;
import play.mvc.*;

import java.util.Date;
import views.xml.*;
import models.*;

public class CDFI extends Controller {
	public static Result xmlPrueba() {
		Factura f = new Factura();
		f.fechaDeExpedicion = new Date();
		f.folio = 3;
		f.serie = "CH";
        return ok(cdfi.render(f));
    }
}