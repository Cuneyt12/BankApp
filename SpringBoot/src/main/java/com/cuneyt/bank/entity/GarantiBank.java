package com.cuneyt.bank.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Table(name = "garanti_bank")
public class GarantiBank implements BaseEntity{
    @Id
    private long tc;
    private String ad;
    private String soyAd;
    @Transient
    private float miktar;
    private float toplamPara;
}
