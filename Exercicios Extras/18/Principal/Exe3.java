package Exe3;

import java.util.Scanner;

public class Exe3 {

    public static void main(String[] args) {
    
    int numero;
    
    Scanner resp = new Scanner(System.in);
    
    System.out.println("Cálculo do Fatorial");
    
    System.out.println("Digite um número: ");
    numero = resp.nextInt();
 
    Fatorial fatorial = new Fatorial();
    fatorial.setNumero(numero);
    fatorial.Calculo();
    
    System.out.println(fatorial.Resposta());
    
    }
    
}
