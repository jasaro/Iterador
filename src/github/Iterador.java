/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;
import java.util.*;
/**
 *
 * @author jaimesaro
 */
public class Iterador {
    
    public static void mostrarLista(List <Integer> lista){
        Iterator it = lista.iterator();
        it = lista.iterator();
        System.out.println("RR");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public static void main(String[] args) {
        List <Integer> lista1 = new LinkedList();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        mostrarLista(lista1);
    }
}