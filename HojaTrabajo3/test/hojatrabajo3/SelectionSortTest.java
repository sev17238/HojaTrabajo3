
package hojatrabajo3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para la prueba unitaria de la clase SelectionSort.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class SelectionSortTest {
    
    public SelectionSortTest() {
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
     * Test of selectionSort method, of class SelectionSort.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("selectionSort listo");
        Comparable[] list = {3,2,5,4,1};
        SelectionSort instance = new SelectionSort();
        Comparable[] expResult = {1,2,3,4,5};
        Comparable[] result = instance.selectionSort(list);
        assertArrayEquals(expResult, result);

    }
    
}
