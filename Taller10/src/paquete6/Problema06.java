/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        // TODO code application logic here

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        String serie = "";
        int[][] caracteres = new int[4][2];

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columna = 0; columna < estudiantes[fila].length; columna++) {

                caracteres[fila][columna] = estudiantes[fila][columna].length();
            }
        }
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columna = 0; columna < estudiantes[fila].length; columna++) {
                if (caracteres[fila][columna] == 11) {
                    serie = String.format("%s%s\n", serie,
                            estudiantes[fila][columna]);
                }
            }

        }

        System.out.printf("Los estudiantes que contienen 10 letras en su "
                + "nombre son:\n%s", serie);
    }
}
