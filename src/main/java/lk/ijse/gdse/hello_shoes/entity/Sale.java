package lk.ijse.gdse.hello_shoes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "sale")
public class Sale implements SuperEntity{
    @Id
    private String order_id;
    private String cus_name;
    private double total_price;
    private Timestamp purchase_date;
    private String payment_method;
    private double added_points;
    private String cashier_name;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "cus_code")
    private Customer customer;

}
