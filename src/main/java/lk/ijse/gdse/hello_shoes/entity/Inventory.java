package lk.ijse.gdse.hello_shoes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "inventory")
public class Inventory implements SuperEntity{
    @Id
    private String item_code;
    private String item_des;
    private int item_qty;
    @Column(columnDefinition = "LONGTEXT")
    private String item_pic;
    private String category;
    @Enumerated(EnumType.STRING)
    private GenderType genderType;
    private String occasion;


    @OneToMany(mappedBy = "inventory")
    private Set<SalesDetails> saleDetails = new HashSet<>();

}
