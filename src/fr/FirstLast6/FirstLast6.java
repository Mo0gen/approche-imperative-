package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 6};

        boolean result = array.length >= 1 && (array[0] == 6 || array[array.length - 1] == 6);

        System.out.println("Le premier ou le dernier élément est 6 : " + result);

        // Tests supplémentaires
        int[] array2 = {6, 2, 3};
        result = array2.length >= 1 && (array2[0] == 6 || array2[array2.length - 1] == 6);
        System.out.println("Test 2 : " + result);

        int[] array3 = {1, 2, 3};
        result = array3.length >= 1 && (array3[0] == 6 || array3[array3.length - 1] == 6);
        System.out.println("Test 3 : " + result);

        int[] array4 = {};
        result = array4.length >= 1 && (array4[0] == 6 || array4[array4.length - 1] == 6);
        System.out.println("Test 4 (tableau vide) : " + result);
    }
}
