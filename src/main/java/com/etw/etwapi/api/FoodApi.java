package com.etw.etwapi.api;

import com.etw.etwapi.common.CustomException;
import com.etw.etwapi.dto.ResponseMap;
import com.etw.etwapi.dto.response.FoodDto;
import com.etw.etwapi.enums.CommonEnum;
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
    public ResponseMap<FoodDto> update(@RequestParam("id") Long id) throws CustomException {
        return ResponseMap.<FoodDto>builder()
                .code(CommonEnum.SUCCESS.getCode())
                .message(CommonEnum.SUCCESS.getMessage())
                .data(foodService.updatePickCount(id))
                .build();
    }

    @GetMapping("/{size}")
    public ResponseMap<List<FoodDto>> getFoodImgListApi(@PathVariable(value = "size") int size) throws Exception {
        return ResponseMap.<List<FoodDto>>builder()
                .code(CommonEnum.SUCCESS.getCode())
                .message(CommonEnum.SUCCESS.getMessage())
                .data(foodService.getFoodImgList(size))
                .build();
    }
}
