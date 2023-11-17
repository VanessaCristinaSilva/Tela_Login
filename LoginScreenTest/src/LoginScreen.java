//@vanessacristina
//version 1.0
//@since 17.11

import java.util.HashMap;
import java.util.Map;

// A classe LoginScreen representa uma tela de login simples com funcionalidades
// para autenticação de usuários e adição de novos usuários ao banco de dados.

public class LoginScreen {
	
// Mapa que armazena pares de nome de usuário e senha. */

    private Map<String, String> userDatabase;

 // Construtor padrão que inicializa o banco de dados com alguns usuários de exemplo.

    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }
    
//Método para autenticar um usuário com base no nome de usuário e senha fornecidos.
//@param username Nome de usuário a ser autenticado.
//@param password Senha associada ao nome de usuário.
//@return true se a autenticação for bem-sucedida, false caso contrário.

    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }
//Adiciona um novo usuário ao banco de dados.
//@param username Nome de usuário do novo usuário.
//@param password Senha associada ao nome de usuário.

    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
