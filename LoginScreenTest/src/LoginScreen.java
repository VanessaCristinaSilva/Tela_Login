import java.util.HashMap;
import java.util.Map;

public class LoginScreen {
    private Map<String, String> userDatabase;

    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
