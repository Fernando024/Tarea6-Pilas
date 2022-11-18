/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;

/**
 *
 * @author MargaritaT
 */
public interface Pila {
    void push(int dato);
    void pop();
    int length();
    boolean empty();
    int peek();
}
