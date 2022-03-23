package Course.Course2.Efremov.Lessons.JavaLesson1.Interfaces;

public abstract class Animal {
    private String name;

    public abstract void voice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
