package Course.Course1.Lessons.AddLesson;

public class Person {
    private final String name;
    private final int age;
    private final String position;
    private final double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Builder builder(){
        return new Builder();
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void info() {
        System.out.println(this);
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.position = builder.position;
        this.salary = builder.salary;
    }


    public static class Builder {
        private String name;
        private int age;
        private String position;
        private double salary;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withPosition(String position) {
            this.position = position;
            return this;
        }

        public Builder withSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

        public Builder fromPerson(Person person){
            return new Builder().withName(person.name).withSalary(person.salary);
        }
    }
}
