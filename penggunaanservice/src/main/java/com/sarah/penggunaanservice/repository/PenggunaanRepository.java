package com.raya.penggunaanservice.repository;

import com.raya.penggunaanservice.model.Penggunaan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenggunaanRepository extends JpaRepository<Penggunaan, Long> {
}