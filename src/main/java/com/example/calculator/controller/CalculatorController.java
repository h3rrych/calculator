package com.example.calculator.controller;

import com.example.calculator.service.api.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {
    public class FirstController {
        private final CalculatorService calculatorService;
        public FirstController(CalculatorService calculatorService){
            this.calculatorService=calculatorService;
        }

        @GetMapping
        public String showWelcome(){
            return calculatorService.showWelcome();
        }


        @GetMapping(path = "/plus")
        public String summa(@RequestParam("num1") int num1, @RequestParam("num2")  int num2){
            return calculatorService.sum(num1,num2);
        }
        @GetMapping(path = "/minus")
        public String minus(@RequestParam("num1") int num1,@RequestParam("num2")  int num2){
            return calculatorService.minus(num1,num2);
        }
        @GetMapping(path = "/multiply")
        public String multiply(@RequestParam("num1") int num1,@RequestParam("num2")  int num2){
            return calculatorService.multiply(num1,num2);
        }
        @GetMapping(path = "/divide")
        public String divide(@RequestParam("num1") int num1,@RequestParam("num2")  int num2){
            return calculatorService.divide(num1,num2);
        }
    }

}
