package Course.Course2.Efremov.Homeworks.HomeWork1;

public class Robot extends Team implements RunByTreadmill, JumpThroughTheWall{

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }

    @Override
    public void run() {
        System.out.println("Робот бегает");
    }

    @Override
    public void wallJump(Wall wall) {
        System.out.println("Робот перепрыгнул стену");
    }

    @Override
    public void treadMillRun(Treadmill treadmill) {
        System.out.println("Робот пробежал по беговой дорожке");
    }
}
