public class Bubble {
   public void sort(int[] arreglo){
    int cambios = 0;
    int comparaciones = 0;

      for(int i = 0; i < arreglo.length - 1; i++){
        boolean combinaciones = false;
         for(int j = 1; j < arreglo.length - i; j++){
            comparaciones++;
            if (arreglo[j - 1] > arreglo[j]){
                combinaciones = true;
                System.out.println("Cambios: " + cambios);
                System.out.println("Comparaciones " + comparaciones);
               int aux = arreglo[j - 1];
               arreglo[j - 1] = arreglo[j];
               arreglo[j] = aux;
               cambios++;
            }
         }
         if (!combinaciones) {
            break;
         }
      }

    System.out.println("Comparaciones: " + comparaciones);
    System.out.println("Cambios: " + cambios); 
   }
}