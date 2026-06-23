package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nb = scanner.nextInt();

        System.out.print("Les 10 nombres suivants : ");
        for (int i = nb + 1; i <= nb + 10; i++) {
            System.out.print(i);
            if (i < nb + 10) {
                System.out.print(", ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
