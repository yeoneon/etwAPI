package com.etw.etwapi.repository;

import com.etw.etwapi.model.FoodImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodImgRepository extends JpaRepository<FoodImg, Long> {
}
