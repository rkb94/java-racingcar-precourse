import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("testCar");
    }

    @Test
    @DisplayName("자동차 전진 기능 테스트")
    void run_car_test() {
        assertThat(car.advance()).isEqualTo(1);
        assertThat(car.advance()).isEqualTo(2);
        assertThat(car.advance()).isEqualTo(3);
    }

}
