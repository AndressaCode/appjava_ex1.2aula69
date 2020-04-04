/*
 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar
 * quanto seria o valor de uma circunferência e do volume de uma esfera
 * para um raio daquele valor. Informar também o valor de PI com duas 
 * casas decimais.
 */
package apllication;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Informe um valor qualquer: ");
        double radius = sc.nextDouble();
        
        double c = Calculator.circunference(radius);
        double v = Calculator.volume(radius);
        
        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("Valor de PI: %.2f", Calculator.PI);
        // circunferencia = 2 * pi * r;
        // volume = 4 * pi * raio * raio * raio;
    
    }
    
}
