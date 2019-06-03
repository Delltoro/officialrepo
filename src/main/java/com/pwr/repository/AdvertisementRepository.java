package com.pwr.repository;

import com.pwr.model.Advertisement;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement,Long> {

    @Query(value = "SELECT * FROM Advertisement WHERE discipline = 1 ;", nativeQuery = true)
    List<Advertisement> findAllInTableTennis();
}
