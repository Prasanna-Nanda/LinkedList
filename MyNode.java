package MyNodeTest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyNode<T> {
    @Test
    public void  givenThreeNumbersShouldPassedLinkedListTest()
    {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result=myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        assertTrue(result);
    }

    public MyNode(int i) {
    }

    public void setNext(MyNode<T> mySecondNode) {
    }

    public Object getNext() {
        return null;
    }
}
