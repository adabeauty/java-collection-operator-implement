package com.thoughtworks.collection;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CollectionOperatorTest {

    @Test
    public void should_return_list_by_Interval(){
        int right = 5;
        int left = 1;

        CollectionOperator collectionOperator = new CollectionOperator();

        int[] result = new int[]{1,2,3,4,5};
        assertThat(collectionOperator.getListByInterval(left, right)).isEqualTo(result);

        int[] inverseResult = new int[]{5,4,3,2,1};
        assertThat(collectionOperator.getListByInterval(right, left)).isEqualTo(inverseResult);

        assertThat(collectionOperator.getListByInterval(1, 1).length).isEqualTo(1);
        assertThat(collectionOperator.getListByInterval(1, 1)[0]).isEqualTo(1);
    }

    @Test
    public void should_return_list_by__two_Intervals(){
        int right = 10;
        int left = 1;

        CollectionOperator collectionOperator = new CollectionOperator();

        int[] result = new int[]{2,4,6,8,10};
        assertThat(collectionOperator.getListByTwoIntervals(left, right)).isEqualTo(result);

        int[] inverseResult = new int[]{10,8,6,4,2};
        assertThat(collectionOperator.getListByInterval(right, left)).isEqualTo(inverseResult);

        assertThat(collectionOperator.getListByInterval(1,1).length).isEqualTo(0);

        assertThat(collectionOperator.getListByInterval(6,6)[0]).isEqualTo(6);
    }

    @Test
    public void should_return_letter_list_by__Interval(){
        int right = 5;
        int left = 1;

        CollectionOperator collectionOperator = new CollectionOperator();

        String[] result = new String[]{"a", "b", "c", "d", "e"};
        assertThat(collectionOperator.getLetterListByInterval(left, right)).isEqualTo(result);
    }

    @Test
    public void should_return_loop_letter_list_by__Interval(){
        int right = 53;
        int left = 20;

        CollectionOperator collectionOperator = new CollectionOperator();

        assertThat(collectionOperator.getLoopLetterListByInterval(left, right).length).isEqualTo(34);
        assertThat(collectionOperator.getLoopLetterListByInterval(left, right)[6]).isEqualTo("z");
        assertThat(collectionOperator.getLoopLetterListByInterval(left, right)[8]).isEqualTo("ab");
        assertThat(collectionOperator.getLoopLetterListByInterval(left, right)[33]).isEqualTo("ba");
    }

    @Test
    public void should_pop_even_elements(){
        int[] array = new int[]{1,2,3,4,5};
        int[] result  = new int[] {2,4};

        CollectionOperator collectionOperator = new CollectionOperator();

        assertThat(collectionOperator.popEvenElments(array)).isEqualTo(result);
    }

    @Test
    public void should_pop_last_element(){
        int[] array = new int[]{1,2,3,4,5};

        CollectionOperator collectionOperator = new CollectionOperator();

        assertThat(collectionOperator.popLastElment(array)).isEqualTo(5);
    }

    @Test
    public void should_pop_common_elements(){
        int[] firstArray = new int[]{1,2,4,6,10};
        int[] secondArray = new int[]{3,2,6,10,8};
        int[] result = new int[]{2,6,10};

        CollectionOperator collectionOperator = new CollectionOperator();
        assertThat(collectionOperator.popCommonElement(firstArray, secondArray)).isEqualTo(result);
    }

    @Test
    public void should_add_uncommon_elements_to_first_array(){
        int[] firstArray = new int[]{1,2,4,6,10};
        int[] secondArray = new int[]{3,2,6,10,8};
        int[] result = new int[]{1,2,4,6,10,3,8};

        CollectionOperator collectionOperator = new CollectionOperator();
        assertThat(collectionOperator.addUncommonElement(firstArray, secondArray).length).isEqualTo(7);
        assertThat(collectionOperator.addUncommonElement(firstArray, secondArray)).isEqualTo(result);
    }
}
