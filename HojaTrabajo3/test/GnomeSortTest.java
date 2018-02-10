

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para la prueba unitaria de la clase RadixSort.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class GnomeSortTest {
    
    public GnomeSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GnomeSort method, of class GnomeSort.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("GnomeSort listo");
        Comparable[] list = {3,2,5,4,1};        
        GnomeSort instance = new GnomeSort();
        Comparable[] expResult = {1,2,3,4,5};
        Comparable[] result = instance.GnomeSort(list);
        assertArrayEquals(expResult, result);

    }
    
}
