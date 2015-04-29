package com.thoughtworks.collection;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FlatenTest {

    @Test
    public void can_transform_two_dimensional_array_to_one(){
        Integer[][] array = {{1}, {2}, {3,4}};
        Integer[] result = {1,2,3,4};

        Flaten flaten = new Flaten(array);

        assertThat(flaten.transformToOneDimesional()).isEqualTo(result);
    }

    @Test
    public void can_transform_two_dimensional_array_to_one_and_delete_repeated(){
        Integer[][] array = {{1,2,3}, {5,2,1,4}, {2,1}};
        Integer[] result = {1,2,3,5,4};

        Flaten flaten = new Flaten(array);
        assertThat(flaten.transformToUnrepeatedOneDimesional()).isEqualTo(result);
    }
}