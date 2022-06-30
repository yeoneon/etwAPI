package com.etw.etwapi.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/food/")
public class FoodApi {

    @GetMapping("")
    public String getFood(){
        return "";
    }
}
