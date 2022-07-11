package com.etw.etwapi.service;

import com.etw.etwapi.dto.ResponseMap;
import com.etw.etwapi.dto.response.FoodDto;
import com.etw.etwapi.model.Food;
import com.etw.etwapi.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodService implements IdealWorldCup {

    private final FoodRepository foodRepository;

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
    public ResponseMap<List<FoodDto>> getFoodImgList(int size) {

        List<Food> foods;
        List<FoodDto> foodsDtoList;
        List<Integer> rList = getRandomList(size);
        try {
            foods = foodRepository.findAll();
            foodsDtoList = new ArrayList<>();

            foods.stream().filter(food -> rList.contains(food.getId().intValue()))
                    .forEach(food -> {
                        FoodDto foodDto = FoodDto.builder()
                                .id(food.getId())
                                .name(food.getName())
                                .imgPath(food.getImgPath())
                                .pickCount(food.getPickCount())
                                .build();
                        foodsDtoList.add(foodDto);
                    });
        } catch (Exception e) {
            return ResponseMap.<List<FoodDto>>builder()
                    .code(500)
                    .message(e.getMessage())
                    .data(null)
                    .build();
        }
        return ResponseMap.<List<FoodDto>>builder()
                .code(200)
                .message("SUCCESS")
                .data(foodsDtoList)
                .build();
    }
}
