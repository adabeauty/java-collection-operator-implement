package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        throw new NotImplementedException();
    }

    public List<Integer> getUncommonElements(List<Integer> firstList, List<Integer> secondList) {
        throw new NotImplementedException();
    }

    public Map<Integer, Integer> getMapOfArrayList() {
        throw new NotImplementedException();
    }

    public Integer[][] getDividedArray() {
        return null;
    }

    public List<Integer> getElementsByRelationship(FilterHandler filterHandler, List<Integer> objectList) {
        throw new NotImplementedException();
    }
}