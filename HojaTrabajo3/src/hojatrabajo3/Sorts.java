
package hojatrabajo3;

/**
 * Clase donde se encuentran los metodos de sorting, cada uno con la capacidad de ordenar valores
 * de menor a mayor, pero con un tiempo de ejecucion diferente.
 * @author Cpn. Javier Garfio
 * @author Diego C-villa
 */
public class Sorts {
    
    
    
    public Comparable[] GnomeSort(Comparable[] list){
        for (int index = 1; index < list.length;) {
            if(list[index-1].compareTo(list[index]) < 0) {
                ++index;
            }else{
                Comparable tempVal = list[index];
                list[index] = list[index - 1];
                list[index - 1] = tempVal;
                --index;
                if ( index == 0 ) {
                    index = 1;
                }
            }
        }
        
        return list;
    }
    
    public void MergeSort(String[] list){
        
    }
    
    public void QuickSort(String[] list){
        
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
