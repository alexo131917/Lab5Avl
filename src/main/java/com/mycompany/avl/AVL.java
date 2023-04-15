/*2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avl;
import javax.swing.JOptionPane;
/**
 *
 * @author alexo
 */
public class AVL {

    public static void main(String[] args) {
        int opcion =0, elemento;
        String nombre;
        ArbolBinario arbolito = new  ArbolBinario();
        do{
            try{
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null, 
                                  "1. Agregar un Nodo\n "
                                + "2. Recorrer el árbol InOrden\n"
                                + "3. Recorrer el árbol PreOrden\n"
                                + "4. Recorrer el árbol PostOrden\n"
                                + "5. Buscar un nodo en el árbol\n"
                                + "6. Eliminar un nodo en el árbol\n"
                                + "7. Salir\n"
                                + "Elige una opcion... ","Arboles Binarios"
                        , JOptionPane.QUESTION_MESSAGE)) ;
                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el numero del Nodo...", "Agregado Nodo"
                                ,JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del Nodo...","Agregado Nodo"
                                ,JOptionPane.QUESTION_MESSAGE);
                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbolito.estaVacio()){
                            System.out.println();
                           arbolito.inOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showInputDialog(null, "El árbol esta vácio",
                                "!Vacio¡",JOptionPane.QUESTION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!arbolito.estaVacio()){
                            System.out.println();
                           arbolito.preOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showInputDialog(null, "El árbol esta vácio",
                                "!Vacio¡",JOptionPane.QUESTION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!arbolito.estaVacio()){
                            System.out.println();
                           arbolito.postOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showInputDialog(null, "El árbol esta vácio",
                                "!Vacio¡",JOptionPane.QUESTION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!arbolito.estaVacio()){
                           elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el numero del Nodo buscado..", "Buscando Nodo"
                                ,JOptionPane.QUESTION_MESSAGE));
                           
                           if(arbolito.buscarNodo(elemento)==null){
                               JOptionPane.showInputDialog(null, "El nodo no se encuentra en el árbol",
                                "!Nodo no encontrado¡",JOptionPane.QUESTION_MESSAGE);
                           }else{
                               System.out.println("Nodo encontrado, sus datos son:" + arbolito.buscarNodo(elemento));
                           }
                        }else{
                            JOptionPane.showInputDialog(null, "El árbol esta vácio",
                                "!Vacio¡",JOptionPane.QUESTION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!arbolito.estaVacio()){
                           elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el numero del Nodo eliminar..", "Eliminando Nodo"
                                ,JOptionPane.QUESTION_MESSAGE));
                           
                           if(arbolito.eliminar(elemento)==false){
                               JOptionPane.showInputDialog(null, "El nodo no se encuentra en el árbol",
                                "!Nodo no encontrado¡",JOptionPane.QUESTION_MESSAGE);
                           }else{
                               JOptionPane.showInputDialog(null, "El nodo a sido eliminado del árbol",
                                "!Nodo eliminado¡",JOptionPane.QUESTION_MESSAGE);
                           }
                        }else{
                            JOptionPane.showInputDialog(null, "El árbol esta vácio",
                                "!Vacio¡",JOptionPane.QUESTION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showInputDialog(null, "Aplicacion finalizada",
                                "Fin",JOptionPane.QUESTION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "Opcion Incorrecta",
                                "Cuidado",JOptionPane.QUESTION_MESSAGE);
                }
             }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null,"error" + n.getMessage());
            }
        }while(opcion!=7);
    }
}
