package Classes;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot(1678, "Citrus Circuits");

        System.out.println(robot.teamName);
        System.out.println(robot.teamNumber);

        robot.addCargo(2);

        
        robot.addCargo(2);
        robot.addCargo(2);
        robot.addCargo(2);

        Robot secondrobot = new Robot(1679, "Not Citrus");
        secondrobot.addCargo(2);

        robot.setClimbLevel(3);

        robot.setClimbLevel(10);

        robot.setClimbLevel(2);

        robot.setClimbLevel(-1);



    }
}
