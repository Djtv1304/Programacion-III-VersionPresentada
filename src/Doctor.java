public class Doctor implements Cloneable  {

    private String especialidadDoctor;
    //private boolean disponibilidadDoctor;
    private Persona personaDoctor;

    public Doctor(String especialidadDoctor, Persona personaDoctor) {
        this.especialidadDoctor = especialidadDoctor;
        this.personaDoctor = personaDoctor;
    }

    public String getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public Persona getPersonaDoctor() {
        return personaDoctor;
    }

    public void setPersonaDoctor(Persona personaDoctor) {
        this.personaDoctor = personaDoctor;
    }

    public Doctor deepClone() throws CloneNotSupportedException{
        Doctor clone=(Doctor) super.clone();
        return clone;
    }
}
