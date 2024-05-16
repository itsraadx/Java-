package adsaufgabe1;

public class DynFeld_MEINNAME implements IDynFeld {
    
    private String[] feld = null;
    // hier koennen noch weitere Attribute dazu kommen

    /* Konstruktor ohne Argumente.
       erzeugt ein Feld der Groesse 8.
       Wird von meinen Testprogrammen aufgerufen */
    public DynFeld_MEINNAME () {	
    }

    /* Einfuegen eines neuen Elements in das unsortierte Feld 
       Rueckgabewert: --, ggf. wird das Feld vergroessert */
    public void insert(String name) {
	
    }

    /* Suchen nach einem Element und Rueckgabe des ersten Index 
       mit dem gesuchten Schlüsselwert; beachten Sie, dass der
       Aufrufer eine Nummerierung der Elemente ab 1 und nicht wie 
       in C oder Java üblich ab 0 erwartet.
       Rueckgabewert: Index des gesuchten Elements,
       sonst: 0 */
    public int find(String name) {
	return 0; 
    }

    /* Loeschen eines Elements - bei mehreren passenden Elementen
       wird auch dasjenige mit dem kleinsten Index geloescht.
       Rueckgabewert: true, falls Element in 
                      Liste -- ggf. wird das Feld verkleinert
       sonst: false */
    public boolean delete(String name) {
	return false;
    }

    /* liefere Anzahl der gespeicherten Elemente
       Rueckgabewert: anzahl  */
    public int getCurrentNumber() {
	return 0;
    }

    /* liefere Groesse des aktuellen Felds
       Rueckgabewert: max speicherbare Anzahl im aktuell vorliegenden Feld  */
    public int getSize() {
	return 0;
    }

}
