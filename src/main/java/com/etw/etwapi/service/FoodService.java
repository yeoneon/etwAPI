package com.etw.etwapi.service;

import com.etw.etwapi.common.CustomException;
import com.etw.etwapi.common.RandomNum;
import com.etw.etwapi.dto.response.FoodDto;
import com.etw.etwapi.enums.FoodEnum;
import com.etw.etwapi.model.Food;
import com.etw.etwapi.repository.FoodQuerydslRepository;
import com.etw.etwapi.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;
    private final FoodQuerydslRepository foodQuerydslRepository;

    public FoodDto updatePickCount(Long id) throws CustomException {
        Food food = getFood(id)
                .addPickCount();

        return foodRepository.save(food).toFoodDto();
    }
    /**
     * 이미지 리스트 보내기
     * 현재 16,32 나눠야 한다.
     */
    public List<FoodDto> getFoodImgList(int size) throws CustomException {
        int foodTotalSize = getFoodTotalSize(size);

        Set<Long> randomSet = RandomNum.getRandomSet(size, foodTotalSize);

        return randomFoodList(randomSet);
    }
    private int getFoodTotalSize(int size) throws CustomException{
        int foodTotalSize = foodRepository.findAll().size();

        if(foodTotalSize == 0){
            throw new CustomException(FoodEnum.MSG_ERR_FAIL_GET_FOOD_INFO.getMsg());
        }

        if(isNotCorrectSize(foodTotalSize, size)){
            throw new CustomException(FoodEnum.MSG_ERR_IS_NOT_CORRECT_SIZE.getMsg());
        }

        return foodTotalSize;
    }
    private List<FoodDto> randomFoodList(Set<Long> randomSet) {
        return foodQuerydslRepository.findAllById(randomSet).stream()
                .map(food -> food.toFoodDto())
                .collect(Collectors.toList());
    }

    private Food getFood(Long id) throws CustomException{
        return foodRepository.findById(id)
                .orElseThrow(()-> new CustomException(FoodEnum.MSG_ERR_FAIL_GET_FOOD_INFO.getMsg()));
    }
    private boolean isNotCorrectSize(int foodSize, int matchSize) {
        return foodSize < matchSize;
    }
}
