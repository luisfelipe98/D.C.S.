package br.pro.ramon.dcs.java.conta;

public class ContaCorrente {

    private double saldo = 0;
    
    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor) {
        if (valor < 0) {
            throw new ValorInvalidoException();
        }
        
        this.saldo = this.saldo + valor;
    }

    public void saque(double valor) {
        if (valor < 0) {
            throw new ValorInvalidoException();
        }
        
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException();
        }
        
        this.saldo = this.saldo - valor;
    }

}
