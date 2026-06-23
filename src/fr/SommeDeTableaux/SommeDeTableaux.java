package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        int[] somme = new int[tab1.length];
        for (int i = 0; i < tab1.length; i++) {
            somme[i] = tab1[i] + tab2[i];
        }

        System.out.println("=== Tableau 1 ===");
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println();

        System.out.println("=== Tableau 2 ===");
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }
        System.out.println();

        System.out.println("=== Tableau somme ===");
        for (int i = 0; i < somme.length; i++) {
            System.out.print(somme[i] + " ");
        }
        System.out.println();
    }
}
