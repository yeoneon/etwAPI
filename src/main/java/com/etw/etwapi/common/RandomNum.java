package com.etw.etwapi.common;

import java.util.*;

public class RandomNum {

    public static Set<Integer> getRandomSet(int size, int foodSize){
        Set<Integer> randomSet = new HashSet<>();
        Random random = new Random();

        while(randomSet.size() != size){
            randomSet.add(random.nextInt(foodSize)+1);
        }

        return randomSet;
    }
}
