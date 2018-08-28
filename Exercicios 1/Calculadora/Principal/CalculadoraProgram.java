package br.pro.ramon.dcs.java.calculadora;

public class CalculadoraProgram {

    public String calcula(String n1, String n2, String op) {
        
       double nota1 = Double.parseDouble(n1);
       double nota2 = Double.parseDouble(n2);
       double resultado = 0;
       
       switch (op) {
       
           case "+":
               resultado = nota1 + nota2;
               break;
               
           case "-":
               resultado = nota1 - nota2;
               break;
       
           case "*":
               resultado = nota1 * nota2;
               break;
       
           case "/":
               resultado = nota1 / nota2;
               break;
               
       } 
        
    return Double.toString(resultado);    
       
    }
    
}
