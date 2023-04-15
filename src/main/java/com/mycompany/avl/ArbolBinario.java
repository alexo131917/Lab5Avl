/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avl;

/**
 *
 * @author alexo
 */
public class ArbolBinario {
    NodoArbol raiz;
    public ArbolBinario ( ){
        raiz = null;   
    }
    //METODO PARA INCERSETAR UN NODO EN EL ARBOL
    public void agregarNodo(int d, String nom){
        NodoArbol nuevo = new NodoArbol (d, nom);
        if ( raiz == null){
            raiz= nuevo;
        }else{
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true){
                padre = auxiliar ;
                if(d<auxiliar.dato){
                    auxiliar = auxiliar.hijoIzquierdo;
                    if(auxiliar==null){
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.hijoDerecho;
                    if(auxiliar==null){
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    // Metodo para saber cuando el arbol esta vacio
    public boolean estaVacio (){
    return raiz==null; // Es pregunta si es igual a null regresa True si no un false
    }
    // Metodo para recorrer el Arbol InOrden
    public void inOrden(NodoArbol r){
        if (r! = null){      //Si r es diferente null entonces si hace el recorrido
            inOrden(r.hijoIzquierdo); // primer paso es recorrer sub arbol izquierdo
            System.out.println(r.dato);
            inOrden(r.hijoDerecho);
        }
    }
    // Metodo para recorrer el Arbol preOrden
    public void preOrden(NodoArbol r){
        if (r! = null){      //Si r es diferente null entonces si hace el recorrido
            System.out.println(r.dato); // primer paso es recorrer la raiz   
            preOrden(r.hijoIzquierdo); 
            preOrden(r.hijoDerecho);
        }    
    }
}
