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
public interface List<T> {
    public void addFirst(Node node);
    public Node removeFirst() throws myException;
    public void addLast(Node node);
    public Node removeLast() throws myException;
    public boolean contains(T data);
    public boolean isEmpty();
    public int howManyElements() throws myException;
    public void readList() throws myException;
    
}
