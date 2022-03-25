package Course.Course2.Efremov.Homeworks.HomeWork1;

public class Cat extends Team implements RunByTreadmill, JumpThroughTheWall {

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }

    @Override
    public void run() {
        System.out.println("Кот бегает");
    }

    @Override
    public void wallJump(Wall wall) {
        System.out.println("Кот перепрыгнул стену");
    }

    @Override
    public void treadMillRun(Treadmill treadmill) {
        System.out.println("Кот пробежал по беговой дорожке");
    }
}
