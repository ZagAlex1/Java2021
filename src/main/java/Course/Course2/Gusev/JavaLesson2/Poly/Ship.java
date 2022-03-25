package Course.Course2.Gusev.JavaLesson2.Poly;

public class Ship extends WaterTransport{
    int waterline;

    public int getWaterline() {
        return waterline;
    }

    public void setWaterline(int waterline) {
        this.waterline = waterline;
    }

    @Override
    void load() {
        System.out.println("Погрузка корабля");
    }

    @Override
    public void swim() {
        System.out.println("Корабль плывет очень медленно");
    }
}
