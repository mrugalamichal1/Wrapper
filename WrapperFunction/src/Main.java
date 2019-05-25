/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maslo orzechowe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws myException {
        // TODO code application logic here
        /*myList list=new myList();
        list.addLast(new Node("ala"));
        list.addLast(new Node("ma"));
        list.addLast(new Node("kota"));
        
        System.out.println(list.contains("kota"));
        System.out.print(list.howManyElements());*/
        myStack stack=new myStack();
        int n=21;
        while(n!=0){
            stack.push(new Node(n%2));
            n=n/2;
        }
        while(!stack.isEmpty()){
        System.out.print(stack.pop().getData());
        }
    }
    
}
