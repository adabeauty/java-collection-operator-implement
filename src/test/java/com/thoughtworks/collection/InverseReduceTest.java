package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InverseReduceTest {

    @Test
    public void should_be_divided_to_smaller_number(){

        Random random = mock(Random.class);
        when(random.nextInt(3)).thenReturn(2);

        InverseReduce inverseReduce = new InverseReduce(random);

        Integer[] result = new Integer[]{9,7,5,3,1};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(inverseReduce.divideToSmaller(9)).isEqualTo(resultList);
    }
}
