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
    
    public static void llenarLista(List <Integer> lista){
        for(int i=0;i<=10;i++){
            lista.add(i);
        }
    }
    
    public static int sumaLista(List <Integer> lista){
        Iterator it = lista.iterator();
        int suma=0;
        while(it.hasNext()){
            suma+=(int)it.next();
        }
        return suma;
    }
    
    public static double mediaLista(List <Integer> lista){
        Iterator it = lista.iterator();
        double media = 0;
        while(it.hasNext()){
            media+=(int)it.next();
        }
        media /= lista.size();
        return media;
    }
    
    public static void main(String[] args) {
        List <Integer> lista1 = new LinkedList();
        llenarLista(lista1);
        mostrarLista(lista1);
        System.out.println("Suma: "+sumaLista(lista1));
    }
}