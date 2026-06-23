package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        // Afficher tous les nombres de 1 à 10 avec for
        System.out.println("=== Nombres 1 à 10 (for) ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Afficher tous les nombres pairs entre 0 et 10 avec for
        System.out.println("=== Nombres pairs 0 à 10 (for) ===");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Afficher tous les nombres impairs entre 0 et 9 avec for
        System.out.println("=== Nombres impairs 0 à 9 (for) ===");
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Afficher tous les nombres de 1 à 10 avec while
        System.out.println("=== Nombres 1 à 10 (while) ===");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Afficher tous les nombres pairs entre 0 et 10 avec while
        System.out.println("=== Nombres pairs 0 à 10 (while) ===");
        int j = 0;
        while (j <= 10) {
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println();

        // Afficher tous les nombres impairs entre 0 et 9 avec while
        System.out.println("=== Nombres impairs 0 à 9 (while) ===");
        int k = 1;
        while (k <= 9) {
            System.out.print(k + " ");
            k += 2;
        }
        System.out.println();
    }
}
