
package hojatrabajo3;

/**
 * Clase donde se encuentran los metodos de sorting, cada uno con la capacidad de ordenar valores
 * de menor a mayor, pero con un tiempo de ejecucion diferente.
 * @author Cpn. Javier Garfio
 * @author Diego C-villa
 */
public class Sorts {
    
    
    
    public Comparable[] GnomeSort(Comparable[] list){
        
        int index=1; //start of search

        int temp;
        for(index = 1; index<list.length;){ //until the array is fully sorted

            if((int)list[index] < (int)list[index-1]){ //compares list[index] with list[index-1]. if smaller, switch.

                temp = (int)list[index];
                list[index]=list[index-1];
                list[index-1]=temp;
                index--; //must decrease index to recheck. since they have been swapped, the array may still be out of order

                if(index==0){ //prevents index from going lower than 1
	          index=1;
	        }
	      }
	      else{
	        index++; //if sorted, go up
	      }
	    }
        
        return list;
    }
    
    public void MergeSort(int[] list){
        
    }
    
    public void QuickSort(Comparable[] list, int izquierda, int derecha){
        int pivote = (int)list[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while ((int)list[i] <= pivote && i < j) {
                i++;
            }
            while ((int)list[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = (int)list[i];
                list[i] = list[j];
                list[j] = auxIntercambio;
            }
        }
        list[izquierda] = list[j];
        list[j] = pivote;
        if (izquierda < j - 1) {
            QuickSort(list, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            QuickSort(list, j + 1, derecha);
        }
    }
    
    public void RadixSort(String[] list){
        
    }
    
    public int[] Otro(Comparable[] list){        
        int[] lista = new int[list.length];       
        int str;
        for(int i=0; i<list.length ;i++){
            str = (int) list[i];
            lista[i] = str;
        }
        
        for(int i = 0;i<lista.length-1;i++){
            for(int j=0;j<lista.length-1;j++){
                if(lista[j] > lista[j+1]){
                    int temp = lista[j+1];
                    lista[j+1]=lista[j];
                    lista[j]= temp;
                }
            }
        }
        return lista;
    }
    
    public Comparable[] selectionSort (Comparable[] list){
        int min;
        Comparable temp;
        
        for (int index = 0; index < list.length-1; index++){
            min = index;
            for (int scan = index+1; scan < list.length; scan++){
                if (list[scan].compareTo(list[min]) < 0){
                    min = scan;
                }
            }
                    // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
        
        return list;
   }
}
