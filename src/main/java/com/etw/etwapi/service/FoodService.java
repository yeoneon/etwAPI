package com.etw.etwapi.service;

import com.etw.etwapi.common.CustomException;
import com.etw.etwapi.common.RamdomNum;
import com.etw.etwapi.dto.ResponseMap;
import com.etw.etwapi.dto.response.FoodDto;
import com.etw.etwapi.model.Food;
import com.etw.etwapi.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;
    private final RamdomNum ramdomNum;


    public final ResponseMap<Food> pickFood(Long id) {
        Optional<Food> optional = foodRepository.findById(id);
        optional.ifPresent(food -> {
            food.setPickCount(food.getPickCount() + 1);
            foodRepository.save(food);
        });
        return ResponseMap.<Food>builder()
                .code(200)
                .message("Success")
                .data(null)
                .build();
    }

    /**
     * 이미지 리스트 보내기
     * 현재 16,32 나눠야 한다.
     */

    @AfterThrowing
    public ResponseMap<List<FoodDto>> getFoodImgList(Long size) throws Throwable {

        List<Food> foods = foodRepository.findAll();
        List<FoodDto> foodsDtoList = new ArrayList<>();
        List<Long> rList = ramdomNum.getRandomList(size);
        foods.stream().filter(food -> rList.contains(food.getId()))
                      .forEach(food ->foodsDtoList.add(new FoodDto(food)));

//
//        return ResponseMap.<List<FoodDto>>builder()
//                .code(500)
//                .message(e.getMessage())
//                .data(null)
//                .build();


        return ResponseMap.<List<FoodDto>>builder()
                .code(200)
                .message("SUCCESS")
                .data(foodsDtoList)
                .build();
    }
}
