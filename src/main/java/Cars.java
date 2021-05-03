import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void startCars() {
        for (Car car : this.cars) {
            car.startRandomRun();
            car.printResult();
        }
    }

    public List<Car> getWinnerList() {
        List<Car> winnerList = new ArrayList<>();
        this.cars.sort(Comparator.comparing(Car::getDistance).reversed());
        int winnerDistance = cars.get(0).getDistance();
        for (Car car : this.cars) {
            if (car.getDistance() == winnerDistance) {
                winnerList.add(car);
            }
        }
        return winnerList;
    }

}
