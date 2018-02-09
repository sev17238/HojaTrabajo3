
package hojatrabajo3;

/**
 *
 * @author javie
 */
public class RadixSort {
    public Comparable[] Radixsort(Comparable[] a){
        int i, m = (int) a[0], exp = 1, n = a.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if ((int)a[i] > m)
                m = (int)a[i];
        while (m / exp > 0){
            int[] bucket = new int[10];
            for (i = 0; i < n; i++)
                bucket[((int)a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[((int)a[i] / exp) % 10]] = (int)a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;     
        }
        return a;
        
    }   
}
