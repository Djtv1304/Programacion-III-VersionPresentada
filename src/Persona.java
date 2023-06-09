public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String genero;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private String correo;
    private String userPassword;
    public enum tipoDePersona {

        PACIENTE_PRIORITARIO,
        PACIENTE_NORMAL,
        TERAPEUTA

    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String genero, int diaNacimiento, int mesNacimiento, int anioNacimiento, String correo, String userPassword) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.genero = genero;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.correo = correo;
        this.userPassword = userPassword;
    }

    //Realizar el cálculo de la edad de persona
    public void calcularEdad() {

    }
}
