import game.Car;
import game.RandomNo;
import game.RandomNoStatusEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RandomNoTest {
    @Test
    @DisplayName("0에서 9 사이의 랜덤 값 생성 기능 테스트")
    void create_0_to_9_random_no_test() {
        RandomNo randomNo = new RandomNo();
        assertThat(randomNo);
        assertThat(randomNo.getNo()).isGreaterThanOrEqualTo(0);
        assertThat(randomNo.getNo()).isLessThanOrEqualTo(9);
        System.out.println("randomNo: " + randomNo.getNo());
    }

    @Test
    @DisplayName("랜덤 값 생성 후 전진, 멈춤 판단 테스트")
    void create_random_no_and_valid_run_and_stop_test() {
        RandomNo randomNo = new RandomNo();
        System.out.println("randomNo: " + randomNo.getNo());

        if (RandomNo.isRun(randomNo.getNo())) {
            assertThat(randomNo.getState()).isEqualByComparingTo(RandomNoStatusEnum.RUN);
        } else {
            assertThat(randomNo.getState()).isEqualByComparingTo(RandomNoStatusEnum.STOP);
        }

        System.out.println("randomState: " + randomNo.getState());
    }

    @Test
    @DisplayName("자동차가 n번 실행 하기 테스트 + 거리 출력 테스트")
    void run_or_stop_N_cycle_test() {
        Car car = new Car("testCar");
        for (int i = 0; i < 5; i++) {
            car.printResult();
            car.startRandomRun();
        }
    }
}
