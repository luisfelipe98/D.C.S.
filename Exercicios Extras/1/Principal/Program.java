
import java.util.Scanner;

public class Program {
    
    public static void main(String args[]) {
    
        String nome, estadoCivil, endereco;
        int telefone;
        
        Scanner resp = new Scanner(System.in);
        
        System.out.println("Ficha!!!");    
        System.out.print("Digite seu nome: ");
        nome = resp.nextLine();
        System.out.print("Digite seu estado civil: ");
        estadoCivil = resp.nextLine();
        System.out.print("Digite seu endereco: ");
        endereco = resp.nextLine();
        System.out.print("Digite seu telefone: ");
        telefone = resp.nextInt();
        
        Ficha ficha = new Ficha();
        ficha.setNome(nome);
        ficha.setEstadoCivil(estadoCivil);
        ficha.setEndereco(endereco);
        ficha.setTelefone(telefone);
        
        System.out.println("");
        System.out.println("Sua ficha pessoal");
        System.out.println("Nome: " + ficha.getNome());
        System.out.println("Estado Civil: " + ficha.getEstadoCivil());
        System.out.println("Endereço: " + ficha.getEndereco());
        System.out.println("Telefone: " + ficha.getTelefone());
        
    }
    
}
