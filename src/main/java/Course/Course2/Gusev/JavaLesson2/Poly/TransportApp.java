package Course.Course2.Gusev.JavaLesson2.Poly;

public class TransportApp {
    public static void main(String[] args) {
        Transport[] transports = new Transport[]{new Cater(), new Ship(), new Bus()};
        for (Transport transport : transports) {
            transport.load();
            if (transport instanceof Swimmalle) {
                System.out.println("Эта штука плавает");
                Swimmalle swimmalle = (Swimmalle) transport;
                swimmalle.swim();
            }

            if (transport instanceof Bus) {
                Bus bus = (Bus) transport;
                System.out.println("Маршрут " + bus.getMarshroot());
            }
            System.out.println();
        }

        NewsService newsService = new OracleNewsService();

        newsService.getNews();
    }
}
