package com.etw.etwapi.api;

import com.etw.etwapi.dto.request.FoodImgDto;
import com.etw.etwapi.model.FoodImg;
import com.etw.etwapi.service.FoodImgService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class FoodListApi {
    private final FoodImgService foodImgService;

    @GetMapping("/foodimg")
    public List<FoodImg> foodImgListApi() {
        return foodImgService.getFoodImgList();
    }

    @GetMapping("/test")
    public FoodImgDto foodImgDtoApi() {
        return FoodImgDto.builder()
                .name("bulgogi")
                .path("/image/bulgogi.png")
                .build();
    }
}
