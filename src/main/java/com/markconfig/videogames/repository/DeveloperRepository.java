package com.markconfig.videogames.repository;

import com.markconfig.videogames.domain.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer> {

    @Query("from Developer v order by v.name")
    List<Developer> findAllOrderbyName();
}
