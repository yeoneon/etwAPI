package com.etw.etwapi.api;

import com.etw.etwapi.dto.ResponseMap;
import com.etw.etwapi.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/food")
public class FoodApi {

    private final FoodService foodService;

    @PutMapping("")
    public ResponseMap update(@RequestBody long id){
        return foodService.pickFood(id);
    }
}
