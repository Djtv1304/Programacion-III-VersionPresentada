import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {

    private Persona personaPaciente;
    private int prioridadPaciente;
    private String observacionesAdicionales;
    private String seguroMedico;

    public Paciente(String nombre, String apellido, String cedula, String genero, int diaNacimiento, int mesNacimiento, int anioNacimiento, String correo, String userPassword, Persona personaPaciente, int prioridadPaciente) {
        super(nombre, apellido, cedula, genero, diaNacimiento, mesNacimiento, anioNacimiento, correo, userPassword);
        this.personaPaciente = personaPaciente;
        this.prioridadPaciente = prioridadPaciente;
    }
}
