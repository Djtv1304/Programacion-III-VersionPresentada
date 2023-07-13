import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.PriorityQueue;

public class SistemaDeCitas {
    private PriorityQueue<Cita> colaDeCitas;
    private List<LocalTime> horariosDisponibles;

    public SistemaDeCitas(List<LocalTime> horariosDisponibles) {
        colaDeCitas = new PriorityQueue<>();
        this.horariosDisponibles = horariosDisponibles;
    }

    public PriorityQueue<Cita> getColaDeCitas() {
        return colaDeCitas;
    }

    public List<LocalTime> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void reservarCita(Paciente paciente, LocalDate fecha, LocalTime hora) {
        // Validar que la fecha no sea anterior al día en el que se está agendando la cita
        LocalDate hoy = LocalDate.now();
        if (fecha.isBefore(hoy)) {
            JOptionPane.showMessageDialog(null,"Lo siento, no puedes reservar una cita para una fecha anterior al día de hoy.");
            return;
        }

        // Validar que no exista una cita con la misma fecha y hora
        for (Cita citaExistente : colaDeCitas) {
            if (citaExistente.getFecha().equals(fecha) && citaExistente.getHora().equals(hora)) {
                JOptionPane.showMessageDialog(null,"Lo siento, ya existe una cita reservada para esa fecha y hora.");
                return;
            }
        }

        if (paciente.isPrioritario()) {
            // Validar que la fecha sea dentro de tres días posteriores al agendamiento de la cita
            LocalDate fechaLimite = hoy.plusDays(3);
            if (fecha.isAfter(fechaLimite)) {
                JOptionPane.showMessageDialog(null,"Lo siento, no puedes reservar una cita para una fecha posterior a " + fechaLimite);
                return;
            }

            // Agregar cita a la cola con prioridad
            Cita cita = new Cita(paciente, fecha, hora);
            colaDeCitas.add(cita);
            JOptionPane.showMessageDialog(null,"Cita reservada para el día " + fecha + " a las " + hora + " horas");
        } else {
            // Validar que la fecha sea para el mismo día según horarios disponibles
            if (!fecha.equals(hoy)) {
                JOptionPane.showMessageDialog(null,"Lo siento, solo puedes reservar citas para el día de hoy.");
                return;
            }

            // Agregar cita a la cola sin prioridad
            Cita cita = new Cita(paciente, fecha, hora);
            colaDeCitas.add(cita);
            JOptionPane.showMessageDialog(null,"Cita reservada para el día " + fecha + " a las " + hora + " horas");
        }
    }

    public void cancelarCita(Cita cita) {
        // Validar que la cita no sea anterior al día actual
        LocalDate hoy = LocalDate.now();
        if (cita.getFecha().isBefore(hoy)) {
            JOptionPane.showMessageDialog(null,"Lo siento, no puedes cancelar una cita pasada.");
            return;
        }

        // Implementar lógica para cancelar una cita
        if (colaDeCitas.remove(cita)) {
            JOptionPane.showMessageDialog(null,"Cita cancelada.");
        } else {
            JOptionPane.showMessageDialog(null,"No se encontró la cita especificada.");
        }
    }

    public void reagendarCita(Cita cita, LocalTime nuevaHora) {
        // Validar que la cita no sea anterior al día actual
        LocalDate hoy = LocalDate.now();
        if (cita.getFecha().isBefore(hoy)) {
            JOptionPane.showMessageDialog(null,"Lo siento, no puedes reagendar una cita pasada.");
            return;
        }

        // Validar que no exista una cita con la misma fecha y nueva hora
        for (Cita citaExistente : colaDeCitas) {
            if (citaExistente.getFecha().equals(cita.getFecha()) && citaExistente.getHora().equals(nuevaHora)) {
                JOptionPane.showMessageDialog(null,"Lo siento, ya existe una cita reservada para esa fecha y hora.");
                return;
            }
        }

        // Implementar lógica para reagendar una cita
        if (colaDeCitas.remove(cita)) {
            Cita nuevaCita = new Cita(cita.getPaciente(), cita.getFecha(), nuevaHora);
            colaDeCitas.add(nuevaCita);
            JOptionPane.showMessageDialog(null,"Cita reagendada para el día " + cita.getFecha() + " a las " + nuevaHora + " horas");
        } else {
            JOptionPane.showMessageDialog(null,"No se encontró la cita especificada.");
        }
    }


    public String verHorarioDeCitasAgendadas(LocalDate fecha) {

        StringBuilder sb = new StringBuilder();

        // Validar que la fecha no sea anterior al día actual
        LocalDate hoy = LocalDate.now();
        if (fecha.isBefore(hoy)) {
            JOptionPane.showMessageDialog(null,"Lo siento, no puedes ver el horario de citas agendadas para una fecha anterior al día de hoy.");
            sb.append("Lo siento, no puedes ver el horario de citas agendadas para una fecha anterior al día de hoy.");
            return sb.toString();
        }

        // Implementar lógica para mostrar el horario de citas agendadas de un día escogido y del día actual
        sb.append("Horario de citas agendadas para el día ").append(fecha).append(":\n");
        for (Cita cita : colaDeCitas) {
            if (cita.getFecha().equals(fecha)) {
                sb.append("Cita de ").append(cita.getPaciente().getPersonaPaciente().getNombre()).append(": ").append(cita.getHora()).append("\n");
            }
        }

        return sb.toString();
    }
}
