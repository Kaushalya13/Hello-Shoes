package lk.ijse.gdse.hello_shoes.util;

import lk.ijse.gdse.hello_shoes.dto.*;
import lk.ijse.gdse.hello_shoes.entity.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {
    private  final ModelMapper mapper;
    public Mapping(ModelMapper mapper){
        this.mapper = mapper;
    }


    // -----------  user mapping  -------------

    public UserDTO toUserDto(User user){
        user.setPassword(null);
        return mapper.map(user,UserDTO.class);
    }

    public User toUserEntity(UserDTO userDTO){
        return mapper.map(userDTO, User.class);
    }

    // -----------  employee mapping  -------------

    public EmployeeDTO toEmployeeDTO(Employee employee){
        return mapper.map(employee, EmployeeDTO.class);
    }
    public Employee toEmployeeEntity(EmployeeDTO employeeDTO){
        return mapper.map(employeeDTO, Employee.class);
    }

    public List<EmployeeDTO> toEmployeeList(List<Employee> employees){
        return mapper.map(employees,List.class);
    }

    // -----------  customer mapping  -------------

    public CustomerDTO toCustomerDto(Customer customer){
        return mapper.map(customer,CustomerDTO.class);
    }

    public Customer toCustomerEntity(CustomerDTO customerDTO){
        return mapper.map(customerDTO,Customer.class);
    }

    public List<CustomerDTO> toCustomerList(List<Customer> customers){
        return mapper.map(customers,List.class);
    }

    // -----------  supplier mapping  -------------

    public SupplierDTO toSupplierDto(Supplier supplier){
        return mapper.map(supplier,SupplierDTO.class);
    }

    public Supplier toSupplierEntity(SupplierDTO supplierDTO){
        return mapper.map(supplierDTO,Supplier.class);
    }

    public List<SupplierDTO> toSupplierList(List<Supplier> suppliers){
        return mapper.map(suppliers,List.class);
    }


    // -----------  Inventory mapping  -------------

    public InventoryDTO toInventoryDto(Inventory inventory){
        return mapper.map(inventory,InventoryDTO.class);
    }

    public Inventory toInventoryEntity(InventoryDTO inventoryDTO){
        return mapper.map(inventoryDTO,Inventory.class);
    }

    public List<InventoryDTO> toInventoryList(List<Inventory> inventories){
        return mapper.map(inventories,List.class);
    }
}
