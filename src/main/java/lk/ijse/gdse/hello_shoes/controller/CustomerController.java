package lk.ijse.gdse.hello_shoes.controller;

import lk.ijse.gdse.hello_shoes.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoes.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/health")
    public String healthCheck(){
        System.out.println("Customer Health Test");
        return "Customer Health Test";
    }

    @PostMapping("/save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerDTO.setCus_code(UUID.randomUUID().toString());
        return customerService.saveCustomer(customerDTO);
    }

    @PutMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.updateCustomer(customerDTO.getCus_code(),customerDTO);
    }

    @DeleteMapping("/delete")
    public boolean deleteCustomer(@RequestPart("id") String id){
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/getAllCus")
    public List<CustomerDTO> getAllCustomer(){
        return customerService.getAllCustomer();
    }
}

