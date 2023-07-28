package com.onlineshop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    private String customerName;
    private String address;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Countries.class)
    @JoinColumn(name = "countryId", nullable = false)
    private Countries country;
}
