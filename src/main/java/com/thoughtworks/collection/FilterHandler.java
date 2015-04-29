package com.thoughtworks.collection;

/**
 * Created by hgwang on 4/29/15.
 */
public interface FilterHandler<T> {
    public boolean apply(T t);
}
