package com.study.kokkokapi.persistence.repository;

import com.study.kokkokapi.persistence.entity.AreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AreaRepository extends JpaRepository<AreaEntity, String> {
    @Query(nativeQuery = true, value = "select * from area limit 1")
    List<AreaEntity> findFirst();
}
