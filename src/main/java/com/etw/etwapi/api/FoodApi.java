package com.etw.etwapi.api;

import com.etw.etwapi.dto.ResponseMap;
import com.etw.etwapi.dto.request.FoodPickDto;
import com.etw.etwapi.model.Food;
import com.etw.etwapi.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseMap<Food> update(@RequestParam("id") Long id){
        return foodService.pickFood(id);
    }

    @GetMapping("/imgs")
    public List<Food> foodImgListApi() {
        return foodService.foodImgList();
    }
}
