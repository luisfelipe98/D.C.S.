import java.util.regex.*;

public class Numero {

    private String resposta;
    
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    private boolean isNumero() {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(resposta);
        return m.find() == true;
    }

    private String CalculoImparouPar() {
        if (isNumero() == true) {
            int numero = Integer.parseInt(resposta);
            if (numero % 2 == 0) {
                return "O numero " + numero + " é par";  
            }else{
                return "O numero " + numero + " é ímpar";
            } 
        }else{
            return "Não é um número";
        }

    }
    
    public String getResposta() {
        return CalculoImparouPar();
    }
    
}
