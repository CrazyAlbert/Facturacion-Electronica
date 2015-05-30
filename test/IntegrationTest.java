import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.mvc.Http.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import static org.fluentlenium.core.filter.FilterConstructor.*;

/**
 * @version 1.0
 * @description Pruebas de Aceptacion
 * @author Julio Alberto Alvarez Navarrete 256962
 * @author Jesus Jose Garcia Pardo 271305
 * @author Luis Alberto Hernandez Dominguez 211507
 * @date 25/05/2015
 *
 */

public class IntegrationTest {


    @Test
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
                assertThat(browser.pageSource()).contains("Your new application is ready.");
            }
        });
    }

    @Test
    /*public void testTheHomePage() {
        Response response = //GET("/");
        assertStatus(200, response);
    }*/




}
