package Course.Course1.Lessons.JavaLesson5;

public class Car {

    public static int wheelsNumber = 0;

    //fields
    private String model;
    private int year;
    private boolean wasCrashed;

    //constructor
   /* public Car(){    //конструктор по умолчанию
    }*/

    //constructor с параметрами
    public Car(String model, int year, boolean wasCrashed) {
        this.model = model;
        this.year = year;
        this.wasCrashed = wasCrashed;
    }

    /*public Car(String model, int year) {
        this.model = model;
        this.year = year;
        wasCrashed = false;
    }*/

    public Car(String model, int year) {    // тоже самое, что и выше
        this(model, year, false);
        this.model += " from overrided constructor";
    }

    public Car(String model){
        this(model,2020);
    }

    /**
     * Выводит на экран информацию о машине
     */
    public void info() {

        System.out.println("Model = " + model + "  Year = " + year + "  WasCrashed = " + wasCrashed);
    }

    public void printModel() {

        System.out.println(model);
    }

    public String getModel() {

        return model;
    }

    public int getYear() {

        return year;
    }

    public boolean isWasCrashed() {

        return wasCrashed;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error");
        }
    }

    public void setWasCrashed(boolean wasCrashed) {
        this.wasCrashed = wasCrashed;
    }

    /**
     * Попали в аварию
     */
    public void crash() {
        System.out.println("Car was crashed");
        wasCrashed = true;
    }


}
