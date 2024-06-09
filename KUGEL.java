import ea.edu.*;

public class KUGEL extends KREIS implements KollisionsReagierbar{
    public KUGEL(){
        super();
    }
    
    public boolean kollisionReagieren(EduActor ea){
        
        if(ea.getClass().getName().equals("KUGEL")) {   System.out.println("Eine Kugel wurde berührt");}
        return true;   
    }
    

}