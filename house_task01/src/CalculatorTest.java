import static org.assertj.core.api.Assertions.*;
// < ---------- Не забудьте добавить библиотеку libs/assertj-core-3.23.1.jar - add as Library...

public class CalculatorTest {
    public static void main(String[] args) {


// Задание №1 Нужно написать в калькуляторе метод вычисления суммы покупки (метод принимает сумму, процент
// скидки и возвращает сумму со скидкой) и проверить его используя AssertJ (отрицательное числа,
// 0, дроби, проценты >=100%, обычные скидки). Все ошибки должны быть обработаны, при вводе
// недопустимых аргументов можно выбрасывать (throw new ArithmeticException("Суть ошибки");),
// но нужно проверить, что все ошибки проверяются в тестах. (Заготовки метода уже есть в классе
// Calculator - calculatingDiscount)


        System.out.println(Calculator.calculatingDiscount(2000, 10));
        assertThat(Calculator.calculatingDiscount(2000, 50))
                .isEqualTo(1000); // обычная скидка
        assertThat(Calculator.calculatingDiscount(2000, 100))
                .isEqualTo(0); // обычная скидка
        assertThat(Calculator.calculatingDiscount(2000, 0))
                .isEqualTo(2000); // обычная скидка


        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(2000, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть от 0 до 100%"); // процент скидки больше 100%

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(2000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть от 0 до 100%"); // процент скидки меньше 0

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-2000, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка не может быть отрицательной"); // процент скидки меньше 0
    }
}

