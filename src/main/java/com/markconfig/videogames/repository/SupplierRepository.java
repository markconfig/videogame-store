package com.markconfig.videogames.repository;

import com.markconfig.videogames.domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    @Query("from Supplier s order by s.name")
    List<Supplier> findAllOrderByName();
}
