package game;

import common.ConstantUtil;

public class Car {
    private String name;
    private RandomNo randomNo;
    private int distance = ConstantUtil.DISTANCE_INITIAL_VALUE;

    public Car(String name) {
        this.name = name;
        this.randomNo = new RandomNo();
    }

    public String getName() {
        return name;
    }

    public RandomNo getRandomNo() {
        return randomNo;
    }

    public int getDistance() {
        return distance;
    }

    public void startRandomRun() {
        this.randomNo = new RandomNo();
        if (this.randomNo.getState().isRun()) {
            run();
        }
    }

    public int run() {
        this.distance = getDistance() + ConstantUtil.RUN_MOVE_VALUE;
        return getDistance();
    }

    public void printResult() {
        StringBuilder minusText = new StringBuilder();

        for (int i = 0; i < getDistance(); i++) {
            minusText.append(ConstantUtil.MINUS_CHAR);
        }

        System.out.println(getName() + " : " + minusText.toString());
    }
}
