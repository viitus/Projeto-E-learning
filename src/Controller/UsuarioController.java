package Controller;

import java.util.ArrayList;
import Model.Usuario;

public class UsuarioController {
    private ArrayList<Usuario> usuarios;

    public UsuarioController() {
        usuarios = new ArrayList<>();

        // Usuários fictícios
        usuarios.add(new Usuario("Victor", "victor", "1234", "admin"));
        usuarios.add(new Usuario("Cristina", "cristina", "1234", "professor"));
        usuarios.add(new Usuario("aluno", "aluno", "aluno", "aluno"));
    }

    public Usuario autenticar(String login, String senha) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }
}
