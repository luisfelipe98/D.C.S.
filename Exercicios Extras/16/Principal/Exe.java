package exe;

import java.util.Scanner;

public class Exe {

    public static void main(String[] args) {
        
        double n1, n2, n3;
        
        System.out.println("Cálculo da Média Aritmética");
        
        System.out.println("Digite a primeira nota: ");
        Scanner nota = new Scanner(System.in);
        n1 = nota.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        n2 = nota.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        n3 = nota.nextDouble();
        
        Media media = new Media();
        media.setNota(n1, n2, n3);
        media.Calcula();
        
        System.out.println("O resultado é " + media.getMedia());
             
    }
    
}
