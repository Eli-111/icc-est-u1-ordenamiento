public class InsertionSort {
    public void sort(int[] arreglo) {
        System.out.println("--- Selection Insertion ---");
        System.out.println("Original");
        imprimirArreglo(arreglo)
        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i - 1;

            // Desplaza los elementos menores hacia la derecha para ordena
            while (j >= 0 && arreglo[j] < key) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            
            int posInserta = j + 1;
            arreglo[posInserta] = key;

            System.out.println("El aux= " + key + " se inserta en pos " + posInserta);
        }

        System.out.println("Ordenado Des");
        imprimirArreglo(arreglo);
    }
    
    private void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " - ");
        }
        System.out.println();
    }
}
