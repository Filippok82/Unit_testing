package coverage;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUps() {
        calculator = new Calculator();
    }

    @Test
    void RegularDiscount() {
        assertThat(calculator.calculatingDiscount(2000,100)).isEqualTo(0);
        assertThat(calculator.calculatingDiscount(2000,0)).isEqualTo(2000);
        assertThat(calculator.calculatingDiscount(2000,50)).isEqualTo(1000);
    }
    @Test
    void DiscountMore() {
        assertThatThrownBy(() ->
                calculator.calculatingDiscount(2000, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть от 0 до 100%"); // процент скидки больше 100%
    }
      @Test
    void DiscountLess() {
          assertThatThrownBy(() ->
                  calculator.calculatingDiscount(2000, -10))
                  .isInstanceOf(ArithmeticException.class)
                  .hasMessage("Скидка должна быть от 0 до 100%"); // процент скидки меньше 0
      }

      @Test
    void NegativeCost(){
    assertThatThrownBy(() ->
            calculator.calculatingDiscount(-2000, 10))
            .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка не может быть отрицательной"); // отрицательная стоимость
}

    @Test
    void luckySumReturnCheck13() {
        assertThat(calculator.LuckySum(13,2,4)).isEqualTo(6);
        assertThat(calculator.LuckySum(10,13,5)).isEqualTo(15);
        assertThat(calculator.LuckySum(8,2,13)).isEqualTo(10);
        assertThat(calculator.LuckySum(1,2,4)).isEqualTo(7);

    }
}