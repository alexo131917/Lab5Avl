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
        if (r!= null){      //Si r es diferente null entonces si hace el recorrido
            inOrden(r.hijoIzquierdo); // primer paso es recorrer sub arbol izquierdo
            System.out.println(r.dato);
            inOrden(r.hijoDerecho);
        }
    }
    // Metodo para recorrer el Arbol preOrden
    public void preOrden(NodoArbol r){
        if (r!= null){      //Si r es diferente null entonces si hace el recorrido
            System.out.println(r.dato); // primer paso es recorrer la raiz   
            preOrden(r.hijoIzquierdo); 
            preOrden(r.hijoDerecho);
        }    
    }
    // Metodo para recorrer el Arbol preOrden
    public void postOrden(NodoArbol r){
        if (r!= null){      //Si r es diferente null entonces si hace el recorrido
            postOrden(r.hijoIzquierdo); // primer paso es recorrer el sub arbol izquierdo
            postOrden(r.hijoDerecho); // segundo recorre el sub arbol derecho
            System.out.println(r.dato); // tercer paso recorre la raiz
        }   
    }
    //Metodo para buscar un nodo en el arbol
    public NodoArbol buscarNodo (int d){
        NodoArbol aux=raiz;
        while(aux.dato!=d){
            if(d<aux.dato){
                aux=aux.hijoIzquierdo;
            }else{
                aux=aux.hijoDerecho;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
    //Metodo para eliminar un nodo del Arbol
    public boolean eliminar(int d){
        NodoArbol auxiliar=raiz;
        NodoArbol padre=raiz;
        boolean esHijoIzq=true;
        while(auxiliar.dato!=d){
            padre=auxiliar;
            if(d<auxiliar.dato){
                esHijoIzq=true;
                auxiliar=auxiliar.hijoIzquierdo;
            }else{
                esHijoIzq=false;
                auxiliar=auxiliar.hijoDerecho;
            }
            if(auxiliar==null){
                return false;
            }
        }//Fin del while
        if(auxiliar.hijoIzquierdo==null && auxiliar.hijoDerecho==null){
            if(auxiliar==raiz){
                raiz=null;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=null;
            }else{
                padre.hijoDerecho=null;
            }
        }else if(auxiliar.hijoDerecho==null){
            if(auxiliar==raiz){
                raiz=auxiliar.hijoIzquierdo;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=auxiliar.hijoIzquierdo;
            }else{
                padre.hijoDerecho=auxiliar.hijoIzquierdo;
            }
        }else if(auxiliar.hijoIzquierdo==null){
            if(auxiliar==raiz){
                raiz=auxiliar.hijoDerecho;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=auxiliar.hijoDerecho;
            }else{
                padre.hijoDerecho=auxiliar.hijoIzquierdo;
            }
        }else{
            NodoArbol reemplazo=obtenerNodoReemplazo(auxiliar);
            if(auxiliar==raiz){
                raiz=reemplazo;
            }else if{
                padre.hijoIzquierdo=reemplazo;
            }else{
                padre.hijoDerecho=reemplazo;
            }
            reemplazo.hijoIzquierdo=auxiliar.hijoIzquierdo;
        }
        return true; 
    }
    //Metodo encargado de devolvernos el nodo reemplazo
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReemp){
        NodoArbol reemplazarPadre=nodoReemp;
        NodoArbol reemplazo=nodoReemp;
        NodoArbol auxiliar=nodoReemp.hijoDerecho;
        while(auxiliar!=null){
            reemplazarPadre=reemplazo;
            reemplazo=auxiliar;
            auxiliar=auxiliar.hijoIzquierdo;
        }
        if(reemplazo!=nodoReemp.hijoDerecho){
            reemplazarPadre.hijoIzquierdo=reemplazo.hijoDerecho;
            reemplazo.hijoDerecho=nodoReemp.hijoDerecho;
        }
        System.out.println("El nodo reemplazo es " + reemplazo);
        return reemplazo;
    }
}
