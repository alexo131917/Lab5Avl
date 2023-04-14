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
//quiero ir a dormir 
    public static void main(String[] args) {
        int opcion =0, elemento;
        String nombre;
        ArbolBinario arbolito = new  ArbolBinario();
        do{
            try{
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "1. Agregar un Nodo\n "
                                + "2. Salir\n"
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
                        break;
                //Hace mucho frio y no se que hacer
                }
             }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null,"error" + n.getMessage());
            }
        }while(opcion!=2);
    }
}
