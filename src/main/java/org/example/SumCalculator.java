package org.example;

import java.util.List;

public class SumCalculator {


    public int getPositiveSum(List<Integer> nums) {
        return nums.stream()
                .filter(v -> v > 0)
                .reduce(0, Integer::sum);

    }

    public int getNegativeSum(List<Integer> nums) {
        return nums.stream()
                .filter(v -> v < 0)
                .reduce(0, Integer::sum);

    }
}
