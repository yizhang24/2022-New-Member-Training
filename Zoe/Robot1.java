public class Robot1 {

        public Robot1(int number, String name) {
            System.out.println("Made a new Robot"); 
            teamName = name;
            teamNumber = number; 
        }

        public int teamNumber; 
        // I can access public fields from Robot
        // I can't access private fields from robot

        public String teamName; 
        private int cargoscore;
        private int climblevel;

        public void addCargo(int newCargo) {
            cargoscore += newCargo; 
            // every instance can use this function

        }
        public void setClimblevel(int level) {
            if (level > 4 || level < 0) {
                return; 
            }
            climblevel = level;

            System.out.println("Climb level is " + climblevel); 
        }

}
