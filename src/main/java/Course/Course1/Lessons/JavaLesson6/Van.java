package Course.Course1.Lessons.JavaLesson6;


//is a
public class Van extends Car {

    int seats;

    public Van(String model, int year, int seats) {
        super(model, year);
        System.out.println("This is a van constructor");
        this.seats = seats;
    }

    public int getSeats() {

        return seats;
    }

    public void setSeats(int seats) {

        this.seats = seats;
    }

    @Override
    void printName() {
        System.out.println("This is a van");
    }
}
