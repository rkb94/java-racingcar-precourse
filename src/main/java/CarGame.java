import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarGame {
    private Cars cars;

    private int count;

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public CarGame() {
    }

    public void start() {
        inputCarNames();
        inputTryCount();
        startGame();
        printResult();
    }

    private void startGame() {
        System.out.println("실행 결과");
        for (int i = 0; i < this.count; i++) {
            this.cars.startCars();
            System.out.println();
        }
    }

    private void printResult() {
        StringBuilder winnerListToStringWithComma = new StringBuilder();
        for (Car car : getCars().getWinnerList()) {
            if (winnerListToStringWithComma.length() > 0) {
                winnerListToStringWithComma.append(ConstantUtil.COMMA);
            }
            winnerListToStringWithComma.append(car.getName());
        }

        System.out.println(winnerListToStringWithComma.toString() + "가 최종 우승했습니다.");
    }

    private void inputCarNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        List<String> nameList = getStringToCarNameList(scanner.next());
        List<Car> carList = new ArrayList<>();

        for (String name: nameList) {
            carList.add(new Car(name));
        }

        setCars(new Cars(carList));
    }

    private List<String> getStringToCarNameList(String string) {
        return Arrays.asList(string.split(","));
    }

    private void inputTryCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        setCount(scanner.nextInt());
        System.out.println();
    }
}
