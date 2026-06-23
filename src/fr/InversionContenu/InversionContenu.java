package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Créer un tableau arrayCopy et copier dans l'ordre inverse
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }

        // Afficher l'ensemble des éléments du tableau original
        System.out.println("=== Tableau original ===");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Afficher l'ensemble des éléments du tableau copié (inversé)
        System.out.println("=== Tableau copié (inversé) ===");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.println();
    }
}
