
public class KOLLISIONEN extends SPIEL{
    KUGEL k1;
    KUGEL k2;
    RECHTECK r;

    public KOLLISIONEN(){
        super(1280,800,true);//Größe des Fensters,Maus aktivieren
        zeigeKoordinatensystem(true);
        randErzeugen();
        
        k1 = new KUGEL();
        k1.setzeMittelpunkt(3, 0);
        
        
        //Schwerkraft insgesamt aussetzen und k1 an der Physik teilnehmen lassen
        setzeSchwerkraft(0);
        k1.macheAktiv();
        k1.setzeElastizitaet(0.5);
        
        //#Nimm jeweils den nächste Kommentar raus und starte erneut das JUMPnRUN-Spiel und sieh dir die Auswirkungen an
        //#Bewegen der Kugel durch Mausklick
        

        // k2 = new KUGEL(); k2.setzeMittelpunkt(-5, 0); 
        // k2.macheAktiv(); 
        // k2.setzeElastizitaet(0.5);


        // k2.setzeRadius(5);
        
        
        // k2.setzeDichte(1);


        // r = new RECHTECK(); r.setzeMittelpunkt(0, 8); r.macheAktiv(); r.setzeElastizitaet(0.9);
        

        // r.setzeRotationBlockiert(false);
        

        // k2.erzeugeStabverbindung(r, k2.nenneMx(), k2.nenneMy(),r.nenneMx(), r.nenneMy() );
        
        // k1.registriereKollisionsReagierbar(k2);

    }

    public void klickReagieren(double x, double y){
        double deltaX = x-k1.nenneMx();
        double deltaY = y-k1.nenneMy();
        k1.wirkeImpuls(deltaX*40, deltaY*40);
    }
    
    public void randErzeugen(){
        RECHTECK randLinks = new RECHTECK();
        randLinks.setzeGroesse(1,30);
        randLinks.setzeFarbe("rot");
        randLinks.setzeMittelpunkt(-21.1, 0);
        randLinks.machePassiv();

        RECHTECK randRechts = new RECHTECK();
        randRechts.setzeGroesse(1,30);
        randRechts.setzeFarbe("rot");
        randRechts.setzeMittelpunkt(21.1, 0);
        randRechts.machePassiv();

        RECHTECK randOben = new RECHTECK();
        randOben.setzeGroesse(55,1);
        randOben.setzeFarbe("rot");
        randOben.setzeMittelpunkt(0, 13);
        randOben.machePassiv();

        RECHTECK randUnten = new RECHTECK();
        randUnten.setzeGroesse(55,1);
        randUnten.setzeFarbe("rot");
        randUnten.setzeMittelpunkt(0,-13);
        randUnten.machePassiv();
    }


}
