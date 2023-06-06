import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {

    private Persona personaPaciente;
    private int prioridadPaciente;
    private LoginController usuario;
    private LoginController contrasenia;

    public Paciente(String nombre, String apellido, String cedula, String genero, String tipoDeUsuario, int diaNacimiento, int mesNacimiento, int anioNacimiento, Persona personaPaciente, int prioridadPaciente, LoginController usuario, LoginController contrasenia) {
        super(nombre, apellido, cedula, genero, tipoDeUsuario, diaNacimiento, mesNacimiento, anioNacimiento);
        this.personaPaciente = personaPaciente;
        this.prioridadPaciente = prioridadPaciente;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
}
