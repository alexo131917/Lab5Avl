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
                                + "3. Salir\n"
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
                           arbolito.inOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showInputDialog(null, "El árbol esta vácio",
                                "!Vacio¡",JOptionPane.QUESTION_MESSAGE);
                        }
                        break;
                    case 3:
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
        }while(opcion!=3);
    }
}
