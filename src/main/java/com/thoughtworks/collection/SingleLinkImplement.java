package com.thoughtworks.collection;

public class SingleLinkImplement <T> implements SingleLink<T> {

    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> header, tail;
    private int size = 0;

    @Override
    public T getHeaderData() {
        return header.data;
    }

    @Override
    public T getTailData() {
        return tail.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addHeadPointer(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = header;
        header = newNode;
        size += 1;
        if(tail == null){
            tail = header;
        }
    }

    @Override
    public void addTailPointer(T item) {

        if(!isEmpty()){
            tail.next = new Node<>(item);
            tail = tail.next;
        }else{
            tail = header = new Node<>(item);
        }
        size += 1;
    }

    @Override
    public boolean deleteFirst() {

        if(!isEmpty()){
            header = header.next;
            size -= 1;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }else{
            Node<T> current = header;
            Node<T> pre = null;

            while (current.next != null) {

                pre = current;
                current = current.next;
            }

            pre.next = null;
            tail = pre;
            size -= 1;

            return true;
        }
    }

    @Override
    public T getNode(int index) {
        Node<T> current = header;
        for(int i=1; i<index; i++){
            current = current.next;
        }
        return current.data;
    }
}
