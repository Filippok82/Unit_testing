package coverage;

import static org.assertj.core.api.Assertions.*;

public class Calculator {
    public  double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double total_sum = 0; // сумма со скидкой
        if (purchaseAmount >= 0) {

            if (discountAmount >= 0 && discountAmount <= 100) {
                total_sum = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException("Скидка должна быть от 0 до 100%");
            }
        } else {
            throw new ArithmeticException("Скидка не может быть отрицательной");
        }


        return total_sum;


    }

    public int LuckySum(int a, int b, int c) {
        if (a == 13) {
            return b + c;
        }
        if (b == 13) {
            return a + c;
        }
        if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }
}
