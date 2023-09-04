package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public String add(@RequestParam("value1") int value1, @RequestParam("value2") int value2) {
        return String.valueOf(value1 + value2);
    }

    @GetMapping("/double")
    public String add(@RequestParam("number") Integer number) {
        return String.valueOf(number+number);
    }
}
