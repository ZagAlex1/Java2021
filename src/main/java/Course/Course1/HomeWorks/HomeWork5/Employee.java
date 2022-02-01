package Course.Course1.HomeWorks.HomeWork5;

public class Employee {

    private String nsl;
    private String position;
    private boolean marriage;
    private int phoneNumber; //В примере надо long ставить я оставил int. Это же не принципиально на данный момент?
    private int salary;
    private int age;

    public Employee(String nsl, String position, boolean marriage, int phoneNumber, int salary, int age) {
        this.nsl = nsl;
        this.position = position;
        this.marriage = marriage;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void ageInfo() {
        if (this.age > 40) {
            System.out.println("ФИО: " + nsl + " Должность: " + position + " Семейное положение: " + marriage + " Номер телефона: " + phoneNumber + " Зарплата: " + salary + " Возраст: " + age);
        }
    }

    public void info() {
        System.out.println("ФИО: " + nsl + " Должность: " + position + " Семейное положение: " + marriage + " Номер телефона: " + phoneNumber + " Зарплата: " + salary + " Возраст: " + age);
    }

    public String getNsl() {
        return nsl;
    }

    public void setNsl(String nsl) {
        this.nsl = nsl;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
