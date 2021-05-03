public class Car {
    private String name;
    private RandomNo randomNo;
    private int distance = 0;

    public Car(String name) {
        this.name = name;
        this.randomNo = new RandomNo();
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void startRandomRun() {
        this.randomNo = new RandomNo();
    }

    public int run() {
        this.distance = getDistance() + 1;
        return getDistance();
    }
}
