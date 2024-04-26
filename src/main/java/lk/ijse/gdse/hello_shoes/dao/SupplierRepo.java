package lk.ijse.gdse.hello_shoes.dao;

import lk.ijse.gdse.hello_shoes.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier,String> {
}
