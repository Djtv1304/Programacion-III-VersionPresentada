import java.util.HashMap;
import java.util.Map;

public class LoginController {

    private Map<String, String> users = new HashMap<>();

    public LoginController() {
    }

    public void register(Persona registerPersona) {
        users.put(registerPersona.getUsername(), registerPersona.getPassword());
    }

    public boolean login(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public Map<String, String> getUsers() {
        return users;
    }

    //Hacer el método de registro y guardar el usuario registrado y la fecha en que se registró


}
