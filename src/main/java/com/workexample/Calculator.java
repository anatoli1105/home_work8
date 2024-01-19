package com.workexample;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service

public class Calculator {
    public String hello() {
        return "добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return num1 + "+" + num2 + "=" + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }

    public String multiply(int num1, int num2) {

        return num1 + "/" + num2 + "=" + (num1 / num2);

    }

    public String divide(int num1, int num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);

    }
}

