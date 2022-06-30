package com.etw.etwapi.api;

import com.etw.etwapi.dto.ResponseMap;
import com.etw.etwapi.dto.request.FoodPickDto;
import com.etw.etwapi.model.Food;
import com.etw.etwapi.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/food")
public class FoodApi {

    private final FoodService foodService;

    @GetMapping("")
    public String update(){
        return "test";
    }

    @PutMapping("")
    public ResponseMap<Food> update(@RequestBody FoodPickDto requestData){
        System.out.println("id : " + requestData.getId());
        return foodService.pickFood(requestData.getId());
    }
}
