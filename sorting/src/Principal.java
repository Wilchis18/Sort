import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) { 
            
        
        int a=100;
        int iArraySelection[] = new int[a];
        int iArrayBubble[] = new int[a];
        int iArrayinsectionSort[]= new int[a];
        int iArrayQuickSort[]= new int[a];
        
        for (int i = 0; i < iArraySelection.length; i++) {
            iArraySelection[i] = (int) (Math.random() * 100);
            iArrayBubble[i]= iArraySelection[i];
            iArrayinsectionSort[i]= iArraySelection[i];
            
         

        }
        
double startTimeselection = System.nanoTime();
        SelectionSort(iArraySelection);
        double endTimeselection = System.nanoTime();
        double totTimeselection = endTimeselection - startTimeselection;
        System.out.println("Tiempo SelectionSort: " + totTimeselection);
       
        double startTimeselection1 = System.nanoTime();
        bubbleSort(iArrayBubble);
        double endTimeselection1 = System.nanoTime();
        double totTimeselection1 = endTimeselection1 - startTimeselection1;
        System.out.println("Tiempo BubbleSort: " + totTimeselection1);
        
        double startTimeselection2 = System.nanoTime();
        insertionSort(iArrayBubble);
        double endTimeselection2 = System.nanoTime();
        double totTimeselection2 = endTimeselection2 - startTimeselection2;
        System.out.println("Tiempo InsertionSort: " + totTimeselection2);
        
        double startTimeselection3 = System.nanoTime();
        Principal.quickSort(iArrayQuickSort, 0, iArraySelection.length - 1);
        double endTimeselection3 = System.nanoTime();
        double totTimeselection3 = endTimeselection3 - startTimeselection3;
        System.out.println("Tiempo QuickSort: " + totTimeselection2);
        
        
         
}
    }

    public static void SelectionSort(int[] arreglo) {
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[index]) {
                    index = j;
                }
            }
            int smallerNumber = arreglo[index];
            arreglo[index] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
       

    }

   

    public void InsertionSort(int[] Array) {

    }
    public static void bubbleSort(int[] arreglo) {
        
        int n = arreglo.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arreglo[j - 1] > arreglo[j]) {
                    //swap elements  
                    temp = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = temp;
                    
                }
 
            }
        }
    }

    public static void insertionSort(int arreglo[]) {

        for (int i = 0; i < arreglo.length; i++) {
            int n = arreglo[i];
            int j = i - 1;
            while ((j > -1) && (arreglo[j] > n)) {
                arreglo[j + 1] = arreglo[j];
                j--;

            }
            arreglo[j + 1] = n;
        }
        
    }

    public static void quickSort(int[] arreglo, int izq, int der) {
        
        int pivote = arreglo[izq]; 
        int i = izq; 
        int j = der; 
        int aux;

        while (i < j) {           
            while (arreglo[i] <= pivote && i < j) {
                i++; 
            }
            while (arreglo[j] > pivote) {
                j--;         
            }
            if (i < j) {                                            
                aux = arreglo[i];                 
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }
        arreglo[izq] = arreglo[j]; 
        arreglo[j] = pivote; 
        if (izq < j - 1) {
            quickSort(arreglo, izq, j - 1); 
        }
        if (j + 1 < der) {
            quickSort(arreglo, j + 1, der); 

        }
        
    }
}