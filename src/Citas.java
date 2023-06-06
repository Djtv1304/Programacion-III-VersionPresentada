public class Citas {
    private Doctor doctorDeLaCita;
    private Paciente pacienteDeLaCita;
    private String fechaDeLaCita; // Es la fecha en la que el paciente recibirá la cita

    public Citas(Doctor doctorDeLaCita, Paciente pacienteDeLaCita, String fechaDeLaCita) {
        this.doctorDeLaCita = doctorDeLaCita;
        this.pacienteDeLaCita = pacienteDeLaCita;
        this.fechaDeLaCita = fechaDeLaCita;
    }

    public void agendarCita(Paciente personaCita) {
        this.pacienteDeLaCita = personaCita;
    }

    public void agendarCita() {

    }

}
