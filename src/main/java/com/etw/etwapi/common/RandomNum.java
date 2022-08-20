package com.etw.etwapi.common;

import java.util.*;

public class RandomNum {

    public static Set<Long> getRandomSet(int size, int foodSize){
        Set<Long> randomSet = new HashSet<>();
        Random random = new Random();

        while(randomSet.size() != size){
            randomSet.add((long) (random.nextInt(foodSize)+1));
        }

        return randomSet;
    }
}
