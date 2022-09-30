package Classes;

public class Robot {

    public int teamNumber;
    public String teamName;

    private int cargoScored;
    private int climbLevel;

    private double speed; 

    public Robot(int number, String name) {
        System.out.println("Made a new robot!");

        teamNumber = number;
        teamName = name;
    }

    public void addCargo(int newCargo) {
        cargoScored += newCargo;
    }

    public void setClimbLevel(int level) {

        if (level > 4 || level < 0) {
            return;
        }

        climbLevel = level;

        System.out.println("Set climb level to " + climbLevel);
    }
}
