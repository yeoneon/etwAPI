package com.etw.etwapi.common;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RamdomNum {

    public List<Long> getRandomList(Long size){
        List<Long> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            Long ran = random.nextLong(31)+1;
            while(randomList.contains(ran)){
                ran = random.nextLong(31)+1;
            }
            randomList.add(ran);
        }
        return randomList;
    }
}
