package com.thoughtworks.collection;

public interface SingleLink<T> {
    public boolean addLast(T item);          //在尾部添加元素
    public boolean deleteLast();                //删除尾部元素；
    public boolean addHeadPointer(T item);    //添加头指针
    public void addTailPointer(T item);         //添加尾指针
}
