package Banco;

public class BancoApp {
    public static void main(String[] args) {
        CuentaBancaria cuentaAhorro = new CuentaAhorro(1000);
        CuentaBancaria cuentaCorriente = new CuentaCorriente(2000, 1000);

        cuentaAhorro.depositar(500);
        cuentaCorriente.depositar(800);

        cuentaAhorro.retirar(200);
        cuentaCorriente.retirar(2500);

        System.out.println("Saldo cuenta de ahorro: " + cuentaAhorro.consultarSaldo());
        System.out.println("Saldo cuenta corriente: " + cuentaCorriente.consultarSaldo());
    }
}
