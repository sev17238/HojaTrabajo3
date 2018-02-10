

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para la prueba unitaria de la clase MergeSort.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class MergeSortTest {
    
    public MergeSortTest() {
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
     * Test of MergeSort method, of class MergeSort.
     */
    @Test
    public void testMergeSort() {
        System.out.println("MergeSort listo");
        Comparable[] a = {3,2,5,4,1};
        MergeSort instance = new MergeSort();
        Comparable[] expResult = {1,2,3,4,5};
        Comparable[] result = instance.MergeSort(a);
        assertArrayEquals(expResult, result);
        
    }
    
}
