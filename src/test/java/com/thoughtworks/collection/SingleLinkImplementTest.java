package com.thoughtworks.collection;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class SingleLinkImplementTest {

    @Test
    public void should_return_false_in_isEmpty(){
        SingleLink<Integer> singleLink = new SingleLinkImplement<>();

        assertThat(singleLink.isEmpty()).isEqualTo(true);
    }

    @Test
    public void should_add_header_pointer(){
        SingleLink<Integer> singleLink = new SingleLinkImplement<>();
        singleLink.addHeadPointer(1);
        singleLink.addHeadPointer(2);

        assertThat(singleLink.getHeaderData()).isEqualTo(2);
    }

    @Test
    public void should_add_tail_pointer(){
        SingleLink<Integer> singleLink = new SingleLinkImplement<>();

        singleLink.addTailPointer(1);
        assertThat(singleLink.getTailData()).isEqualTo(1);

        singleLink.addTailPointer(3);
        assertThat(singleLink.getTailData()).isEqualTo(3);
    }

    @Test
    public void should_return_delete_first(){
        SingleLink<Integer> singleLink = new SingleLinkImplement<>();

        singleLink.addTailPointer(1);
        singleLink.addTailPointer(2);

        singleLink.deleteFirst();
        assertThat(singleLink.getHeaderData()).isEqualTo(2);
    }

    @Test
    public void should_return_delete_last(){
        SingleLink<Integer> singleLink = new SingleLinkImplement<>();

        singleLink.addTailPointer(1);
        singleLink.addTailPointer(2);
        singleLink.addTailPointer(3);

        assertThat(singleLink.deleteLast()).isEqualTo(true);
        assertThat(singleLink.getTailData()).isEqualTo(2);
    }

    @Test
    public void should_get_node_by_index(){
        SingleLink<Integer> singleLink = new SingleLinkImplement<>();

        singleLink.addTailPointer(1);
        singleLink.addTailPointer(2);
        singleLink.addTailPointer(3);

        assertThat(singleLink.getNode(2)).isEqualTo(2);
    }
}
