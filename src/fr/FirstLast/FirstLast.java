package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};

        boolean result = array.length >= 1 && array[0] == array[array.length - 1];

        System.out.println("Le premier et le dernier élément sont identiques : " + result);

        // Tests supplémentaires
        int[] array2 = {5, 2, 3, 5};
        result = array2.length >= 1 && array2[0] == array2[array2.length - 1];
        System.out.println("Test 2 : " + result);

        int[] array3 = {1, 2, 3, 4};
        result = array3.length >= 1 && array3[0] == array3[array3.length - 1];
        System.out.println("Test 3 : " + result);

        int[] array4 = {7};
        result = array4.length >= 1 && array4[0] == array4[array4.length - 1];
        System.out.println("Test 4 (un seul élément) : " + result);

        int[] array5 = {};
        result = array5.length >= 1 && array5[0] == array5[array5.length - 1];
        System.out.println("Test 5 (tableau vide) : " + result);
    }
}
