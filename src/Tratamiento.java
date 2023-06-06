public class Tratamiento {

    private int ID;
    private Doctor doctorDelTratamiento;
    private Paciente pacienteDelTratamiento;
    private String descripcionDelTratamiento;
    private String estadoDelTratamiento; //Finalizado, completado o en proceso

    public enum resultado {
        NO_MUESTRA_PROGRESO,
        MUESTRA_LEVE_PROGRESO,
        MUESTRA_PROGRESO,
        MUESTRA_MEJORA,
        REHABILITADO_TOTALMENTE
    }

}
