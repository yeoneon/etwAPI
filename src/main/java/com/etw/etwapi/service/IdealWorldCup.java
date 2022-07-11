package com.etw.etwapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface IdealWorldCup {
    default List<Integer> getRandomList(int size){
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int ran = random.nextInt(31)+1;
            while(randomList.contains(ran)){
                ran = random.nextInt(31)+1;
            }
            randomList.add(ran);
        }
        return randomList;
    }
}
