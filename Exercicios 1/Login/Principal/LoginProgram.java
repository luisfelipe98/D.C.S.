package br.pro.ramon.login;

public class LoginProgram {

    public String login(String login, String senha) {
        if (login.equals("admin") && senha.equals("r**t")){
            return "Autorizado";
        } else {
            return "Não Autorizado";
        }
        
        
        
    }

}
