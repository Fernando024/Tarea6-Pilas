/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;

/**
 *
 * @author MargaritaT
 */
public class PilaMetodos implements Pila{

   Nodo tope =null;
   int length=0;
   
    @Override
    public void push(int dato) {
        Nodo nodo1 = new Nodo(dato);
        nodo1.siguiente=tope;
        tope=nodo1;
        length++;
    }

    @Override
    public void pop() {
    if (tope!=null)
    {
        Nodo eliminado=tope;
        tope=tope.siguiente;
       
        length--;//tamanio de la pila decrece
    }
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public boolean empty() {//La pila esta vacia?
        return length==0;
    }

    @Override
    public int peek() {//Consultar el pirmer elemento de la pila
        if(tope==null)
        {
            return 0;
        }
        else
        {
         
        return tope.dato;  
        }
    }
    
    
}
