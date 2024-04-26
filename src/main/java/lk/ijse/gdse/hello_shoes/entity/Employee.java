package lk.ijse.gdse.hello_shoes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Employee {
    private String emp_code;
    private String emp_name;
    @Column(columnDefinition = "LONGTEXT")
    private String emp_pro_pic;
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
