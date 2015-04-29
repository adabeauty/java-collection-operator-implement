package com.thoughtworks.collection;

import java.util.List;
import java.util.Random;

/**
 * Created by hgwang on 4/28/15.
 */
public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        throw new NegativeArraySizeException();
    }
}
