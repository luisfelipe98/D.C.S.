package Exe2;

public class Dormir {
   
    private boolean diaUtil, emFerias;
    
    public void setDiaUtil(Boolean diaUtil) {
        this.diaUtil = diaUtil;
    }
    
    public void setFerias(Boolean emFerias) {
        this.emFerias = emFerias;
    }
    
    private String Avaliacao(){
        if (diaUtil == false || emFerias == true) {
            return "sim";
        } else {
            return "nao";
        }
    }
    
    public String Resposta() {
        if (Avaliacao().equals("sim")) {
            return "Você pode dormir até mais tarde";
        }else{
            return "Você não pode dormir até mais tarde";
        }
    } 
    
}
