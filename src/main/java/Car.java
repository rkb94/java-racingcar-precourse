public class Car {
    private String name;
    private int distance = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public int run() {
        this.distance = getDistance() + 1;
        return getDistance();
    }
}
