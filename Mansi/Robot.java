public class Robot {
    public static void main(String[] args) {
    }
       public String team_name;
       public int team_number;
       private int balls_scored;
       private int climb_level;

    Robot(String team_name, int team_number, int balls_scored, int climb_level) {
        this.team_name = team_name;
        this.team_number = team_number;
        this.balls_scored = balls_scored;

    }
    public void printInfo() {
        int a = 1;
        System.out.println(a + balls_scored);
    }

    public void setClimbLevel(int climb_level) {
        
    }


    
}
