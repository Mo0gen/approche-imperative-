package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};

        System.out.println("=== Tableau original ===");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Effectuer la rotation à droite
        int[] rotated = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rotated[(i + 1) % array.length] = array[i];
        }

        System.out.println("=== Tableau après rotation à droite ===");
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
        System.out.println();
    }
}
