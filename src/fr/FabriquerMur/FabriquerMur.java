package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
        // Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        // Essayer toutes les combinaisons possibles de briques
        for (int i = 0; i <= nbBig; i++) {
            int remaining = longueur - (i * 5);
            if (remaining >= 0 && remaining <= nbSmall) {
                return true;
            }
        }
        return false;
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean expected) {
        if (fabriquerMur(nbSmall, nbBig, longueur) == expected) {
            System.out.println("✓ Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") passant.");
        } else {
            System.err.println("✗ Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        }
    }
}
