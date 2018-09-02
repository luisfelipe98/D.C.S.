package exe;

public class Media {

    private double n1, n2, n3, resultado; 
    
    public void setNota (double n1, double n2, double n3) {
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
     }
    
    public void Calcula() {
        resultado = (n1 + n2 + n3) / 3;
    }
    
    public double getMedia() {
        return resultado;
    }
   
}
