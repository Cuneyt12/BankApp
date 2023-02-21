package com.cuneyt.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "id")
    private long id;
    private String ad;
    private String soyAd;
    private float toplamPara;
}
