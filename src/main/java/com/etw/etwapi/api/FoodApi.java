package com.etw.etwapi.api;

import com.etw.etwapi.dto.ResponseMap;
import com.etw.etwapi.dto.response.FoodDto;
import com.etw.etwapi.model.Food;
import com.etw.etwapi.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/food")
public class FoodApi {

    private final FoodService foodService;

    @PutMapping("")
    public ResponseMap<Food> update(@RequestParam("id") Long id){
        return foodService.pickFood(id);
    }

    @GetMapping("")
    public ResponseMap<List<FoodDto>> foodImgListApi() {
        return foodService.getFoodImgList();
    }
}
