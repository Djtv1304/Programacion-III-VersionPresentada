import java.util.*;

public class SystemFacturacion {
    List<Factura> facturas=new ArrayList<>();
    Queue<Factura> facturasDiarias=new LinkedList<>();
    public void addFactura(Factura factura){
        facturas.add(factura);
    }
    public void addFacturaDiaria(Factura factura){
        facturasDiarias.add(factura);
    }
    public void modificarPacientedeFactura(Factura factura_Modificar_Paciente,Paciente pacienteaModificar){
         factura_Modificar_Paciente.setPacienteFactura(pacienteaModificar);
    }
    public void modificarCantidadTerapiasFactura(Factura factura_Modificar_Terapias,int cantidadaModficar){
        factura_Modificar_Terapias.setCantidadTerapias(cantidadaModficar);
    }
    public void modificarDescripcionFactura(Factura factura_Modificar_Descripcion,String descripcionaModficar){
        factura_Modificar_Descripcion.setDescripcion(descripcionaModficar);
    }
    public void modificarDescripcionValorPagar(Factura factura_Modificar_ValorPagar,double valorPagaraModficar){
        factura_Modificar_ValorPagar.setValorTotalPagar(valorPagaraModficar);
    }
    public String saberFormaPado(Factura facturaSaberFormaPago){
        String formaPago=null;
        if (facturaSaberFormaPago.getFormaDePagoFactura()==1){
            formaPago="Tarjeta";
        }
        if (facturaSaberFormaPago.getFormaDePagoFactura()==2){
            formaPago="Efectivo";
        }
        if (facturaSaberFormaPago.getFormaDePagoFactura()==3){
            formaPago="Transferencia";
        }
        return formaPago;
    }
    public void modificarFormaDePago(Factura factura_FormaDePago,int formaPago){
        factura_FormaDePago.setFormaDePagoFactura(formaPago);
    }
    public void OrdenarFacturasxFecha(){
        int n = facturas.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (facturas.get(j).getFechaDiaActual().getDayOfMonth()>facturas.get(j+1).getFechaDiaActual().getDayOfMonth() && facturas.get(j).getFechaDiaActual().getMonthValue()>facturas.get(j+1).getFechaDiaActual().getMonthValue()) {
                    Factura temp = facturas.get(j);
                    facturas.set(j,facturas.get(j+1)) ;
                    facturas.set(j+1,temp);
                }
            }
        }
    }
}
