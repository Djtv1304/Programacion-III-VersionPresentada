import java.util.*;

public class SystemFacturacion {
    List<Factura> facturas=new ArrayList<>();
    Queue<Factura> facturasDiarias=new LinkedList<>();
    public void addFactura(Factura factura){
        facturas.add(factura);
        OrdenarFacturasxFecha();
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
    public void modificarValorPagar(Factura factura_Modificar_ValorPagar,double valorPagaraModficar){
        factura_Modificar_ValorPagar.setValorTotalPagar(valorPagaraModficar);
    }
    public String saberFormaPado(int formaPagoInt){
        String formaPago=null;
        if (formaPagoInt==1){
            formaPago="Tarjeta";
        }
        if (formaPagoInt==2){
            formaPago="Efectivo";
        }
        if (formaPagoInt==3){
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
    public void BurbujaxCorreo(){
        int n = facturas.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (facturas.get(j).getPacienteFactura().getPersonaPaciente().getUsername().compareTo(facturas.get(j+1).getPacienteFactura().getPersonaPaciente().getUsername()) >0 ) {
                    Factura temp = facturas.get(j);
                    facturas.set(j,facturas.get(j+1)) ;
                    facturas.set(j+1,temp);
                }
            }
        }
    }
    public  Paciente searchBinary(List<Paciente> listaBuscarPorTrackingBinario, String targetTrackingCorreo) {
        int izquierda=0, derecha= listaBuscarPorTrackingBinario.size() -1;
        while (izquierda<=derecha){
            int numMedio=(derecha+izquierda)/2;
            if(targetTrackingCorreo.equals(listaBuscarPorTrackingBinario.get(numMedio).getCorreo())){
                return listaBuscarPorTrackingBinario.get(numMedio);
            }else if(listaBuscarPorTrackingBinario.get(numMedio).getCorreo().compareTo(targetTrackingCorreo) < 0){
                izquierda=numMedio+1;
            }else{
                derecha=numMedio-1;
            }
        }
        return null;
    }
    public  Factura searchBinaryFactura(List<Factura> listaBuscarPorTrackingBinario, String targetTrackingCorreo) {
        int izquierda=0, derecha= listaBuscarPorTrackingBinario.size() -1;
        while (izquierda<=derecha){
            int numMedio=(derecha+izquierda)/2;
            if(targetTrackingCorreo.equals(listaBuscarPorTrackingBinario.get(numMedio).getPacienteFactura().getCorreo())){
                return listaBuscarPorTrackingBinario.get(numMedio);
            }else if(listaBuscarPorTrackingBinario.get(numMedio).getPacienteFactura().getCorreo().compareTo(targetTrackingCorreo) < 0){
                izquierda=numMedio+1;
            }else{
                derecha=numMedio-1;
            }
        }
        return null;
    }

}
