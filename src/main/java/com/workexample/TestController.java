package com.workexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final Calculator minus;
    private final Calculator hello;
    private final Calculator plus;
    private final Calculator multiply;
    private final Calculator divide;


    public TestController(Calculator minus, Calculator hello, Calculator plus, Calculator multiply, Calculator divide){

        this.minus=minus;
        this.hello=hello;
        this.plus = plus;
        this.multiply = multiply;
        this.divide = divide;
    }
    @GetMapping(path = "/calculator")
    public String hello(){
        return hello.hello();
    }
    @GetMapping(path = "/plus")
    public String plusNumbers(@RequestParam(required = false) Integer num1,@RequestParam (required = false)Integer num2){
        if(num1==null||num2==null){
            return "одного числа нет";
        }

        return hello.plus(num1,num2);
    }

    @GetMapping(path = "/minus")
    public String minusNumbers(@RequestParam (required = false)Integer num1,@RequestParam(required = false) Integer num2){
       if(num1==null||num2==null){
           return "одного числа нет";
       }
        return hello.minus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyNumbers(@RequestParam (required = false)Integer num1,@RequestParam (required = false) Integer num2){

            if(num1==null||num2==null){
                return "одного числа нет";
            }
            if(num2!=0) {
            return hello.multiply(num1, num2);
        }else {
            return " на ноль не делится";
        }
    }
    @GetMapping(path = "/divide")
    public String divideNumbers(@RequestParam (required = false)Integer num1,@RequestParam (required = false) Integer num2){
        if(num1==null||num2==null){
            return "одного числа нет";
        }
        return hello.divide(num1,num2);
    }
}

