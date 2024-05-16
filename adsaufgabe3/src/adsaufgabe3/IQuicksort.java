package adsaufgabe3;

public interface IQuicksort {
    public int sortiere(String[] eingabe, int links, int rechts);
    public Partitionsgrenzen partition(String[] eingabe, int links, int rechts);
}
