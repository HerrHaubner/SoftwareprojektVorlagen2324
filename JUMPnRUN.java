public class JUMPnRUN extends SPIEL{
    FIGUR obb;
    FIGUR plattform;
    FIGUR plattform2;
    FIGUR bombe1;
    FIGUR bombe2;
    FIGUR bombe3;
    FIGUR pilz;
    public JUMPnRUN(){
        zeigeKoordinatensystem(true);
        obb = new FIGUR("obb.png");
        plattform = new FIGUR("plattform.png");
        plattform2 = new FIGUR("plattform.png");
        bombe1 = new FIGUR("bombe.png");
        bombe2 = new FIGUR("bombe.png");
        bombe3 = new FIGUR("bombe.png");
        pilz = new FIGUR("pilz.png");
        setzePositionen();
        warte(2);
        //#Nimm jeweils den nächste Kommentar raus und starte erneut das JUMPnRUN-Spiel und notiere dir die Auswirkungen an
        //#Überleg dir was die Übergabewerte bei den Methoden bedeuten könnten
        //#Springen auf Pfeil nach oben
        
        //obb.macheAktiv();

        
        //plattform.machePassiv();
        //plattform2.machePassiv();

        
        //bombe1.animiereGerade(1, 10, 2.5, true);

        
        //bombe2.animiereKreis(5, 9, 0, false, true);

        
        //bombe3.animiereTransparenz(3, 0.5);
        

        //obb.setzeElastizitaet(0.3);
        
        
        //pilz.macheAktiv();
                
    }

    public void tasteReagieren(int taste){
        if(taste == TASTE.RAUF){
            obb.springe(12);
        }
        
    }

    public void bildAktualisierungReagieren(double s){
        if(istTasteGedrueckt(TASTE.RECHTS)){
            obb.verschiebenUm(0.1, 0);
        }
        if(istTasteGedrueckt(TASTE.LINKS)){
            obb.verschiebenUm(-0.1, 0);
        }
    }

    public void setzePositionen(){
        obb.setzeMittelpunkt(-1.5,0);
        plattform.setzeMittelpunkt(0, -5);
        plattform2.setzeMittelpunkt(5, -5);
        bombe1.setzeMittelpunkt(7, 2.5);
        bombe2.setzeMittelpunkt(7, 0);
        bombe3.setzeMittelpunkt(7, 5);
        pilz.setzeMittelpunkt(2, -4);
    }

    
}