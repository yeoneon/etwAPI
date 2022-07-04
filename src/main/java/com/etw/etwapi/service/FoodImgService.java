package com.etw.etwapi.service;

import com.etw.etwapi.model.FoodImg;
import com.etw.etwapi.repository.FoodImgRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodImgService {

    private final FoodImgRepository foodImgRepository;

    /**
     * 이미지 리스트 보내기
     * TODO : 현재는 이미지 6개 뿐이라서
     */
    public List<FoodImg> getFoodImgList() {
        List<FoodImg> foodImgList = new ArrayList<FoodImg>();
        for(int i = 0; i< 6; i++){
            foodImgList.add(foodImgRepository.findById(Long.valueOf(i)).get());
        }
        return foodImgList;
    }

}
