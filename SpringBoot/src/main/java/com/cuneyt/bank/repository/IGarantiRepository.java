package com.cuneyt.bank.repository;

import com.cuneyt.bank.entity.GarantiBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IGarantiRepository extends JpaRepository<GarantiBank, Long> {
    String GET_TOTAL_MONEY = "SELECT toplam_para FROM garanti_bank where tc = :tc";

    @Query(value = GET_TOTAL_MONEY, nativeQuery = true)
    Object getTotalMoney(@Param("tc") Long tc);
}
