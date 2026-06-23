package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Entrez un nombre entre 1 et 10 : ");
            nb = scanner.nextInt();

            if (nb >= 1 && nb <= 10) {
                valid = true;
            } else {
                System.out.println("Nombre invalide, veuillez réessayer.");
            }
        }

        System.out.println("Vous avez entré : " + nb);
        scanner.close();
    }
}
