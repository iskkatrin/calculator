package pro.sky.skyprospringdemocalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        return num1 / num2;

    }
}
