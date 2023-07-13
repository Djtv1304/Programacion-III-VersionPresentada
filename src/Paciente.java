import java.util.ArrayList;
import java.util.List;

public class Paciente  implements Cloneable {

    private Persona personaPaciente;
    private int prioridadPaciente;
    private boolean seguroMedico;
    private String correo;
    private String userPassword;
    private boolean isPrioritario;

    public Paciente(Persona personaPaciente, int prioridadPaciente, boolean seguroMedico, String correo, String userPassword) {
        this.personaPaciente = personaPaciente;
        this.prioridadPaciente = prioridadPaciente;
        this.seguroMedico = seguroMedico;
        this.correo = correo;
        this.userPassword = userPassword;
        this.isPrioritario = prioridadPaciente == 2 ? true : false;
    }

    public boolean isPrioritario() {
        return isPrioritario;
    }

    public void setPrioritario(boolean prioritario) {
        isPrioritario = prioritario;
    }

    public Persona getPersonaPaciente() {
        return personaPaciente;
    }

    public void setPersonaPaciente(Persona personaPaciente) {
        this.personaPaciente = personaPaciente;
    }

    public int getPrioridadPaciente() {
        return prioridadPaciente;
    }

    public void setPrioridadPaciente(int prioridadPaciente) {
        this.prioridadPaciente = prioridadPaciente;
    }

    public boolean isSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(boolean seguroMedico) {
        this.seguroMedico = seguroMedico;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public Paciente deepClone() throws CloneNotSupportedException{
        Paciente clone=(Paciente) super.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "\npersonaPaciente=" + personaPaciente +
                "\n, prioridadPaciente=" + prioridadPaciente +
                "\n, seguroMedico=" + seguroMedico +
                "\n, correo='" + correo + '\'' +
                "\n, userPassword='" + userPassword + '\'' +
                '}';
    }
}
