/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a4_e2;
import java.util.Scanner;

public class A4_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 2)
            System.out.print("Sao necessarios dois argumentos: notas do aluno.");
        else{
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            float media = (a+b)/2;
            String resultado = "Aprovado!";
        if (media < 6)
            resultado = "Reprovado!";
            System.out.println("Media: "+media+" /Resultado: "+resultado);
        }
    }
}
