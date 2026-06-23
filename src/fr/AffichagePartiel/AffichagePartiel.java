package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher que les entiers supérieurs à 3
        System.out.println("=== Entiers supérieurs à 3 ===");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // Afficher que les entiers pairs
        System.out.println("=== Entiers pairs ===");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // Afficher que les valeurs correspondant aux index pairs
        System.out.println("=== Valeurs aux index pairs ===");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Afficher que les entiers impairs
        System.out.println("=== Entiers impairs ===");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
