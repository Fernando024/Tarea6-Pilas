/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pilas;
import java.util.Stack;


public class Principal {
public int dato;
public String palabraDato;
public Nodo aux;
    
    public static void main(String[] args) {
        PilaMetodos pila1 = new PilaMetodos();
        
    
        System.out.println("                                Pilas     ");
        System.out.println("=========================================================================");
        pila1.push(10);
        pila1.push(300);
        pila1.push(3);
        pila1.push(15);
        pila1.push(9);
        pila1.push(6);
        
        System.out.println("\nLa pila esta vacia?:"+pila1.empty());
        
        
     
        System.out.println("El tamanio de la pila es "+pila1.length());
        
        
        System.out.println("El elemento que se encuentra hasta arriba en la pila es:"+pila1.peek());
        
        System.out.println("\nSe elimina el ultimo elemento de la pila");
        pila1.pop();
        System.out.println("Ahora el elemento que se encuentra hasta arriba en la pila es:"+pila1.peek());
        
        System.out.println("\nLos elemtos dentro de la pila son:");
        //el ciclo seguira mientras la pila no este vacia ,cuando lo este termina el ciclo 
        
        while(pila1.empty()==false)
        {
           
            System.out.println(pila1.peek());
            pila1.pop();
        }
        
        
    }
}
