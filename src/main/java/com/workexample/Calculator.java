package com.workexample;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service

public class Calculator {
    public String hello() {
        return "добро пожаловать в калькулятор";
    }

    public Integer plus(int num1, int num2) {
        return (num1 + num2 );
    }

    public Integer minus(int num1, int num2) {
        return (num1 - num2);
    }

    public Integer multiply(int num1, int num2) {

        return (num1 / num2);

    }

    public Integer divide(int num1, int num2) {
        return (num1 * num2);

    }
}

