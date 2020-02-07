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
        System.out.println("RR");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    /**
     * @author vJazz06
     * Devuleve la suma de todos los valores contenidos en la lista
     * @param lista Lista enlazada enviada por parámetros
     * @return suma del valor contenido en todos los elementos
     */
    public static int resta(List <Integer> lista){
        int resta=0;
        Iterator it = lista.iterator();
        while(it.hasNext()){
            resta-=(int)it.next();
        }
        return resta;
    }
    
    public static void main(String[] args) {
        List <Integer> lista1 = new LinkedList();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        mostrarLista(lista1);
    }
}