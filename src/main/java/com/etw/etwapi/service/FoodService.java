package com.etw.etwapi.service;

import com.etw.etwapi.dto.ResponseMap;
import com.etw.etwapi.model.Food;
import com.etw.etwapi.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;
    public final ResponseMap<Food> pickFood(Long id){
        Optional<Food> optional = foodRepository.findById(id);

        optional.ifPresent(food -> {
            food.setPickCount(food.getPickCount()+1);
            foodRepository.save(food);
        });

        return ResponseMap.<Food>builder()
                .code(200)
                .message("Success")
                .data(null)
                .build();
    };


    /**
     * 이미지 리스트 보내기
     * TODO : 현재는 이미지 6개 뿐이라서
     * 16,32,64 나눠야 한다.
     */
    public List<Food> foodImgList() {
        return  foodRepository.findAll();
    }
}
