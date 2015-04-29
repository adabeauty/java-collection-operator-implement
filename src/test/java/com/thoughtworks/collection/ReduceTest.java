package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;



public class ReduceTest {

    @Test
    public void should_get_the_sum_of_elements (){
        Integer[] array = new Integer[]{1,2,3,4,5};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getSum()).isEqualTo(15);
    }

    @Test
    public void should_get_maximum_of_list(){
        Integer[] array = new Integer[]{1,5,7,2,8,9,3,2};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getMaximum()).isEqualTo(9);
    }

    @Test
    public void should_get_minimum_of_list(){
        Integer[] array = new Integer[]{9,4,5,10,34,2,1,10,16};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getMaximum()).isEqualTo(1);
    }

    @Test
    public void should_get_average_of_list(){
        Integer[] array = new Integer[]{12,34,56,78,90,21};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getMinimum()).isEqualTo(48.5);
    }

    @Test
    public void should_get_element_in_middle_position_with_order_elements(){
        Integer[] array = new Integer[]{1,1,1,2,3};
        List<Integer> arrayList = Arrays.asList(array);
        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getOrderedMedian()).isEqualTo(1);


        Integer[] evenArray = new Integer[]{1,1,2,3};
        List<Integer> EvenArrayList = Arrays.asList(evenArray);
        Reduce evenReduce = new Reduce(EvenArrayList);

        assertThat(evenReduce.getOrderedMedian()).isEqualTo(1.5);
    }

    @Test
    public void should_get_element_in_middle_position_with__elements(){
        Integer[] array = new Integer[] {1,4,6,2,3,10,9,8,11,20,19,30};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getUnorderedMedian()).isEqualTo(8.5);
    }

    @Test
    public void should_get_element_in_middle_position_in_linkList(){
        Integer[] array = new Integer[] {1,4,6,2,3,10,9,8,11,2,19,30};
        List<Integer> arrayList = Arrays.asList(array);
//        Iterator<Integer> arrayIterator = arrayList.iterator();

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getMedianInLinkList()).isEqualTo(8.5);
    }
    @Test
    public void should_return_first_even_element(){
        Integer[] array = new Integer[] {1,11,27,20,4,9,15};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getFirstEven()).isEqualTo(20);
    }

    @Test
    public void should_return_index_of_first_even_element(){
        Integer[] array = new Integer[] {1,11,27,20,4,9,15,4,1,11};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getIndexOfFirstEven()).isEqualTo(4);
    }

    @Test
    public void should_return_last_even_element(){
        Integer[] array = new Integer[] {1,11,27,20,4,9,15};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getFirstEven()).isEqualTo(4);
    }

    @Test
    public void should_return_index_of_last_even_element(){
        Integer[] array = new Integer[] {1,4,27,20,4,9,15,4,1,11};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getIndexOfFirstEven()).isEqualTo(7);
    }

    @Test
    public void can_judge_whether_is_equal(){
        Integer[] array = new Integer[] {1,4,27,20,4,9,15,4,1,11};
        List<Integer> arrayList = Arrays.asList(array);

        Integer[] differentArray = new Integer[] {1,4,27,20,4,9,15,4,1,11};
        List<Integer> differentArrayList = Arrays.asList(differentArray);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.isEqual(arrayList)).isEqualTo(true);
        assertThat(reduce.isEqual(differentArrayList)).isEqualTo(false);
    }
}
