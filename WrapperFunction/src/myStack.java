/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maslo orzechowe
 */
public class myStack<T> implements Stack<T> {
    private myList<T> elements;

    public myStack() {
        myList temp=new myList();
        this.elements=temp;
    }

    @Override
    public void push(Node node) {
       this.elements.addLast(node); 
    }

    @Override
    public Node pop() throws myException {
        return this.elements.removeLast();
    }

    @Override
    public boolean isEmpty() {
        return this.elements.getHead()==null||this.elements.getTail()==null;
    }

    @Override
    public Node peek() throws myException {
        return this.elements.getTail();
    }
    
}
