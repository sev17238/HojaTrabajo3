
package hojatrabajo3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para la prueba unitaria de la clase QuickSort.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class QuickSortTest {
    
    public QuickSortTest() {
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
     * Test of QuickSort method, of class QuickSort.
     */
    @Test
    public void testQuickSort() {
        System.out.println("QuickSort listo");
        Comparable[] list = {3,2,5,4,1};
        QuickSort instance = new QuickSort();
        Comparable[] expResult = {1,2,3,4,5};
        Comparable[] result = instance.QuickSort(list, 0, list.length-1);
        assertArrayEquals(expResult, result);
    }
    
}
