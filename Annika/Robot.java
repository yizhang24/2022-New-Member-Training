package Classes;

public class Robot {
    //a constructer
   
    public int teamnumber;
    public String teamname;
    
    private int cargoScored;
    private int climblevel;
    public Robot(int Number, String Name) {
        System.out.println("Made a new robot!");
        teamnumber = Number;
        teamname = Name; 
    }
    public void addCargo(int newCargo) {
        cargoScored += newCargo; 
    }
    public void setClimblevel(int level) {

        if(level > 4 || level < 0) {
            return; 
        }
        climblevel = level;

        System.out.println( "Set climb level to " + climblevel);
    }
}
