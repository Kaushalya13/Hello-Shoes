package lk.ijse.gdse.hello_shoes.dao;

import lk.ijse.gdse.hello_shoes.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory,String> {
}
