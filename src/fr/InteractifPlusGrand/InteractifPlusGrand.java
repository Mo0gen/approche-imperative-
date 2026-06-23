package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Entrez le nombre " + i + " : ");
            int nb = scanner.nextInt();
            if (nb > max) {
                max = nb;
            }
        }

        System.out.println("Le plus grand nombre est : " + max);

        scanner.close();
    }
}
