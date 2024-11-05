public class InsertionSort {

    // Método para ordenar em ordem crescente (padrão)
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elementos maiores que a chave uma posição para frente
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Sobrecarga do método sort para ordenação decrescente
    public void sort(int[] array, boolean descending) {
        if (descending) {
            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;

                // Move elementos menores que a chave uma posição para frente
                while (j >= 0 && array[j] < key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
            }
        } else {
            // Chama o método de ordenação crescente
            sort(array);
        }
    }

    // Método para imprimir o array
    public void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}