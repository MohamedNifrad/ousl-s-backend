package com.ims.springjwt.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class StyleMaster {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long idMy;
    private String itemCode;
    private String styleCode;
    private String styleName;
    private int quantity;
    private String status;
    private String type;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "CategoryId", referencedColumnName = "id")
    private Category category;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "ItemId", referencedColumnName = "id")
    private Item item;

    private double consumption;
}
