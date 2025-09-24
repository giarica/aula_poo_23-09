
package a4_e4;
import java.util.Scanner;

public class A4_E4 {

    public static void main(String[] args) {
        if (args.length < 2)
            System.out.print("faltam os argumentos...");
        else{
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            int aulas = Integer.parseInt(args[2]);
            int faltas = Integer.parseInt(args[3]);
            float media = (a+b)/2;
            float frequencia = (1 - ((float)faltas/aulas)) * 100;
            
            String resultado = "Aprovado!";
            if (media < 6 || frequencia < 75)
            resultado = "Reprovado!";
            
            System.out.println("Media: "+media+" / Frequencia: "+frequencia+ "+resultado: "+resultado);
        }
    }
}
