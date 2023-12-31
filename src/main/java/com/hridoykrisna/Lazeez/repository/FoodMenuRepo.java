package com.hridoykrisna.Lazeez.repository;

import com.hridoykrisna.Lazeez.model.FoodMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodMenuRepo extends JpaRepository<FoodMenu, Integer> {

//    List<FoodMenu> findAllByPriceNotNullAndOrderByCreatedAtDesc();

}
