public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String genero;
    private String tipoDeUsuario;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public enum tipoDePersona {

        PACIENTEPRIORITARIO,
        PACIENTENORMAL,
        TERAPEUTA

    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String genero, String tipoDeUsuario, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.genero = genero;
        this.tipoDeUsuario = tipoDeUsuario;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    //Realizar el cálculo de la edad de persona
    public void calcularEdad() {

    }
}
