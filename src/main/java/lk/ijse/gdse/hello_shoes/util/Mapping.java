package lk.ijse.gdse.hello_shoes.util;

import lk.ijse.gdse.hello_shoes.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoes.dto.SupplierDTO;
import lk.ijse.gdse.hello_shoes.dto.UserDTO;
import lk.ijse.gdse.hello_shoes.entity.Customer;
import lk.ijse.gdse.hello_shoes.entity.Supplier;
import lk.ijse.gdse.hello_shoes.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapping {
    private  final ModelMapper mapper;
    public Mapping(ModelMapper mapper){
        this.mapper = mapper;
    }


    // -----------  user mapping  -------------

    public UserDTO toUserDto(User user){
        return mapper.map(user,UserDTO.class);
    }

    public User toUserEntity(UserDTO userDTO){
        return mapper.map(userDTO, User.class);
    }


    // -----------  customer mapping  -------------

    public CustomerDTO toCustomerDto(Customer customer){
        return mapper.map(customer,CustomerDTO.class);
    }

    public Customer toCustomerEntity(CustomerDTO customerDTO){
        return mapper.map(customerDTO,Customer.class);
    }

    // -----------  supplier mapping  -------------

    public SupplierDTO toSupplierDto(Supplier supplier){
        return mapper.map(supplier,SupplierDTO.class);
    }

    public Supplier toSupplierEntity(SupplierDTO supplierDTO){
        return mapper.map(supplierDTO,Supplier.class);
    }
}
