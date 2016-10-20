package Excepciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EquipoException extends Exception {

    /**
     * Creates a new instance of <code>EquipoException</code> without detail
     * message.
     */
    public EquipoException() {
    }

    /**
     * Constructs an instance of <code>EquipoException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EquipoException(String msg) {
        super(msg);
    }
}
