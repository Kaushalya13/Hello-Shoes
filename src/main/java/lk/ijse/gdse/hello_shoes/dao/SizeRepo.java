package lk.ijse.gdse.hello_shoes.dao;

import lk.ijse.gdse.hello_shoes.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepo extends JpaRepository<Size,String > {
}
