import java.util.Scanner;

public class Program {

    public static void main(String args[]) {
    
    String resposta;
    
    Scanner resp = new Scanner(System.in);
    
    System.out.print("Digite numero ou letra: ");
    resposta = resp.nextLine();
    
    Numero n = new Numero();
    n.setResposta(resposta);
    
    System.out.println(n.getResposta());
    }
    
}
