package com.hridoykrisna.Lazeez.service.impl;

import com.hridoykrisna.Lazeez.Utils.CommonUtils;
import com.hridoykrisna.Lazeez.model.FoodMenu;
import com.hridoykrisna.Lazeez.repository.FoodMenuRepo;
import com.hridoykrisna.Lazeez.service.FoodMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodMenuIMPL implements FoodMenuService {
    private final FoodMenuRepo foodMenuRepo;
    @Override
    public void addFood(FoodMenu foodMenu) {
        foodMenu.setCreatedBy(CommonUtils.employee.getCreatedBy());
        foodMenu.setStatus(1);
        foodMenuRepo.save(foodMenu);
    }

    @Override
    public List<FoodMenu> getFoodMenuList() {
        System.out.println(foodMenuRepo.findAll());
        return foodMenuRepo.findAll();
    }
}
