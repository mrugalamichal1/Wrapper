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
public class myList<T> implements List<T> {
    private Node head;
    private Node tail;

    public myList() {
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
   
    
    
    @Override
    public void addFirst(Node node) {
        if(this.isEmpty())
            this.head=this.tail=node;
        else{
            Node temp=this.head;
            this.head=node;
            this.head.setNext(temp);
            temp.setPrevious(this.head);
        }     
    }

    @Override
    public Node removeFirst() throws myException {
        if(this.isEmpty())
            throw new myException("List is empty!");
        Node temp=this.head;
        this.head=this.head.getNext();
        return temp;
        
    }

    @Override
    public void addLast(Node node) {
        if(this.isEmpty())
        {
            this.head=this.tail=node;
        }
        else{
            Node temp=this.tail;
            this.tail=node;
            temp.setNext(node);
            this.tail.setPrevious(temp); 
        }
    }

    @Override
    public Node removeLast() throws myException {
        if(this.isEmpty())
            throw new myException("List is empty!");
        Node temp=this.tail;
        this.tail=this.tail.getPrevious();
        return temp;
    }

    @Override
    public boolean contains(T data) {
        boolean contains=false;
        Node temp=this.head;
        while(temp!=this.tail){
            if(temp.getData()==data)
                contains=true;
            temp=temp.getNext();
        }
        if(temp.getData()==data)
                contains=true;
        return contains;
    }


    @Override
    public boolean isEmpty() {
        return ((this.head==null)&&(this.tail==null));
    }

    @Override
    public int howManyElements() {
        int howMany=0;
        Node temp=this.head;
        while(temp!=this.tail){
            howMany++;
            temp=temp.getNext();
        }
        return ++howMany;
    }

    @Override
    public void readList() throws myException {
        if(this.isEmpty())
            throw new myException("List empty");
        Node temp=this.head;
        while(temp!=this.tail){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.print(temp.getData());
    }
    
}
