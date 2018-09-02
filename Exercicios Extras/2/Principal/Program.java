import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
    
    float numero;
    
    Scanner resp = new Scanner(System.in);
    
    System.out.print("Digite um número: ");
    numero = resp.nextFloat();
    
    Numero n = new Numero();
    n.setNumero(numero);
    
    if (n.isMaior() == true) {
        System.out.println("SUCESSO");
    } else {
        System.out.println("ERRO");
    }
    
    System.out.println("FIM DO PROGRAMA");
    
    }
    
}
