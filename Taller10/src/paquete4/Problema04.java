/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //double[][] datos = new double[2][2];
        int [][] datos= new int[2][2];
        int valor;
        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                
                System.out.printf("Ingrese el valor para fila[%d]"
                + "columna [%d] \n", i , j);
                valor = entrada.nextInt();
                datos[i][j] = valor;
            }
            
        }
        System.out.println();
        
        System.out.println("El arreglo con los nuevos datos son:");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%d\t", datos[i][j]);
            }
             System.out.println();
        }
    }
}
