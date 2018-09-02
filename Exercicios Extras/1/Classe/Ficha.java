public class Ficha {
    
    private String nome, estadoCivil, endereco;
    private int telefone;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public int getTelefone() {
        return telefone;
    }
    
    
}
