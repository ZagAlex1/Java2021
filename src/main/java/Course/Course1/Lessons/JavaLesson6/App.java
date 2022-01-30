package Course.Course1.Lessons.JavaLesson6;

public class App {
    public static void main(String[] args) {
        Transport t1 = new Car("Kia", 2010);
        Transport t2 = new Cabrio("Crysler", 1998, true);
        Transport t3 = new Bike(2);

        Transport[] transports = {t1, t2, t3};

        for (Transport transport : transports) {
            transport.printInventionDate();
        }
    }
}
