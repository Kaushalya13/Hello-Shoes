package lk.ijse.gdse.hello_shoes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer implements SuperEntity{
    @Id
    private String cus_code;
    private String cus_name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date join_date_as_a_loyalty_customer;
    @Enumerated(EnumType.STRING)
    private Level level;
    private int total_points;
    private Date dob;
    private String address_line_01;
    private String address_line_02;
    private String address_line_03;
    private String address_line_04;
    private String address_line_05;
    private String contact_no;
    @Column(unique = true)
    private String email;
    private Timestamp recent_purchase_date_and_time;
}
