package adsaufgabe3;

import java.util.Arrays;

class Testtreiber {
    public static void main(String[] args) {
        IQuicksort sort = new Quicksort_RaadSaif();

        String[] feld1 = {"aba", "baaza", "abab", "bab", "baaaa", "bazbab"};
        String[] soll1 = {"baaaa", "baaza", "aba", "abab", "bazbab", "bab"};
        int sollpart1 = 5;

        // Testfall 1
        int part = sort.sortiere(feld1, 0, 5);
        if (Arrays.toString(feld1).equals(Arrays.toString(soll1)) && (part == sollpart1))
            System.out.println("Testfall 1 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 1");

        // Testfall 2
        String[] feld2 = {"aba", "baaza", "abab", "bab", "baaaa", "bazbab"};
        String[] soll2 = {"aba", "baaza", "abab", "bazbab", "baaaa", "bab"};
        int soll_links2 = 4;
        int soll_rechts2 = 5;
        Partitionsgrenzen pg = sort.partition(feld2, 0, 5);
        if (Arrays.toString(feld2).equals(Arrays.toString(soll2)) &&
                (soll_links2 == pg.getKleinereGrenze()) &&
                (soll_rechts2 == pg.getGroessereGrenze()))
            System.out.println("Testfall 2 erfolgreich");
        else
            System.out.println("Fehler bei der Bearbeitung von Testfall 2");
    }
}
