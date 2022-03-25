package Course.Course2.Efremov.Homeworks.HomeWork1;

public class Human extends Team implements RunByTreadmill, JumpThroughTheWall {

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public void run() {
        System.out.println("Человек бегает");
    }

    @Override
    public void wallJump(Wall wall) {
        System.out.println("Человек перепрыгнул стену");
    }

    @Override
    public void treadMillRun(Treadmill treadmill) {
        System.out.println("Человек пробежал по беговой дорожке");
    }
}
