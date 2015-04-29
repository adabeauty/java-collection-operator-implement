package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FilterTest {

    @Test
    public void should_return_even(){
        Integer[] array = new Integer[] {1,2,3,4,5};

        List<Integer> arrayList =  Arrays.asList(array);

        Filter filter = new Filter(arrayList);
        assertThat(filter.filterEven().size()).isEqualTo(2);
    }

    @Test
    public void should_return_multiple_of_three(){
        Integer[] array = new Integer[] {6,2,3,4,9};

        List<Integer> arrayList =  Arrays.asList(array);

        Filter filter = new Filter(arrayList);
        assertThat(filter.filterMultipleOfThree().size()).isEqualTo(3);
    }

    @Test
    public void should_return_different_elements_in_arrayList(){
        Integer[] array = new Integer[] {1,1,1,2,3};
        List<Integer> arrayList = Arrays.asList(array);

        Integer[] result = new Integer[] {1,2,3};
        List<Integer> resultList = Arrays.asList(result);

        Filter filter = new Filter(arrayList);
        assertThat(filter.getDifferentElements()).isEqualTo(resultList);
    }

    @Test
    public void should_divide_array_and_return_number(){
        Integer[] array = new Integer[]{1,1,1,1,2,3,1,3,4,2,3,1,3,4,2};
        List<Integer> arrayList = Arrays.asList(array);

        Filter filter = new Filter(arrayList);

        assertThat(filter.getMapOfArrayList().get(1)).isEqualTo(6);
        assertThat(filter.getMapOfArrayList().get(3)).isEqualTo(4);
    }

    @Test
    public void should_return_divided_array(){
        Integer[] array = new Integer[]{1,1,1,1,2,3,1,3,4,2,3,1,3,4,2};
        List<Integer> arrayList = Arrays.asList(array);
        Integer[][] result = new Integer[][] {{1,1,1,1,1,1},{2,2,2},{3,3,3,3},{4,4}};

        Filter filter = new Filter(arrayList);

        assertThat(filter.getDividedArray()).isEqualTo(result);
    }

    @Test
    public void should_return_common_elements(){
        Integer[] array = new Integer[] {6,2,3,4,9};
        Integer[] array1 = new Integer[] {2,3,5,9,6};

        List<Integer> arrayList =  Arrays.asList(array);
        List<Integer> arrayList1 =  Arrays.asList(array1);

        Filter filter = new Filter(arrayList);
        assertThat(filter.getCommonElements(arrayList, arrayList1).size()).isEqualTo(4);
    }

    @Test
    public void should_return_uncommon_elements(){
        Integer[] array = new Integer[] {6,2,3,4,9};
        Integer[] array1 = new Integer[] {2,3,5,9,6};

        List<Integer> arrayList =  Arrays.asList(array);
        List<Integer> arrayList1 =  Arrays.asList(array1);

        Filter filter = new Filter(arrayList);
        assertThat(filter.getUncommonElements(arrayList, arrayList1).size()).isEqualTo(2);
    }

    @Test
    public void should_filter_elements_by_specify_relationship(){

        Integer[] array = new Integer[] {2,3};
        List<Integer> arrayList =  Arrays.asList(array);

        Filter filter = new Filter(arrayList);

        Integer[] objectArray = new Integer[]{1,2,3,4,5,6};
        List<Integer> objectList = Arrays.asList(objectArray);

        Integer[] result = new Integer[]{2,3,4,6};
        List<Integer> resultList = Arrays.asList(result);

        FilterHandler filterHandler = mock(FilterHandler.class);
        when(filterHandler.apply(any())).thenReturn(true, true, false, false, true);

        assertThat(filter.getElementsByRelationship(filterHandler, objectList)).isEqualTo(resultList);
    }
}

//class NewFilter<T> {
//    private List<T> items;
//
//    public NewFilter(List<T> items) {
//        this.items = items;
//    }
//
//    public List<T> filter(FilterHandler<T> handler){
//        List<T> result = new ArrayList<T>();
//        for(T item : items) {
//            if (handler.apply(item)) {
//                result.add(item);
//            }
//        }
//
//        return result;
//    }
//}
//
//interface FilterHandler<T>{
//    public boolean apply(T t);
//}