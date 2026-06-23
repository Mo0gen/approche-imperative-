package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secret = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("=== JEU : Devinez le nombre ===");
        System.out.println("Je pense à un nombre entre 1 et 100...");

        while (guess != secret) {
            System.out.print("Entrez votre proposition : ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Le nombre cherché est plus grand !");
            } else if (guess > secret) {
                System.out.println("Le nombre cherché est plus petit !");
            } else {
                System.out.println("Bravo, vous avez trouvé en " + attempts + " coups !");
            }
        }

        scanner.close();
    }
}
