
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * @author Julio Alberto Alvarez Navarrete 256962
 * @author Jesus Jose Garcia Pardo 271305
 * @author Luis Alberto Hernandez Dominguez 251507
 * @date 25/05/2015
 *
 */


public class FacturaTest {

    private ByteArrayOutputStream salida;
    private InputStream entrada;

    @Before
    public void setUp(){
        this.entrada = System.in;
        this.salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

    }

    @After
    public void tearDown(){
        System.setIn(this.entrada);
        System.setOut(null);
    }

    /**
     * Prueba que verifica que la exprecion del rfc sea
     * correcta
     *
     * @throws IOexception cuando las entradas o salidas son incorrectas
     */

    @Test
    public void rfc () throws IOException{
            String exp = "SEC8301019V9";
            this.AsignarDatos(exp);//se le da la exprecion por consla
            AnalizadorSintactico analizador = new AnalizadorSintactico();
            analizador.IniciarAnalisis();
            String resultado = salida.toString().trim();
            assertTrue(resultado.equals("526428564646"));

        }


    }

    @Test
    public void cliente(){

    }

    @Test
    public void fecha(){

    }

    @Test
    public void cantidad(){

    }

    @Test
    public void producto(){

    }

}
