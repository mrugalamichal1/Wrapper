/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maslo orzechowe
 */
public class myException extends Exception {

    /**
     * Creates a new instance of <code>myException</code> without detail
     * message.
     */
    public myException() {
    }

    /**
     * Constructs an instance of <code>myException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public myException(String msg) {
        super(msg);
    }
}
