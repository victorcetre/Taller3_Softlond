package Banco;

public class CuentaCorriente implements CuentaBancaria {
    private double saldo;
    private double limiteCredito;

    public CuentaCorriente(double saldoInicial, double limiteCredito) {
        this.saldo = saldoInicial;
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (saldo + limiteCredito >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}