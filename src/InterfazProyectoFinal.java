import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InterfazProyectoFinal extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel panelPrincipal;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;
    private JTabbedPane tabbedPane2;
    private JTextField textField2;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JTextField textField3;
    private JButton buttonCrearFactura;
    private JTextField textField5;
    private JButton buttonBuscar;
    private JComboBox comboBox2;
    private JButton ButtonModificar;
    private JTextArea textAreaMostrarModificar;
    private JTextField textFieldUsuarioMo;
    private JTextField textFieldDescripcionMo;
    private JTextField textFieldValoraPagarMo;
    private JComboBox comboBoxCantidaddeterapiasMo;
    private JComboBox comboBoxFormaDepagoMo;
    private JTabbedPane tabbedPane3;
    private JTextField textFieldIngresos;
    private JButton buttonMostrarIngresos;
    private JTextField textField6;
    private JTextField textField7;
    private JButton buttonRetirar;
    private JButton buttonQuemar;
    private JComboBox comboBox3;
    private JButton mostrarTodosButton;
    private JTextArea textArea1;
    private JTextField textField8;
    private JButton busquedaBinariaButton;
    List<Paciente> pacientes=new ArrayList<>();
    List<Paciente> arregloBurbuja=new ArrayList<>();
    List<Paciente> arregloInsercion=new ArrayList<>();

    LocalDate fechaDiaActual=LocalDate.now();
    Factura facturaNew;

    SystemFacturacion facturacionSystemNew =new SystemFacturacion();

    public InterfazProyectoFinal() {
    add(panelPrincipal);
    setSize(500, 500);
    setLocationRelativeTo(null);

    setTitle("GUI Proyecto2");
    Persona personaA=new Persona("Juan","Cuccitini","1727373688","Masculino",11,02,2003);
    Persona personaB=new Persona("Lionel","Messi","1711007086","Masculino",18,01,2001);
    Persona personaC=new Persona("Cristiano","Aveiro","1899105286","Masculino",26,12,1991);
    Persona personaD=new Persona("Anuel","Cuccitini","1727373688","Masculino",11,02,2003);
    Persona personaE=new Persona("Zaramay","Messi","1711007086","Masculino",18,01,2001);
    Persona personaF=new Persona("Duki","Aveiro","1899105286","Masculino",26,12,1991);
    Paciente pacienteA=new Paciente(personaA,3,true,"Juan@gmial.com","nose");
    Paciente pacienteB=new Paciente(personaB,2,true,"Lionel@gmial.com","nose");
    Paciente pacienteC=new Paciente(personaC,2,false,"Cr7@gmial.com","nose");
    Paciente pacienteD=new Paciente(personaD,3,true,"Juan@gmial.com","nose");
    Paciente pacienteE=new Paciente(personaE,1,true,"Lionel@gmial.com","nose");
    Paciente pacienteF=new Paciente(personaF,1,false,"Cr7@gmial.com","nose");

    buttonCrearFactura.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (facturacionSystemNew.searchBinary(pacientes,textField2.getText())!=null){
                Paciente pacienteGuardar=facturacionSystemNew.searchBinary(pacientes,textField2.getText());
                double valorPagar=determinarValorPagar(comboBox1,textField3);
                int formaPago=determinarFormaPago(comboBox2);
                int cantidadTerapias=comboBox1.getSelectedIndex();
                String descripcion=textField4.getText();
                textField3.setText(String.valueOf(valorPagar));
                facturaNew=new Factura(pacienteGuardar,cantidadTerapias,descripcion,valorPagar,formaPago,fechaDiaActual);
                facturacionSystemNew.addFactura(facturaNew);
                JOptionPane.showMessageDialog(null,"Factura creada");
                System.out.println(facturacionSystemNew.facturas);

            }else{
                JOptionPane.showMessageDialog(null,"No se encontro Paciente");
            }
        }
    });
        buttonQuemar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pacientes.add(pacienteC);
                pacientes.add(pacienteA);
                pacientes.add(pacienteB);
                pacientes.add(pacienteD);
                pacientes.add(pacienteE);
                pacientes.add(pacienteF);
            }
        });
        buttonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correo=textField5.getText();
                if (facturacionSystemNew.searchBinaryFactura(facturacionSystemNew.facturas,correo)!=null){
                    Factura facturaEncontrada=facturacionSystemNew.searchBinaryFactura(facturacionSystemNew.facturas,textField5.getText());
                    textFieldUsuarioMo.setText(facturaEncontrada.getPacienteFactura().getCorreo());
                    comboBoxCantidaddeterapiasMo.setSelectedItem(facturaEncontrada.getCantidadTerapias());
                    textFieldDescripcionMo.setText(facturaEncontrada.getDescripcion());
                    textFieldValoraPagarMo.setText(String.valueOf(facturaEncontrada.getValorTotalPagar()));
                    comboBoxFormaDepagoMo.setSelectedItem(facturaEncontrada.getFormaDePagoFactura());
                }
            }
        });
        ButtonModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correo=textField5.getText();
                String pacienteCorre=textFieldUsuarioMo.getText();
                if (facturacionSystemNew.searchBinaryFactura(facturacionSystemNew.facturas,correo)!=null){
                    Factura facturaCambiar=facturacionSystemNew.searchBinaryFactura(facturacionSystemNew.facturas,correo);
                    if (facturacionSystemNew.searchBinary(pacientes,pacienteCorre)!=null){
                        double valorPagarNuevo=determinarValorPagar(comboBoxCantidaddeterapiasMo,textFieldValoraPagarMo);
                        int formaPagoNueva=determinarFormaPago(comboBoxFormaDepagoMo);
                        int cantidadTerapiasNueva=comboBoxCantidaddeterapiasMo.getSelectedIndex();
                        String descripcionNueva=textFieldDescripcionMo.getText();
                        Paciente pacienteAux=facturacionSystemNew.searchBinary(pacientes,pacienteCorre);
                        facturacionSystemNew.modificarPacientedeFactura(facturaCambiar,pacienteAux);
                        facturacionSystemNew.modificarCantidadTerapiasFactura(facturaCambiar,cantidadTerapiasNueva);
                        facturacionSystemNew.modificarDescripcionFactura(facturaCambiar,descripcionNueva);
                        facturacionSystemNew.modificarValorPagar(facturaCambiar,valorPagarNuevo);
                        facturacionSystemNew.modificarFormaDePago(facturaCambiar,formaPagoNueva);
                        textField3.setText(String.valueOf(valorPagarNuevo));


                        textAreaMostrarModificar.setText(" "+facturacionSystemNew.searchBinaryFactura(facturacionSystemNew.facturas,textFieldUsuarioMo.getText()));
                    }
                }
            }
        });
        mostrarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox3.getSelectedItem().toString().equalsIgnoreCase("Nombre")) {
                    BurbujaxNombre();
                    textArea1.setText("");
                    for (int i = 0; i < getArregloBurbuja().size(); i++) {
                        textArea1.append(getArregloBurbuja().get(i).getPersonaPaciente().getNombre() + "\n");
                    }
                }
                if (comboBox3.getSelectedItem().toString().equalsIgnoreCase("Prioridad")) {
                    BurbujaxPrioridad();
                    textArea1.setText("");
                    for (int i = 0; i < getArregloBurbujaxPrioridad().size(); i++) {
                        textArea1.append(getArregloBurbujaxPrioridad().get(i).getPersonaPaciente().getNombre() + "\n");
                    }
                }
            }
        });
        busquedaBinariaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(searchBinary(getArregloBurbuja(),textField8.getText()).getPersonaPaciente().getNombre());

            }
        });
    }
    public double determinarValorPagar(JComboBox comboboxAux,JTextField textFieldAux){
        double valorPagar=0.0;
        if (comboboxAux.getSelectedIndex()==0){
            valorPagar=7.50;
            textFieldAux.setText(String.valueOf(valorPagar));
        }if (comboboxAux.getSelectedIndex()==1){
            valorPagar=7.50*2;
            textFieldAux.setText(String.valueOf(valorPagar));
        }if (comboboxAux.getSelectedIndex()==2){
            valorPagar=7.50*3;
            textFieldAux.setText(String.valueOf(valorPagar));
        }if (comboboxAux.getSelectedIndex()==3){
            valorPagar=7.50*4;
            textFieldAux.setText(String.valueOf(valorPagar));
        }if (comboboxAux.getSelectedIndex()==4){
            valorPagar=7.50*5;
            textFieldAux.setText(String.valueOf(valorPagar));
        }if (comboboxAux.getSelectedIndex()==5){
            valorPagar=7.50*6;
            textFieldAux.setText(String.valueOf(valorPagar));
        }
        return valorPagar;
    }
    public int determinarFormaPago(JComboBox comboboxA){
        int formaPago=0;
        if (comboboxA.getSelectedIndex()==0){
            formaPago= 1;
        }if (comboboxA.getSelectedIndex()==1){
            formaPago= 2;
        }if (comboboxA.getSelectedIndex()==2){
            formaPago= 3;;
        }
        return formaPago;
    }

    public void BurbujaxNombre(){
        arregloBurbuja = new ArrayList<>();
        for (Paciente packagesRetornar:pacientes){
            try {
                Paciente packageAux=packagesRetornar.deepClone();
                arregloBurbuja.add(packageAux);
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        int n = arregloBurbuja.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arregloBurbuja.get(j).getPersonaPaciente().getNombre().compareTo(arregloBurbuja.get(j+1).getPersonaPaciente().getNombre()) >0 ) {
                    Paciente temp = arregloBurbuja.get(j);
                    arregloBurbuja.set(j,arregloBurbuja.get(j+1)) ;
                    arregloBurbuja.set(j+1,temp);
                }
            }
        }
    }
    public List<Paciente> getArregloBurbuja() {
        return arregloBurbuja;
    }
    public void BurbujaxPrioridad(){
        arregloBurbuja = new ArrayList<>();
        for (Paciente packagesRetornar:pacientes){
            try {
                Paciente packageAux=packagesRetornar.deepClone();
                arregloBurbuja.add(packageAux);
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        int n = arregloBurbuja.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arregloBurbuja.get(j).getPrioridadPaciente()> arregloBurbuja.get(j+1).getPrioridadPaciente()) {
                    Paciente temp = arregloBurbuja.get(j);
                    arregloBurbuja.set(j,arregloBurbuja.get(j+1)) ;
                    arregloBurbuja.set(j+1,temp);
                }
            }
        }
    }
    public List<Paciente> getArregloBurbujaxPrioridad() {
        return arregloBurbuja;
    }

    public  Paciente searchBinary(List<Paciente> listaBuscarPorTrackingBinario, String targetTrackingNameT) {
        int izquierda=0, derecha= listaBuscarPorTrackingBinario.size() -1;
        while (izquierda<=derecha){
            int numMedio=(derecha+izquierda)/2;
            if(targetTrackingNameT.equals(listaBuscarPorTrackingBinario.get(numMedio).getPersonaPaciente().getNombre())){
                return listaBuscarPorTrackingBinario.get(numMedio);
            }else if(listaBuscarPorTrackingBinario.get(numMedio).getPersonaPaciente().getNombre().compareTo(targetTrackingNameT) < 0){
                izquierda=numMedio+1;
            }else{
                derecha=numMedio-1;
            }
        }
        return null;
    }

}
