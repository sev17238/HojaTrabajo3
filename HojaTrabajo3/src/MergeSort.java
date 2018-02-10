


/**
 * Clase que implementa el metodo de ordenamiento por mezcla.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class MergeSort {
    /**
     * El método MergeSort es un algoritmo de ordenación recursivo con un número de comparaciones 
     * entre elementos del array mínimo,
     * De forma resumida el funcionamiento del método MergeSort es el siguiente:
        - Si la longitud del array es menor o igual a 1 entonces ya está ordenado
        - El array a ordenar se divide en dos mitades de tamaño similar
        - Cada mitad se ordena de forma recursiva aplicando el método MergeSort
        - A continuación las dos mitades ya ordenadas se mezclan formando una secuencia ordenada. 
     * @param a 
     * @return  
     */
    public Comparable[] MergeSort(Comparable[] a){
	Comparable[] tmp = new Comparable[a.length];
	mergeSort(a, tmp,  0,  a.length - 1);
        return a;
    }
    private void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right){
	if( left < right ){
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
	}
    }
    private void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];
        
        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
}
