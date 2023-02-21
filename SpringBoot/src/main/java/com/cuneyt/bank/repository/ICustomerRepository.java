package com.cuneyt.bank.repository;

import com.cuneyt.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    String GET_TOTAL_MONEY = "SELECT toplam_para FROM musteri";

    @Query(value = GET_TOTAL_MONEY, nativeQuery = true)
    Object getTotalMoney();
}
