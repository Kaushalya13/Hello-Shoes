package lk.ijse.gdse.hello_shoes.dto;

import lk.ijse.gdse.hello_shoes.entity.Gender;
import lk.ijse.gdse.hello_shoes.entity.Level;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerDTO {
    private String cus_code;
    private String cus_name;
    private Gender gender;
    private Date join_date_as_a_loyalty_customer;
    private Level level;
    private int total_points;
    private Date dob;
    private String address_line_01;
    private String address_line_02;
    private String address_line_03;
    private String address_line_04;
    private String address_line_05;
    private String contact_no;
    private String email;
    private Timestamp recent_purchase_date_and_time;
}
