
package hojatrabajo3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para la prueba unitaria de RadixSort.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class RadixSortTest {
    
    public RadixSortTest() {
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
    
    @Test
    public void testradixsort() {
        System.out.println("radixsort listo");
        Comparable[] list = {10,7,19,9,8,3,16,2,5,11,4,1,6,20,13,15,14,17,18,12};
        RadixSort instance = new RadixSort();
        Comparable[] expResult = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Comparable[] result = instance.radixsort(list,list.length);
        assertArrayEquals(expResult, result);
    }
}
