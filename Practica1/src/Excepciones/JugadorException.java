/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Ventura
 */
public class JugadorException extends Exception {

    /**
     * Creates a new instance of <code>JugadorException</code> without detail
     * message.
     */
    public JugadorException() {
    }

    /**
     * Constructs an instance of <code>JugadorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public JugadorException(String msg) {
        super(msg);
    }
}
