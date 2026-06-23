package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nb = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= nb; i++) {
            sum += i;
        }

        System.out.println("La somme des entiers de 1 à " + nb + " est : " + sum);

        scanner.close();
    }
}
