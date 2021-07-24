package com.ims.springjwt.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String itemCode;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "CategoryId", referencedColumnName = "id")
    private Category category;
}
