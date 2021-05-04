package game;

import common.ConstantUtil;

import java.util.Random;

public class RandomNo {
    private int no;

    public RandomNo() {
        this.no = createRandomNo();
    }

    public int getNo() {
        return this.no;
    }

    private int createRandomNo() {
        Random random = new Random();
        return random.nextInt(ConstantUtil.RANDOM_NUMBER_MAX - ConstantUtil.RANDOM_NUMBER_MIN) + ConstantUtil.RANDOM_NUMBER_MIN;
    }

    public RandomNoStatusEnum getState() {
        if (isRun(getNo())) {
            return RandomNoStatusEnum.RUN;
        }
        return RandomNoStatusEnum.STOP;
    }

    public static boolean isRun(int no) {
        return ConstantUtil.RUN_SEPARATION_NUMBER <= no && no <= ConstantUtil.RANDOM_NUMBER_MAX;
    }
}
