public class classespractice {
    public static void main(String []args) {
        public class Robot {
            public string team_name;
            public int team_number;
            private int balls_scored;
            private int climb_level;
            public Robot(int number, string name) {
                team_number = number;
                team_name = name;

            }
            public int setBallsScored(int ball) {
                this.balls_scored = ball + balls_scored;
            }
            public int setClimbLevel(int level) {
                this.climb_level = level;
            }
            public int getPointsScored() {
                return points_scored;
            }
        }
    }
}
