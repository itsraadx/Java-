
package adsaufgabe3;

public class Quicksort_RaadSaif implements IQuicksort {

        public Quicksort_RaadSaif() {

        }
        int PartitionCount = 0;    // to count how often the function Partition gets called

        public int sortiere(String[] eingabe, int links, int rechts) {
            if (links < rechts) {
                Partitionsgrenzen pg = partition(eingabe, links, rechts);
                PartitionCount +=1;        
                int index = pg.getKleinereGrenze();
                int index2 = pg.getGroessereGrenze();        // you need to get the other Grenze, the bigger one and put it into sortiere at line 19
                sortiere(eingabe, links, index );           // no need to put -1 after index if you got the rest right
                sortiere(eingabe, index2, rechts);
            }
            return PartitionCount;   // return the Partition count,look at Testtreiber.java. in the 1. test it should be 5("int sollpart1")
        }

        public Partitionsgrenzen partition(String[] eingabe, int links, int rechts) {
            String pivot = eingabe[rechts];
            int i = links;
            int j = rechts;

            while (i <= j) {
                while (kleiner(eingabe[i], pivot))
                    i++;
                while (kleiner(pivot, eingabe[j]))
                    j--;

                if (i <= j) {
                    tausche(eingabe, i, j);
                    i++;
                    j--;
                }
            }

            return new Partitionsgrenzen(j, i);       
        }

        private void tausche(String[] eingabe, int i, int j) {
            String temp = eingabe[i];
            eingabe[i] = eingabe[j];
            eingabe[j] = temp;
        }

        private boolean kleiner(String s1, String s2) {
            int countS1 = countA(s1);
            int countS2 = countA(s2);

            if (countS1 > countS2)    //  it must be countS1 ">" countS2 instead of countS1 "<" countS2
                return true;
            else if (countS1 == countS2 && s1.compareTo(s2) < 0)
                return true;
            else
                return false;
        }

        private int countA(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a')
                    count++;
            }
            return count;
        }
    }