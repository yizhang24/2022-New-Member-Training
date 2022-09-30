package Classes;

public class main {
    public static void main(String[] args) {
        // I can access public fields in main
        // I can't access private fields in main
        
        Robot robot = new Robot(1678, "Citrus Circuits");
        
        System.out.println(robot.teamname);
        System.out.println(robot.teamnumber);

        robot.addCargo(2);


        robot.addCargo(2);
        robot.addCargo(2);
        robot.addCargo(2);

        robot.setClimblevel(3);
        robot.setClimblevel(2);
        robot.setClimblevel(10);
        robot.setClimblevel(-5);



        flywheel.setspeed(12);
    }
    
}
