import javax.swing.*;

public class Cuenta {
    double saldoCuenta;

    public Cuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    public void aumentarSaldo(double cantidad){
        saldoCuenta += cantidad;
    }
    public void decrementarDinero(double cantidad) {
        if (cantidad <= saldoCuenta && cantidad>0) {
            saldoCuenta -= cantidad;
        } else {
            JOptionPane.showMessageDialog(null,"No hay suficiente saldo en la cuenta.");
        }
    }

}
