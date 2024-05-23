package lk.ijse.gdse.hello_shoes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sale")
@RequiredArgsConstructor
public class SaleController {
    @GetMapping("/health")
    public String health(){
        return "OK";
    }
}
