package Exe2;

import java.util.Scanner;

public class Exe2 {
    
    public static void main(String[] args) {
    
        boolean diaUtil, emFerias;
        
        Scanner resp = new Scanner(System.in);
        
        System.out.println("É dia útil?");
        diaUtil = resp.nextBoolean();
        
        System.out.println("Você está de férias?");
        emFerias = resp.nextBoolean();
        
        Dormir dormir = new Dormir();
        dormir.setDiaUtil(diaUtil);
        dormir.setFerias(emFerias);
        
        System.out.println(dormir.Resposta());
    
    }
}
