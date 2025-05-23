/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.devops.musica.api.exception;

/**
 *
 * @author adriano
 */
public class MusicaAlreadyExistsException extends Exception {

    /**
     * Creates a new instance of <code>MusicaAlreadyExistsExceptioin</code>
     * without detail message.
     */
    public MusicaAlreadyExistsException() {
    }

    /**
     * Constructs an instance of <code>MusicaAlreadyExistsExceptioin</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public MusicaAlreadyExistsException(String msg) {
        super(msg);
    }
}
