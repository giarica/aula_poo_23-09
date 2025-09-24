
package a4_e3;
import java.util.Scanner;

public class A4_E3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float a = s.nextFloat();
        System.out.print("Digite a segunda nota ");
        float b = s.nextFloat();
        System.out.print("Digite a frequencia: ");
        float frequencia = s.nextFloat();
        float media = (a+b)/2;
        
        String resultado = "Aprovado";
        if (media < 6 || frequencia < 75)
            resultado = "Reprovado";
        
        System.out.println("Media: "+media+ " / Frequencia: "+frequencia+"% / "+"Resultado: "+resultado);
    }
}
