import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

class Cita implements Comparable<Cita> {
    private Paciente paciente;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(Paciente paciente, LocalDate fecha, LocalTime hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public int compareTo(Cita otraCita) {
        // Primero comparamos las fechas de las citas
        int comparacionDeFechas = this.fecha.compareTo(otraCita.fecha);
        if (comparacionDeFechas != 0) {
            return comparacionDeFechas;
        }

        // Si las fechas son iguales, comparamos las horas de las citas
        int comparacionDeHoras = this.hora.compareTo(otraCita.hora);
        if (comparacionDeHoras != 0) {
            return comparacionDeHoras;
        }

        // Si las horas son iguales, damos prioridad a los usuarios prioritarios
        if (this.paciente.isPrioritario() && !otraCita.paciente.isPrioritario()) {
            return -1; // Es de menor prioridad
        } else if (!this.paciente.isPrioritario() && otraCita.paciente.isPrioritario()) {
            return 1; // Es de mayor prioridad
        } else {
            return 0; // Igual prioridad
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Cita:\n" +
                "Paciente: " + paciente.getPersonaPaciente().getNombre() + " " + paciente.getPersonaPaciente().getApellido() + "\n" +
                "Fecha: " + fecha + "\n" +
                "Hora: " + hora + "\n\n";
    }
}

