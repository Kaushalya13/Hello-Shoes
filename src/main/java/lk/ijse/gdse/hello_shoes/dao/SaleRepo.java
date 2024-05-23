package lk.ijse.gdse.hello_shoes.dao;

import lk.ijse.gdse.hello_shoes.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo extends JpaRepository<Sale,String > {

}
