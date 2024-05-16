package adsaufgabe3;

public class Partitionsgrenzen {
    private int kleinereGrenze;
    private int groessereGrenze;

    public Partitionsgrenzen(int kleiner, int groesser) {
        kleinereGrenze = kleiner;
        groessereGrenze = groesser;
    }

    public int getKleinereGrenze() {
        return kleinereGrenze;
    }

    public int getGroessereGrenze() {
        return groessereGrenze;
    }
}
