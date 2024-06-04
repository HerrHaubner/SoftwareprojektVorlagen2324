
/**
 * Write a description of class MARIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SPIELMITLEVELN extends SPIEL
{

    /**
     * Constructor for objects of class MARIO
     */
    LEVEL1 l1;
    LEVEL2 l2; 

    public SPIELMITLEVELN()
    {
        super(1280,800,true);   //Spiel mit Fenster erzeugen

        new KREIS();         //Bei Bedarf erste Szene einrichten
        LEVEL.setzeSpiel(this); // Das Spiel bei den Leveln anmelden

    }

    public void level1(){        //Levelerzeugung nur außerhalb des Konstruktors möglich sonst Fehler
        l1 = new LEVEL1();
    }

    public void level2(){
        l2 = new LEVEL2();
    }
}
