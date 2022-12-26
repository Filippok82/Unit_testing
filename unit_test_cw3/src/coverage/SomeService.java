package coverage;

public class SomeService {
    public String fizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return "" + i;
        }
    }
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        } else if (nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
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
}

