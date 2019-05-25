/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maslo orzechowe
 * @param <T>
 */
public class Node<T> {
    private T data;
    private Node previous;
    private Node next;
    
    public Node(T data){
        this.data=data;
        this.previous=this.next=null;
    }

    public Node(T data, Node previous, Node next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
    
    
    

    public T getData() {
        return data;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
