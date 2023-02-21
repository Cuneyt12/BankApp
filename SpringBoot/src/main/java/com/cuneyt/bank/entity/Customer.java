package com.cuneyt.bank.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "tc_no")
    private long tc;
    private String ad;
    private String soyAd;
    @Transient
    private float miktar;
    @Column(name = "toplam_para")
    private float toplamPara;
}
