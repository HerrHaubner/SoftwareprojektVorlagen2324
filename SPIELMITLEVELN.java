
/**
 * Beispiel für Spiel mit verschiedenen Leveln
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SPIELMITLEVELN extends SPIEL
{

    LEVEL1 l1;
    LEVEL2 l2; 

    public SPIELMITLEVELN()
    {
        super(1280,800,true);   //Spiel mit Fenster erzeugen

        new KREIS();            //Bei Bedarf erste Szene einrichten
        LEVEL.setzeSpiel(this); // Das Spiel bei den Leveln anmelden

    }

    public void level1erzeugen(){        //Levelerzeugung nur außerhalb des Konstruktors möglich sonst Fehler
        l1 = new LEVEL1();
    }

    public void level2erzeugen(){
        l2 = new LEVEL2();
    }
    
    public void level1anzeigen(){        //Levelerzeugung nur außerhalb des Konstruktors möglich sonst Fehler
        setzeAktiveSzene("LEVEL1");
    }
    
    public void levelwanzeigen(){        //Levelerzeugung nur außerhalb des Konstruktors möglich sonst Fehler
        setzeAktiveSzene("LEVEL2");
    }
}
