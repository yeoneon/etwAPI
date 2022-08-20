package com.etw.etwapi.model;

import com.etw.etwapi.dto.response.FoodDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int pickCount;
    private String imgPath;

    public Food addPickCount(){
        this.pickCount++;
        return this;
    }

    public FoodDto toFoodDto(){
        return FoodDto
                .builder()
                .id(id)
                .imgPath(imgPath)
                .pickCount(pickCount)
                .name(name)
                .build();
    }
}
