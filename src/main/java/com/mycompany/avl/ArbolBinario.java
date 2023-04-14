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
}
