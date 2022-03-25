package Course.Course2.Gusev.JavaLesson2.Poly;

public class Bus extends Transport {
    String marshroot;

    public String getMarshroot() {
        return marshroot;
    }

    public void setMarshroot(String marshroot) {
        this.marshroot = marshroot;
    }

    @Override
    void load() {
        System.out.println("Люди ломятся в автобус");
    }
}
