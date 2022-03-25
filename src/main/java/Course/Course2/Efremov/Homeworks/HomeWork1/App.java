package Course.Course2.Efremov.Homeworks.HomeWork1;

public class App {
    public static void main(String[] args) {
        Wall wall = new Wall(10);
        Treadmill treadmill = new Treadmill(10);
        Human human = new Human();
        Robot robot = new Robot();
        Cat cat = new Cat();
        Team[] team = {human, robot, cat};
        for(Team team1 : team){
            team1.treadMillRun(treadmill);
            team1.wallJump(wall);
        }

    }


}
