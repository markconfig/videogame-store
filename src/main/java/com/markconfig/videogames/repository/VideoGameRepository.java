package com.markconfig.videogames.repository;

import com.markconfig.videogames.domain.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoGameRepository extends JpaRepository<Videogame, Integer> {
    //Query nativa
    //@Query(value = "select * from videogame order by name", nativeQuery = true)

    // Con JPQL
    //@Query("select v from Videogame v order by v.name") // Con select v
    @Query("from Videogame v order by v.name")
    List<Videogame> searchAll();

    @Query("from Videogame v where v.supplier.id = ?1 order by v.name")
    List<Videogame> findBySupplier(int supplierId);

    //    @Query("from Videogame v where v.name like %?1%")
    List<Videogame> findByNameContaining(String query);
}
