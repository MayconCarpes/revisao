//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        InsertionSort sorter = new InsertionSort();
        int[] array = { 12, 11, 13, 5, 6 };

        System.out.println("Array Original:");
        sorter.printArray(array);

        // Ordenação em ordem crescente
        sorter.sort(array);
        System.out.println("Ordenação Crescente:");
        sorter.printArray(array);

        // Ordenação em ordem decrescente
        sorter.sort(array, true);
        System.out.println("Ordenação Decrescente:");
        sorter.printArray(array);
    }
}