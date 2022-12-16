
public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }


    public static double squareRootExtraction(double number) {

        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые

        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        }
        while ((t - squareRoot) != 0);
        return squareRoot;

        // или просто return Math.sqrt(number);
    }

    // Задание №1 Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    //Метод вычисления суммы покупки (метод принимает сумму, процент скидки и возвращает сумму со скидкой)
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