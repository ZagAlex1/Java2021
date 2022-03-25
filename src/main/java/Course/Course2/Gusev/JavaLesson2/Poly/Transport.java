package Course.Course2.Gusev.JavaLesson2.Poly;

public abstract class Transport {
    int capasity;

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    /**
     * Посадка в транспорт
     */
    abstract void load();
}


