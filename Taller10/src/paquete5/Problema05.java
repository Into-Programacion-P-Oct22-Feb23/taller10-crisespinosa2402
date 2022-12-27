/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        String serie = "";
        String[][] primeraLetra = new String[4][2];
        char[][] letras = new char[4][2];

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columna = 0; columna < estudiantes[fila].length; columna++) {

                letras[fila][columna] = estudiantes[fila][columna].charAt(0);
                primeraLetra[fila][columna] = String.valueOf(letras[fila][columna]);

                if (primeraLetra[fila][columna].equals("S")
                        || primeraLetra[fila][columna].equals("P")
                        || primeraLetra[fila][columna].equals("T")) {

                    serie = String.format("%s%s \n", serie,
                            estudiantes[fila][columna]);

                }
            }
        }
        System.out.println(serie);
    }
}
