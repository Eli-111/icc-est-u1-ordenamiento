public class Selection {
    public void sort(int[] arreglo) {
        // Mostrar título y arreglo original
        System.out.println("--- Selection Sort ---");
        System.out.println("Original");
        imprimirArreglo(arreglo);

        int comparaciones = 0;
        int cambios = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++; // Contar cada comparación
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }

            // Realizar el intercambio si se encontró un valor menor
            if (min != i) {
                int valI = arreglo[i];
                int valMin = arreglo[min];

                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;

                cambios++; // Contar el cambio
                System.out.println("Pasada= " + i + " | cambio " + valI + "<->" + valMin);
            }
        }

        // Mostrar totales y el resultado ordenado
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Ordenado Asc");
        imprimirArreglo(arreglo);
    }

    // Método auxiliar para imprimir el arreglo con el formato de guiones
    private void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " - ");
        }
        System.out.println();
    }
}
