import java.time.LocalDate;
import java.util.List;

public class Factura {
    Paciente pacienteFactura;
    int cantidadTerapias;
    String descripcion;
    double valorTotalPagar;
    int formaDePagoFactura;
    LocalDate fechaDiaActual=LocalDate.now();

   /* formaDePago formaDePagoFactura;
    enum formaDePago{
        EFECTIVO,
        TARJETA,
        TRANSFERENCIA
    }*/

    public Factura(Paciente pacienteFactura, int cantidadTerapias, String descripcion, double valorTotalPagar, int formaDePagoFactura, LocalDate fechaDiaActual) {
        this.pacienteFactura = pacienteFactura;
        this.cantidadTerapias = cantidadTerapias;
        this.descripcion = descripcion;
        this.valorTotalPagar = valorTotalPagar;
        this.formaDePagoFactura = formaDePagoFactura;
        this.fechaDiaActual = fechaDiaActual;
    }

    public Paciente getPacienteFactura() {
        return pacienteFactura;
    }

    public void setPacienteFactura(Paciente pacienteFactura) {
        this.pacienteFactura = pacienteFactura;
    }

    public int getCantidadTerapias() {
        return cantidadTerapias;
    }

    public void setCantidadTerapias(int cantidadTerapias) {
        this.cantidadTerapias = cantidadTerapias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorTotalPagar() {
        return valorTotalPagar;
    }

    public void setValorTotalPagar(double valorTotalPagar) {
        this.valorTotalPagar = valorTotalPagar;
    }

    public int getFormaDePagoFactura() {
        return formaDePagoFactura;
    }

    public void setFormaDePagoFactura(int formaDePagoFactura) {
        this.formaDePagoFactura = formaDePagoFactura;
    }

    public LocalDate getFechaDiaActual() {
        return fechaDiaActual;
    }

}
