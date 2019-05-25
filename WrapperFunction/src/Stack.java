/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maslo orzechowe
 */
public interface Stack<T> {
    public void push(Node node);
    public Node pop() throws myException;
    public Node peek() throws myException;
    public boolean isEmpty();
    
    
    
}
