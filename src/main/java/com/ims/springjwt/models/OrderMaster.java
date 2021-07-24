package com.ims.springjwt.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class OrderMaster {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String orderNo;
    private String description;
    private int orderQuantity;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "BuyerId", referencedColumnName = "id")
    private Buyer buyer;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "StyleMasterId", referencedColumnName = "id")
    private StyleMaster styleMaster;

}
