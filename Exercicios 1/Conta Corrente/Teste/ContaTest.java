package br.pro.ramon.dcs.java.conta;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaTest {

    @Test
    public void testSaldoInicial() {
        ContaCorrente conta = new ContaCorrente();

        assertThat(conta.getSaldo(), is(0.00));
    }

    @Test
    public void testDeposito() {
        ContaCorrente conta = new ContaCorrente();
        conta.deposita(1000.00);

        assertThat(conta.getSaldo(), is(1000.00));
    }

    @Test
    public void testSaque() {
        ContaCorrente conta = new ContaCorrente();
        conta.deposita(1000.00);
        conta.saque(123.45);

        assertThat(conta.getSaldo(), is(876.55));
    }

    @Test(expected = ValorInvalidoException.class)
    public void testErroQuandoDepositoNegativo() {
        ContaCorrente conta = new ContaCorrente();
        conta.deposita(-1000.00);
    }

    @Test(expected = ValorInvalidoException.class)
    public void testErroQuandoSaqueNegativo() {
        ContaCorrente conta = new ContaCorrente();
        conta.deposita(1000.00);
        conta.saque(-123.45);
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testErroQuandoSaldoInsuficienteParaSaque() {
        ContaCorrente conta = new ContaCorrente();
        conta.deposita(1000.00);
        conta.saque(1000.01);
    }

}
