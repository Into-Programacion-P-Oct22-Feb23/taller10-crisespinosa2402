/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int[][] ventas = new int[2][5];
        int acumulacion = 0;

        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingrese la venta total que hizo en el día: ");
                ventas[i][j] = entrada.nextInt();
                acumulacion = acumulacion + ventas[i][j];
            }
        }
        for (int i = 0; i < vendedores.length; i++) {
            System.out.printf("Vendedor(a) %s\n", vendedores[i]);
        }
        System.out.printf("Ha realizado un total de %d en ventas.\n",
                acumulacion);
    }

}
