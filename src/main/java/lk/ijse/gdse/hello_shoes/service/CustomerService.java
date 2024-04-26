package lk.ijse.gdse.hello_shoes.service;

import lk.ijse.gdse.hello_shoes.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    boolean updateCustomer(String id,CustomerDTO customerDTO);
    boolean deleteCustomer(String id);
    List<CustomerDTO> getAllCustomer();

}
