package Exe3;

public class Fatorial {
   
    private int numero, resposta = 1, cont;
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void Calculo() {
        if (numero > 1) {
            cont = numero;
            while (cont != 1){  
                resposta = resposta * cont; 
                cont--;
            }
        }
    }
    
    public String Resposta() {
        if (numero <= 0) {
            return "Número inválido";
        } else if (numero == 1) {
            return "O fatorial de " + numero + " é ele mesmo";
        } else {
            return "O fatorial de " + numero + " é " + resposta;
        }
    }
}
