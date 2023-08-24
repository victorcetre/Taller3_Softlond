package Banco;

public class CuentaAhorro implements CuentaBancaria {
    private double saldo;

    public CuentaAhorro(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
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
