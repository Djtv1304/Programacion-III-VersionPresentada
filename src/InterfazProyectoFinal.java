import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterfazProyectoFinal extends JFrame{
    private JTabbedPane tabbedPane1;
    public JPanel panelPrincipal;
    private JTextField textFieldUsernameLogin;
    private JPasswordField passwordFieldLogin;
    private JTabbedPane tabbedPane2;
    private JTextField textField2;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JTextField textField3;
    private JButton buttonCrearFactura;
    private JTextField textField5;
    private JButton buttonBuscarFacutra;
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
    private JTabbedPane tabbedPane4;
    private JButton buscarPacienteButton;
    private JTextField textField9;
    private JComboBox comboBox4;
    private JTextField textField10;
    private JButton crearFichaDeProgresoButton;
    private JCheckBox enInicioCheckBox;
    private JCheckBox enProgresoCheckBox;
    private JCheckBox completadoCheckBox;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JComboBox comboBox5;
    private JButton CONFIRMARESTADOTRATAMIENTOButton;
    private JButton CAMBIARTRATAMIENTOButton;
    private JTextField textField14;
    private JButton buscarButton1;
    private JTextArea textArea2;
    private JTextField textFieldDiaN;
    private JTextField textFieldMesN;
    private JTextField textFieldAnioN;
    private JPasswordField passwordField;
    private JTextField textFieldUsername;
    private JComboBox comboBoxGenero;
    private JTextField textFieldCedula;
    private JTextField textFieldApellido;
    private JTextField textFieldNombre;
    private JButton registrarPacienteButton;
    private JButton iniciarSesionButton;
    private JButton noTeHasRegistradoButton;
    private JPanel JPanelFacturacion;
    private JPanel JPanelLogin;
    private JPanel JPanelCuenta;
    private JPanel JPanelOrdenamiento;
    private JPanel JPanelProgreso;
    private JPanel JPanelPacientes;
    private JTextField textFieldEliminarCuenta;
    private JButton clickAquiParaEliminarButton;
    private JTabbedPane tabbedPane5;
    private JTabbedPane tabbedPane6;
    private JComboBox comboBoxPrioridadPaciente;
    private JTextArea textAreaCitasDeHoy;
    private JButton mostrarCitasAgendadasDeButton;
    private JTabbedPane tabbedPanePacientes;
    private JTextField textFieldEliminarPaciente;
    private JButton eliminarPacienteButton;
    private JComboBox comboBoxSeguroMedico;
    private JTextField nombreModificado;
    private JTextField apellidoModificado;
    private JTextField cedulaModificada;
    private JComboBox generoModificado;
    private JTextField diaModificado;
    private JTextField mesModificado;
    private JTextField anioModificado;
    private JTextField usernameModificado;
    private JPasswordField passwordModificado;
    private JComboBox prioridadModificado;
    private JButton modificarPacienteButton;
    private JComboBox seguroModificadoBox;
    private JTextField textFieldEspecialidad;
    private JButton registrarFisiobutton;
    private JPasswordField passwordFisio;
    private JTextField usernameFisio;
    private JTextField diaFisio;
    private JTextField mesFisio;
    private JTextField anioFisio;
    private JComboBox generoFisio;
    private JTextField cedulaFisio;
    private JTextField apellidoFIsio;
    private JTextField nombreFisio;
    private JTextField nombreFisioParaEliminar;
    private JButton eliminarFisioButton;
    private JTextField nuevaEspecFisio;
    private JTextField nuevoNombreFisio;
    private JTextField nuevoApellidoFisio;
    private JTextField nuevaCedulaFisio;
    private JComboBox nuevoGeneroFisio;
    private JTextField nuevoDiaFisio;
    private JTextField nuevoMesFisio;
    private JTextField nuevoAnioFisio;
    private JTextField nuevoUsernameFisio;
    private JPasswordField nuevaPasswordFisio;
    private JButton modificarFisioButton;
    private JButton cerrarSesionButton;
    private JTextField textFieldNombreParaCita;
    private JPanel JPanelDatePicker;
    private JButton agendarCitaButton;
    private JComboBox comboBoxHorasCitas;
    private JTextField textFieldNombreParaCancelarCita;
    private JComboBox comboBoxEliminarCita;
    private JLabel labelEliminarCita;
    private JLabel labelEliminarCita2;
    private JButton buscarCitasParaEliminarButton;
    private JButton cancelarCitaButton;
    private JTextArea textAreaDetalleCitasEliminar;
    private JLabel labelDetalleCitas;
    private JComboBox comboBoxCitaNuevaHora;
    private JTextField textFieldNombreCitaModificar;
    private JButton citaBuscarParaModificarButton;
    private JLabel labelCitasModificar;
    private JLabel labelCitasModificar2;
    private JLabel labelCitasModificar3;
    private JLabel labelCitasModificar4;
    private JComboBox comboBoxCitaModificar;
    private JTextArea textAreaCitaModificar;
    private JButton citaModificarButton;
    private JPanel fechaImprimirCitasAgendadas;
    private List<Paciente> pacientes=new ArrayList<>();
    private List<Doctor> doctores=new ArrayList<>();
    private LoginController loginController = new LoginController();
    private List<Grafo> grafos=new ArrayList<>();
    public List<Grafo> getGrafos() {
        return grafos;
    }
    LocalDate fechaDiaActual=LocalDate.now();
    Factura facturaNew;
    SystemFacturacion facturacionSystemNew =new SystemFacturacion();
    Grafo grafoNew;
    Vertice verticeNew;
    Tratamiento tratamiento;
    int contador=0;
    private JDateChooser dateChooser = new JDateChooser();
    private JDateChooser dateChooser2 = new JDateChooser();
    private SistemaDeCitas sistemaDeCitas;

    Date date ;

    public InterfazProyectoFinal() {

        List<LocalTime> horasDisponibles = new ArrayList<>();
        LocalTime horaInicio = LocalTime.of(7, 0);
        LocalTime horaFin = LocalTime.of(16, 0);
        while (!horaInicio.isAfter(horaFin)) {
            horasDisponibles.add(horaInicio);
            horaInicio = horaInicio.plusHours(1);
        }

        sistemaDeCitas = new SistemaDeCitas(horasDisponibles);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        dateChooser.setDateFormatString("dd/MM/yyyy");

        cerrarSesion();
        cerrarSesionButton.setVisible(false);
        labelEliminarCita.setVisible(false);
        labelEliminarCita2.setVisible(false);
        labelDetalleCitas.setVisible(false);
        textAreaDetalleCitasEliminar.setVisible(false);
        comboBoxEliminarCita.setVisible(false);

        labelCitasModificar.setVisible(false);
        labelCitasModificar2.setVisible(false);
        labelCitasModificar3.setVisible(false);
        labelCitasModificar4.setVisible(false);
        textAreaCitaModificar.setVisible(false);
        comboBoxCitaModificar.setVisible(false);
        comboBoxCitaNuevaHora.setVisible(false);
        citaModificarButton.setVisible(false);

        JPanelDatePicker.add(dateChooser);
        //fechaImprimirCitasAgendadas.add(dateChooser2);

    Persona ADMIN = new Persona();
    ADMIN.setUsername("admin");
    ADMIN.setPassword("admin");
    loginController.register(ADMIN);

    setTitle("GUI Proyecto2");
    Persona personaA=new Persona("Juan","Cuccitini","1727373688","Masculino",11,02,2003,"123","123");
    Persona personaB=new Persona("Lionel","Messi","1711007086","Masculino",18,01,2001,"123","123");
    Persona personaC=new Persona("Cristiano","Aveiro","1899105286","Masculino",26,12,1991,"123","123");
    Persona personaD=new Persona("Anuel","Cuccitini","1727373688","Masculino",11,02,2003,"123","123");
    Persona personaE=new Persona("Zaramay","Messi","1711007086","Masculino",18,01,2001,"123","123");
    Persona personaF=new Persona("Duki","Aveiro","1899105286","Masculino",26,12,1991,"123","123");
    Persona dotorA=new Persona("Dr","House","1899105286","Masculino",26,12,1991,"123","123");
    Persona dotorB=new Persona("Dr","Malito","1899105286","Masculino",26,12,1991,"123","123");
    Persona dotorC=new Persona("Dr","Saul","1899105286","Masculino",26,12,1991,"123","123");
    Paciente pacienteA=new Paciente(personaA,2,true,"Juan@gmial.com","123");
    Paciente pacienteB=new Paciente(personaB,2,true,"Lionel@gmial.com","123");
    Paciente pacienteC=new Paciente(personaC,2,false,"Cr7@gmial.com","123");
    Paciente pacienteD=new Paciente(personaD,2,true,"Juan@gmial.com","123");
    Paciente pacienteE=new Paciente(personaE,1,true,"Lionel@gmial.com","123");
    Paciente pacienteF=new Paciente(personaF,1,false,"Cr7@gmial.com","123");
    Doctor doctorA=new Doctor("Tren Sup",dotorA);
    Doctor doctorB=new Doctor("Core",dotorB);
    Doctor doctorC=new Doctor("Tren Inf",dotorC);

    llenarComboBoxHorasCitas();

    buttonCrearFactura.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (facturacionSystemNew.searchBinary(pacientes,textField2.getText()) != null){

                Paciente pacienteGuardar = facturacionSystemNew.searchBinary(pacientes,textField2.getText());
                double valorPagar = determinarValorPagar(comboBox1,textField3);
                int formaPago = determinarFormaPago(comboBox2);
                int cantidadTerapias = comboBox1.getSelectedIndex();
                String descripcion = textField4.getText();

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

                // Guardo mis pacientes creados en la lista de pacientes
                pacientes.add(pacienteC);
                pacientes.add(pacienteA);
                pacientes.add(pacienteB);
                pacientes.add(pacienteD);
                pacientes.add(pacienteE);
                pacientes.add(pacienteF);
                doctores.add(doctorA);
                doctores.add(doctorB);
                doctores.add(doctorC);
                llenarArregloEquipo(doctores,comboBox4);

            }
        });
        buttonBuscarFacutra.addActionListener(new ActionListener() {
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

                if (facturacionSystemNew.searchBinaryFactura(facturacionSystemNew.facturas,correo) != null){

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
                    for (int i = 0; i < getPacientes().size(); i++) {
                        textArea1.append(getPacientes().get(i).getPersonaPaciente().getNombre() + "\n");
                    }
                }
                if (comboBox3.getSelectedItem().toString().equalsIgnoreCase("Prioridad")) {
                    BurbujaxPrioridad();
                    textArea1.setText("");
                    for (int i = 0; i < getPacientesPorPrioridad().size(); i++) {
                        textArea1.append(getPacientesPorPrioridad().get(i).getPersonaPaciente().getNombre() + "\n");
                    }
                }
            }
        });
        busquedaBinariaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox3.getSelectedItem().toString().equalsIgnoreCase("Nombre")) {
                    BurbujaxNombre();
                    textArea1.setText("");
                    textArea1.setText(searchBinary(getPacientes(),textField8.getText()).getPersonaPaciente().getNombre());
                }
                if (comboBox3.getSelectedItem().toString().equalsIgnoreCase("Prioridad")) {
                    BurbujaxPrioridad();
                    textArea1.setText("");
                    textArea1.setText("La prioridad del paciente buscado es "+searchBinaryPrioridad(getPacientes(),scarPrioridad(getPacientesPorPrioridad(), textField8.getText())).getPrioridadPaciente());
                }


            }
        });
        buscarPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BurbujaxNombre();
                if (searchBinary(getPacientes(),textField9.getText()) != null){
                    JOptionPane.showMessageDialog(null,"Se encontro al Paciente "+searchBinary(getPacientes(),textField9.getText()).getPersonaPaciente().getNombre());
                    Grafo grafoSencillo=new Grafo(false,false);
                    grafoNew=grafoSencillo;

                }else{
                    JOptionPane.showMessageDialog(null,"No se encontro al Paciente ");
                }

            }
        });

        crearFichaDeProgresoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BurbujaxNombreDoctores();
                BurbujaxNombre();
                if (enInicioCheckBox.isSelected()) {
                    //tratamiento = new Tratamiento(contador, searchBinaryDoctores(getArregloBurbujaDoctores(),comboBox4.getSelectedItem().toString()),searchBinary(getArregloBurbuja(), textField9.getText()), textField10.getText(),"En Inicio");
                    tratamiento = new Tratamiento(contador,textField10.getText(),"En Inicio");
                } else if (enProgresoCheckBox.isSelected()) {
                    //tratamiento = new Tratamiento(contador, searchBinaryDoctores(getArregloBurbujaDoctores(),comboBox4.getSelectedItem().toString()),searchBinary(getArregloBurbuja(), textField9.getText()), textField10.getText(),"En Progreso");
                    tratamiento = new Tratamiento(contador,textField10.getText(),"En Progreso");
                }else if (completadoCheckBox.isSelected()) {
                    //tratamiento = new Tratamiento(contador, searchBinaryDoctores(getArregloBurbujaDoctores(),comboBox4.getSelectedItem().toString()),searchBinary(getArregloBurbuja(), textField9.getText()), textField10.getText(),"Completado");
                    tratamiento = new Tratamiento(contador,textField10.getText(),"Completado");
                }else{
                    JOptionPane.showMessageDialog(null,"Seleccione uno porfavor");
                }
                BurbujaxNombre();
                Vertice verticeNuevoPaciente=new Vertice(searchBinary(getPacientes(),textField9.getText()));
                verticeNew=verticeNuevoPaciente;
                grafoNew.addVertice(verticeNew.getData());
                BurbujaxNombreDoctores();
                Vertice verticeNuevoDoctores=new Vertice(searchBinaryDoctores(getArregloBurbujaDoctores(),comboBox4.getSelectedItem().toString()));
                verticeNew=verticeNuevoDoctores;
                grafoNew.addVerticeDoctor(verticeNew.getDataD());
                Vertice verticeNuevoTratamiento =new Vertice(tratamiento);
                verticeNew=verticeNuevoTratamiento;
                grafoNew.addVerticeDoctorTratamiento(verticeNew.getDataT());
                Vertice verticeNuevoResultado =new Vertice("");
                verticeNew=verticeNuevoResultado;
                grafoNew.addVerticeDoctorResultado(verticeNew.getResultado());


                grafoNew.addEdge(verticeNuevoPaciente,verticeNuevoDoctores,1);
                grafoNew.addEdge(verticeNuevoPaciente,verticeNuevoTratamiento,1);
                grafoNew.addEdge(verticeNuevoPaciente,verticeNuevoResultado,1);

                grafos.add(grafoNew);
                contador++;
            }
        });
        CONFIRMARESTADOTRATAMIENTOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Grafo recorrerGrafoConNombre=buscarGrafoPorPaciente(grafos,textField14.getText());
                if (comboBox5.getSelectedIndex() == 0){
                    recorrerGrafoConNombre.getVertexByValuePaciente(estadoTratamientoString(textField14)).getDataT().setEstadoDelTratamiento("No muestra Avace");
                }else if(comboBox5.getSelectedIndex() == 1){
                    recorrerGrafoConNombre.getVertexByValuePaciente(estadoTratamientoString(textField14)).getDataT().setEstadoDelTratamiento("Muestra Avance");
                }else if(comboBox5.getSelectedIndex() == 2){
                    recorrerGrafoConNombre.getVertexByValuePaciente(estadoTratamientoString(textField14)).getDataT().setEstadoDelTratamiento("Muestra Gran Avance");
                }else{
                    JOptionPane.showMessageDialog(null,"Seleccione un resultado");
                }
                textArea2.setText("");
                if (recorrerGrafoConNombre!=null) {
                    for (Vertice recorrerVertice : recorrerGrafoConNombre.getVertices()) {

                        if (recorrerVertice.getData() !=null){
                            textField11.setText(recorrerVertice.getData().getPersonaPaciente().getNombre());
                        }
                        if (recorrerVertice.getDataD() !=null){
                            textField12.setText(recorrerVertice.getDataD().getPersonaDoctor().getApellido());
                        }
                        if (recorrerVertice.getDataT() !=null){
                            textField13.setText(recorrerVertice.getDataT().getDescripcionDelTratamiento());
                        }
                        textArea2.append( "\n"+ recorrerVertice.print(grafoNew.isWeighted()));
                    }
                }
            }
        });
        buscarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea2.setText("");
                Grafo recorrerGrafoConNombre=buscarGrafoPorPaciente(grafos,textField14.getText());
                if (recorrerGrafoConNombre!=null) {
                    for (Vertice recorrerVertice : recorrerGrafoConNombre.getVertices()) {

                        if (recorrerVertice.getData() !=null){
                            textField11.setText(recorrerVertice.getData().getPersonaPaciente().getNombre());
                        }
                        if (recorrerVertice.getDataD() !=null){
                            textField12.setText(recorrerVertice.getDataD().getPersonaDoctor().getApellido());
                        }
                        if (recorrerVertice.getDataT() !=null){
                            textField13.setText(recorrerVertice.getDataT().getDescripcionDelTratamiento());
                        }
                        textArea2.append( "\n"+ recorrerVertice.print(grafoNew.isWeighted()));
                    }
                }

            }
        });
        registrarPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int dia = Integer.parseInt(textFieldDiaN.getText());
                int mes = Integer.parseInt(textFieldMesN.getText());


                try {

                    if ( dia <= 31 && mes <= 12 ) {
                        // Creo la nueva persona
                        Persona PersonaNueva = new Persona(
                                textFieldNombre.getText(),
                                textFieldApellido.getText(),
                                textFieldCedula.getText(),
                                comboBoxGenero.getSelectedItem().toString(),
                                dia,
                                mes,
                                Integer.parseInt(textFieldAnioN.getText()),
                                textFieldUsername.getText(),
                                passwordField.getText()
                        );

                        int prioridadPaciente;
                        boolean seguroMedico;

                        if (comboBoxPrioridadPaciente.getSelectedIndex() != 0 || comboBoxSeguroMedico.getSelectedIndex() != 0) {
                            if (comboBoxPrioridadPaciente.getSelectedIndex() == 1) {
                                prioridadPaciente = 1; // 1 significa que es estándar
                            } else {
                                prioridadPaciente = 2; // 2 Significa que es prioritario
                            }

                            if (comboBoxSeguroMedico.getSelectedIndex() == 1) {
                                seguroMedico = true;
                            } else {
                                seguroMedico = false;
                            }
                            Paciente PacienteNuevo = new Paciente(PersonaNueva, prioridadPaciente, seguroMedico, PersonaNueva.getUsername(), PersonaNueva.getPassword());
                            pacientes.add(PacienteNuevo);
                            // Agrego el username y password al HashMap invocando al metodo register
                            loginController.register(PersonaNueva);
                            JOptionPane.showMessageDialog(null, "Felicidades, se ha registrado correctamente!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Seleccione una opción válida!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"Ingrese fechas válidas!");
                    }
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "Hay un error al registrar la persona, verifique los datos!");
                }
            }
        });
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (loginController.login(textFieldUsernameLogin.getText(), passwordFieldLogin.getText())) {

                        JOptionPane.showMessageDialog(null, "Bienvenido, " + textFieldUsernameLogin.getText() + " ha iniciado sesión correctamente");
                        tabbedPane1.setEnabledAt(1, true);
                        tabbedPane1.setEnabledAt(2, true);
                        tabbedPane1.setEnabledAt(3, true);
                        tabbedPane1.setEnabledAt(4, true);
                        tabbedPane1.setEnabledAt(8,true);
                        tabbedPanePacientes.setEnabledAt(1,true);
                        tabbedPanePacientes.setEnabledAt(2,true);

                        if (textFieldUsernameLogin.getText().equals("admin") && passwordFieldLogin.getText().equals("admin")) {
                            tabbedPane1.setEnabledAt(6,true);
                            tabbedPane1.setEnabledAt(7,true);
                        }

                        cerrarSesionButton.setVisible(true);
                        iniciarSesionButton.setVisible(false);
                    } else {

                        JOptionPane.showMessageDialog(null, "Credenciales incorrectas, intente nuevamente!");

                    }
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "Hay un error al iniciar sesión, verifique los datos!");
                }

            }
        });

        eliminarPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BurbujaxNombre();
                Paciente pacienteEncontrado = searchBinary(getPacientes(), textFieldEliminarPaciente.getText());
                if ( pacienteEncontrado != null){
                    JOptionPane.showMessageDialog(null,"Se encontró al Paciente "+pacienteEncontrado.getPersonaPaciente().getNombre() + ", el paciente será eliminado!");
                    loginController.getUsers().remove(pacienteEncontrado.getPersonaPaciente().getUsername());
                    pacientes.remove(pacienteEncontrado); // Remuevo el paciente de la lista

                }else{
                    JOptionPane.showMessageDialog(null,"No se encontró al Paciente ");
                }
            }
        });
        modificarPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int prioridadPaciente;
                    boolean seguroMedico;

                    BurbujaxNombre();
                    String nombrePacienteEliminar = JOptionPane.showInputDialog("Ingrese el nombre del paciente a modificar");
                    Paciente pacienteEncontrado = searchBinary(getPacientes(), nombrePacienteEliminar);
                    if (pacienteEncontrado != null) {

                        if (prioridadModificado.getSelectedIndex() != 0 && seguroModificadoBox.getSelectedIndex() != 0 && generoModificado.getSelectedIndex() != 0) {
                            if (prioridadModificado.getSelectedIndex() == 1) {
                                prioridadPaciente = 1; // 1 significa que es estándar
                            } else {
                                prioridadPaciente = 2; // 2 Significa que es prioritario
                            }

                            if (seguroModificadoBox.getSelectedIndex() == 1) {
                                seguroMedico = true;
                            } else {
                                seguroMedico = false;
                            }

                            JOptionPane.showMessageDialog(null, "Se encontró al Paciente " + pacienteEncontrado.getPersonaPaciente().getNombre() + ", el paciente será modificado!");
                            // Modifico el paciente de la lista
                            loginController.getUsers().replace(pacienteEncontrado.getPersonaPaciente().getUsername(),passwordModificado.getText());
                            pacienteEncontrado.getPersonaPaciente().setNombre(nombreModificado.getText());
                            pacienteEncontrado.getPersonaPaciente().setApellido(apellidoModificado.getText());
                            pacienteEncontrado.getPersonaPaciente().setCedula(cedulaModificada.getText());
                            pacienteEncontrado.getPersonaPaciente().setDiaNacimiento(Integer.parseInt(diaModificado.getText()));
                            pacienteEncontrado.getPersonaPaciente().setMesNacimiento(Integer.parseInt(mesModificado.getText()));
                            pacienteEncontrado.getPersonaPaciente().setAnioNacimiento(Integer.parseInt(anioModificado.getText()));
                            pacienteEncontrado.getPersonaPaciente().setGenero(generoModificado.getSelectedItem().toString());
                            pacienteEncontrado.getPersonaPaciente().setUsername(usernameModificado.getText());
                            pacienteEncontrado.getPersonaPaciente().setPassword(passwordModificado.getText());
                            pacienteEncontrado.setCorreo(usernameModificado.getText());
                            pacienteEncontrado.setUserPassword(passwordModificado.getText());
                            pacienteEncontrado.setPrioridadPaciente(prioridadPaciente);
                            pacienteEncontrado.setSeguroMedico(seguroMedico);


                        } else {

                            JOptionPane.showMessageDialog(null, "Verifique la información");

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró al Paciente ");
                    }
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error, verifique los datos ingresados");
                }
            }
        });

        clickAquiParaEliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    loginController.getUsers().remove(textFieldEliminarCuenta.getText());
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar la cuenta, verifique el usuario ingresado!");
                }
            }
        });
        registrarFisiobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int dia = Integer.parseInt(diaFisio.getText());
                    int mes = Integer.parseInt(mesFisio.getText());

                    if ( generoFisio.getSelectedIndex() != 0 && dia <= 31 && mes <= 12 && !nombreFisio.getText().isEmpty() && !apellidoFIsio.getText().isEmpty() && !cedulaFisio.getText().isEmpty() && !usernameFisio.getText().isEmpty() && !passwordFisio.getText().isEmpty()) {
                        Persona nuevaPersona = new Persona( nombreFisio.getText(),
                                                            apellidoFIsio.getText(),
                                                            cedulaFisio.getText(),
                                                            generoFisio.getSelectedItem().toString(),
                                                            dia,mes,Integer.parseInt(anioFisio.getText())
                                                            ,usernameFisio.getText()
                                                            ,passwordFisio.getText());
                        Doctor doctorNuevo = new Doctor(textFieldEspecialidad.getText(),nuevaPersona);
                        doctores.add(doctorNuevo);
                        loginController.register(nuevaPersona);
                        JOptionPane.showMessageDialog(null,"Felicidades, se ha registrado correctamente!");

                    } else {
                        JOptionPane.showMessageDialog(null,"Verifique la información!");
                    }
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "Hubo un error al crear el fisioterapeuta, verifique los datos ingresados!");
                }

            }
        });

        eliminarFisioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    BurbujaxNombreDoctores();
                    Doctor doctorEncontrado = searchBinaryDoctores(doctores, nombreFisioParaEliminar.getText());
                    if ( doctorEncontrado != null) {
                        JOptionPane.showMessageDialog(null,"Se encontró al Doctor "+doctorEncontrado.getPersonaDoctor().getNombre() + ", el doctor será eliminado!");
                        loginController.getUsers().remove(doctorEncontrado.getPersonaDoctor().getUsername());
                        doctores.remove(doctorEncontrado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Doctor no encontrado!");
                    }

                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el fisioterapeuta, verifique los datos ingresados!");
                }
            }
        });
        modificarFisioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int dia = Integer.parseInt(nuevoDiaFisio.getText());
                    int mes = Integer.parseInt(nuevoMesFisio.getText());

                    BurbujaxNombreDoctores();
                    String nombreDoctorEliminar = JOptionPane.showInputDialog("Ingrese el nombre del doctor a modificar");
                    Doctor doctorEncontrado = searchBinaryDoctores(doctores, nombreDoctorEliminar);
                    if (doctorEncontrado != null) {

                        if ( dia <= 31 && mes <= 12 && nuevoGeneroFisio.getSelectedIndex() != 0 && !nuevoNombreFisio.getText().isEmpty() && !nuevoApellidoFisio.getText().isEmpty() && !nuevaCedulaFisio.getText().isEmpty() && !nuevoUsernameFisio.getText().isEmpty() && !nuevaPasswordFisio.getText().isEmpty() && !nuevaEspecFisio.getText().isEmpty()) {

                            JOptionPane.showMessageDialog(null, "Se encontró al Doctor " + doctorEncontrado.getPersonaDoctor().getNombre() + ", el doctor será modificado!");
                            // Modifico el paciente de la lista
                            loginController.getUsers().replace(doctorEncontrado.getPersonaDoctor().getUsername(),nuevaPasswordFisio.getText());
                            doctorEncontrado.getPersonaDoctor().setNombre(nuevoNombreFisio.getText());
                            doctorEncontrado.getPersonaDoctor().setApellido(nuevoApellidoFisio.getText());
                            doctorEncontrado.getPersonaDoctor().setCedula(nuevaCedulaFisio.getText());
                            doctorEncontrado.getPersonaDoctor().setDiaNacimiento(dia);
                            doctorEncontrado.getPersonaDoctor().setMesNacimiento(mes);
                            doctorEncontrado.getPersonaDoctor().setAnioNacimiento(Integer.parseInt(nuevoAnioFisio.getText()));
                            doctorEncontrado.getPersonaDoctor().setGenero(nuevoGeneroFisio.getSelectedItem().toString());
                            doctorEncontrado.getPersonaDoctor().setUsername(nuevoUsernameFisio.getText());
                            doctorEncontrado.getPersonaDoctor().setPassword(nuevaPasswordFisio.getText());
                            doctorEncontrado.setEspecialidadDoctor(nuevaEspecFisio.getText());

                        } else {

                            JOptionPane.showMessageDialog(null, "Verifique la información");

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró al Paciente ");
                    }
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error, verifique los datos ingresados");
                }
            }
        });
        cerrarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarSesion();
                cerrarSesionButton.setVisible(false);
                iniciarSesionButton.setVisible(true);
                JOptionPane.showMessageDialog(null,"Ha cerrado sesión correctamente!");
            }
        });
        agendarCitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                date = dateChooser.getDate();
                LocalDate fechaLocal = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); // Convierto Date a LocalDate
                Paciente pacienteDeLaCita = null;

                if ( !textFieldNombreParaCita.getText().isEmpty() ){

                    for (Paciente x : pacientes){
                        if (textFieldNombreParaCita.getText().equals(x.getPersonaPaciente().getNombre()) )
                            pacienteDeLaCita = x;
                    }

                }

                if ( pacienteDeLaCita == null) {

                    JOptionPane.showMessageDialog(null, "Verifique los datos ingresados!");

                }
                else{

                    sistemaDeCitas.reservarCita(pacienteDeLaCita, fechaLocal,(LocalTime) comboBoxHorasCitas.getSelectedItem());

                }
            }
        });
        buscarCitasParaEliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ( !textFieldNombreParaCancelarCita.getText().isEmpty() ) {

                    StringBuilder sb = new StringBuilder();

                    for (Cita c : sistemaDeCitas.getColaDeCitas()) {

                        if ( c.getPaciente().getPersonaPaciente().getNombre().equals(textFieldNombreParaCancelarCita.getText()) ) {

                            JOptionPane.showMessageDialog(null,"Se ha encontrado una cita asociada al paciente!");
                            comboBoxEliminarCita.addItem( c.getFecha() );
                            sb.append("Fecha: ").append(c.getFecha()).append(" / Hora:").append(c.getHora()).append("\n");
                        }

                    }

                    labelEliminarCita.setVisible(true);
                    labelEliminarCita2.setVisible(true);
                    labelDetalleCitas.setVisible(true);
                    textAreaDetalleCitasEliminar.setVisible(true);
                    comboBoxEliminarCita.setVisible(true);
                    cancelarCitaButton.setVisible(true);
                    textAreaDetalleCitasEliminar.setText(sb.toString());

                } else {

                    JOptionPane.showMessageDialog(null, "Verifique la información ingresada!");

                }
            }
        });
        cancelarCitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cita citaEncontrada = null;

                if (comboBoxEliminarCita.getItemCount() > 0) {

                    for (Cita c : sistemaDeCitas.getColaDeCitas()) {

                        if ( c.getFecha().equals(comboBoxEliminarCita.getSelectedItem()) ) {

                            citaEncontrada = c;

                        }

                    }

                    if ( citaEncontrada != null) {

                        sistemaDeCitas.cancelarCita( citaEncontrada );
                        JOptionPane.showMessageDialog(null, "La cita ha sido borrada exitosamente!");

                    } else {

                        JOptionPane.showMessageDialog(null, "No se ha podido encontrar la cita para eliminarla, intente nuevamente!");

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "No existen citas para eliminar, verifique la información!");

                }

                comboBoxEliminarCita.removeAllItems(); // Limpio el JComboBox
                labelEliminarCita.setVisible(false);
                labelEliminarCita2.setVisible(false);
                labelDetalleCitas.setVisible(false);
                textAreaDetalleCitasEliminar.setVisible(false);
                comboBoxEliminarCita.setVisible(false);
                cancelarCitaButton.setVisible(false);
            }
        });

        citaBuscarParaModificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ( !textFieldNombreCitaModificar.getText().isEmpty() ) {

                    StringBuilder sb = new StringBuilder();

                    for (Cita c : sistemaDeCitas.getColaDeCitas()) {

                        if ( c.getPaciente().getPersonaPaciente().getNombre().equals(textFieldNombreCitaModificar.getText()) ) {

                            JOptionPane.showMessageDialog(null,"Se ha encontrado una cita asociada al paciente!");
                            comboBoxCitaModificar.addItem( c.getFecha() );
                            sb.append("Fecha: ").append(c.getFecha()).append(" / Hora:").append(c.getHora()).append("\n");
                        }

                    }

                    labelCitasModificar.setVisible(true);
                    labelCitasModificar2.setVisible(true);
                    labelCitasModificar3.setVisible(true);
                    labelCitasModificar4.setVisible(true);
                    textAreaCitaModificar.setVisible(true);
                    comboBoxCitaModificar.setVisible(true);
                    comboBoxCitaNuevaHora.setVisible(true);
                    citaModificarButton.setVisible(true);
                    textAreaCitaModificar.setText(sb.toString());

                } else {

                    JOptionPane.showMessageDialog(null, "Verifique la información ingresada!");

                }

            }
        });
        citaModificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cita citaEncontrada = null;

                if (comboBoxCitaModificar.getItemCount() > 0) {

                    for (Cita c : sistemaDeCitas.getColaDeCitas()) {

                        if ( c.getFecha().equals(comboBoxCitaModificar.getSelectedItem()) ) {

                            citaEncontrada = c;

                        }

                    }

                    if ( citaEncontrada != null) {

                        sistemaDeCitas.reagendarCita( citaEncontrada , (LocalTime) comboBoxCitaNuevaHora.getSelectedItem());
                        JOptionPane.showMessageDialog(null, "La hora de la cita ha sido modificada exitosamente!");

                    } else {

                        JOptionPane.showMessageDialog(null, "No se ha podido encontrar la cita para modificarla, intente nuevamente!");

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "No existen citas para modificar, verifique la información!");

                }

                labelCitasModificar.setVisible(false);
                labelCitasModificar2.setVisible(false);
                labelCitasModificar3.setVisible(false);
                labelCitasModificar4.setVisible(false);
                textAreaCitaModificar.setVisible(false);
                comboBoxCitaModificar.setVisible(false);
                comboBoxCitaNuevaHora.setVisible(false);
                citaModificarButton.setVisible(false);

            }
        });

        mostrarCitasAgendadasDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (!sistemaDeCitas.getColaDeCitas().isEmpty()) {

                        date = dateChooser2.getDate();
                        LocalDate fechaLocal = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); // Convierto Date a LocalDate

                        String mensaje = sistemaDeCitas.verHorarioDeCitasAgendadas(fechaLocal);

                        textAreaCitasDeHoy.setText(mensaje);

                    } else {

                        JOptionPane.showMessageDialog(null, "La lista de citas se encuentra vacía, intente nuevamente más tarde!");

                    }
                } catch (Exception x) {

                    JOptionPane.showMessageDialog(null, "Hubo un error al imprimir, intente nuevamente más tarde!");

                }
            }
        });
        CAMBIARTRATAMIENTOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Grafo recorrerGrafoConNombre=buscarGrafoPorPaciente(grafos,textField14.getText());
                recorrerGrafoConNombre.getVertexByValuePaciente(estadoDescripcionTratamiento(textField14)).getDataT().setDescripcionDelTratamiento(textField13.getText());
                textArea2.setText("");
                if (recorrerGrafoConNombre!=null) {
                    for (Vertice recorrerVertice : recorrerGrafoConNombre.getVertices()) {

                        if (recorrerVertice.getData() !=null){
                            textField11.setText(recorrerVertice.getData().getPersonaPaciente().getNombre());
                        }
                        if (recorrerVertice.getDataD() !=null){
                            textField12.setText(recorrerVertice.getDataD().getPersonaDoctor().getApellido());
                        }
                        if (recorrerVertice.getDataT() !=null){
                            textField13.setText(recorrerVertice.getDataT().getDescripcionDelTratamiento());
                        }
                        textArea2.append( "\n"+ recorrerVertice.print(grafoNew.isWeighted()));
                    }
                }
            }
        });
    }

    private void cerrarSesion() {
        tabbedPane1.setEnabledAt(1,false);
        tabbedPane1.setEnabledAt(2,false);
        tabbedPane1.setEnabledAt(3,false);
        tabbedPane1.setEnabledAt(4,false);
        tabbedPane1.setEnabledAt(6,false);
        tabbedPane1.setEnabledAt(7,false);
        tabbedPane1.setEnabledAt(8,false);
        tabbedPanePacientes.setEnabledAt(1,false);
        tabbedPanePacientes.setEnabledAt(2,false);
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
        int n = pacientes.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (pacientes.get(j).getPersonaPaciente().getNombre().compareTo(pacientes.get(j+1).getPersonaPaciente().getNombre()) >0 ) {
                    Paciente temp = pacientes.get(j);
                    pacientes.set(j,pacientes.get(j+1)) ;
                    pacientes.set(j+1,temp);
                }
            }
        }
    }
    public int scarPrioridad(List<Paciente> listapacientes, String nombre){
        for (Paciente aux: listapacientes){
            if (aux.getPersonaPaciente().getNombre().equalsIgnoreCase(nombre)){
                return aux.getPrioridadPaciente();
            }
        }
        return 0;
    }

    public void BurbujaxNombreDoctores(){
        int n = doctores.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (doctores.get(j).getPersonaDoctor().getApellido().compareTo(doctores.get(j+1).getPersonaDoctor().getApellido()) >0 ) {
                    Doctor temp = doctores.get(j);
                    doctores.set(j,doctores.get(j+1)) ;
                    doctores.set(j+1,temp);
                }
            }
        }
    }
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    public List<Doctor> getArregloBurbujaDoctores() {
        return doctores;
    }
    public void BurbujaxPrioridad(){
        int n = pacientes.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (pacientes.get(j).getPrioridadPaciente() > pacientes.get(j+1).getPrioridadPaciente()) {
                    Paciente temp = pacientes.get(j);
                    pacientes.set(j,pacientes.get(j+1)) ;
                    pacientes.set(j+1,temp);
                }
            }
        }
    }
    public List<Paciente> getPacientesPorPrioridad() {
        return pacientes;
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

    public  Paciente searchBinaryPrioridad(List<Paciente> listaBuscarPorTrackingBinario, int targetTrackingNameT) {
        int izquierda=0, derecha= listaBuscarPorTrackingBinario.size() -1;
        while (izquierda<=derecha){
            int numMedio=(derecha+izquierda)/2;
            if(targetTrackingNameT ==  listaBuscarPorTrackingBinario.get(numMedio).getPrioridadPaciente()){
                return listaBuscarPorTrackingBinario.get(numMedio);
            }else if((listaBuscarPorTrackingBinario.get(numMedio).getPrioridadPaciente())<targetTrackingNameT){
                izquierda=numMedio+1;
            }else{
                derecha=numMedio-1;
            }
        }
        return null;
    }

    public  Doctor searchBinaryDoctores(List<Doctor> listaBuscarPorTrackingBinario, String targetTrackingNameT) {
        int izquierda=0, derecha= listaBuscarPorTrackingBinario.size() -1;
        while (izquierda<=derecha){
            int numMedio=(derecha+izquierda)/2;
            if(targetTrackingNameT.equals(listaBuscarPorTrackingBinario.get(numMedio).getPersonaDoctor().getApellido())){
                return listaBuscarPorTrackingBinario.get(numMedio);
            }else if(listaBuscarPorTrackingBinario.get(numMedio).getPersonaDoctor().getApellido().compareTo(targetTrackingNameT) < 0){
                izquierda=numMedio+1;
            }else{
                derecha=numMedio-1;
            }
        }
        return null;
    }
    private void llenarArregloEquipo(List<Doctor> listaRecorrer, JComboBox comboBoxSetear){
        for (Doctor doctresRecorrer:listaRecorrer){
            comboBoxSetear.addItem(doctresRecorrer.getPersonaDoctor().getApellido());
        }

    }
    public Grafo buscarGrafoPorPaciente(List<Grafo> grafosRecorrer,String nombrePaciente){
        if (grafosRecorrer != null) {
            for (Grafo grafoAux : grafosRecorrer) {
                if (grafoAux.getVertexByValuePaciente(nombrePaciente) != null) {
                    return grafoAux;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"No existena nada en elos registros todavia");
        }
        return null;
    }
    public String estadoTratamientoString(JTextField paciente){
        Grafo recorrerGrafoConNombre=buscarGrafoPorPaciente(grafos,paciente.getText());
        if (recorrerGrafoConNombre!=null) {
            for (Vertice recorrerVertice : recorrerGrafoConNombre.getVertices()) {
                if (recorrerVertice.getDataT() != null) {
                        return recorrerVertice.getDataT().getEstadoDelTratamiento();
                }
            }
        }
        return "";

    }
    public String estadoDescripcionTratamiento(JTextField paciente){

        Grafo recorrerGrafoConNombre=buscarGrafoPorPaciente(grafos,paciente.getText());
        String informacion="";
        if (recorrerGrafoConNombre!=null) {
            for (Vertice recorrerVertice : recorrerGrafoConNombre.getVertices()) {
                if (recorrerVertice.getDataT() != null) {
                    informacion=recorrerVertice.getDataT().getDescripcionDelTratamiento();
                        return informacion;
                }
            }
        }
        return informacion;

    }

    public void llenarComboBoxHorasCitas() {

        for (LocalTime x : sistemaDeCitas.getHorariosDisponibles()) {
            comboBoxHorasCitas.addItem(x);
            comboBoxCitaNuevaHora.addItem(x);
        }
    }


}
