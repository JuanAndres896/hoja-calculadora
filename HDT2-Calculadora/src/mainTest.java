/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 25 de Julio del 2016
 * Descripción: Pruebas unitarias del programa principal. que implementa los metodos de la clase Calculadora.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanAndrés
 */
public class mainTest {
    
    public mainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of muestraContenido method, of class main.
     */
    @Test
    public void testMuestraContenido() throws Exception {
        System.out.println("muestraContenido");
        String archivo = "C:\\Users\\JuanAndrés\\Desktop\\Segundo Año\\CICLO 2\\Estructuras de Datos\\Hoja 2\\hoja-calculadora\\hoja-calculadora\\archivo.txt";
        String expResult = "4 2 /"; // Datos que se ingresaron al momento de hacer la prueba
        String result = main.muestraContenido(archivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
