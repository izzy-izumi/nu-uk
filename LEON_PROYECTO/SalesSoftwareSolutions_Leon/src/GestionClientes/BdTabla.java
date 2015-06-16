/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionClientes;

import ModeloTablas.diseñoTablas;
import javax.swing.JTable;

/*
 *@author Shary Yareli Chuc Ku
 *Versión: 2.0
 *Fecha última modificación: 06-12-14
 */
//Clase que permite estructurar la tabla de clientes existentes en la BD desde el arranque, esta clase solo es el
//paso de parámetros para el llenado.
public class BdTabla {

    private JTable tabla;
    private String diseñoTabla = "";
    private String nombreTabla = "";
    private String columnas = "";

//    Método que tiene como parámetro la tabla a rellenar.
//    Tiene el nombre de la tabla de acuerdo a la BD.
//    Tiene las columnas de acuerdo a la BD.
//    Llama a la clase diseñoTablas y le pasa los parámetros mencionados.
    public BdTabla(JTable tabla) {
        this.tabla = tabla;
        diseñoTabla = "RFC,EMPRESA/NOMBRE,DIRECCIÓN,CIUDAD,E-MAIL";
        nombreTabla = "clientes";
        columnas = "rfc,nombre_cliente,domicilio,ciudad,email";
        diseñoTablas tabla1 = new diseñoTablas(tabla, diseñoTabla, nombreTabla, columnas);
    }

}
