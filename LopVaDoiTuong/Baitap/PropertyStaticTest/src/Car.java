public class Car {
    private String name;
    private String engine;
    public static int numOfCar=0;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numOfCar++;
    }

}
