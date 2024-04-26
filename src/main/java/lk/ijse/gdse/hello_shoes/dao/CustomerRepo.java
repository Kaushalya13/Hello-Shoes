package lk.ijse.gdse.hello_shoes.dao;

import lk.ijse.gdse.hello_shoes.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {
}
