package Controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import Model.Usuario;
import Util.PersistenciaJson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios;
    private final String arquivo = "usuarios.json";
    private final Gson gson = new Gson();
    
    public UsuarioController() {
        carregarUsuarios();
    }

    // Carrega usuários do arquivo JSON para a lista
    private void carregarUsuarios() {
        try (FileReader reader = new FileReader("usuarios.json")) {
            Type tipoLista = new TypeToken<ArrayList<Usuario>>() {}.getType();
            usuarios = gson.fromJson(reader, tipoLista);
            if (usuarios == null) {
                usuarios = new ArrayList<>();
            }
        } catch (IOException e) {
            // Se não existir o arquivo, inicia lista vazia
            usuarios = new ArrayList<>();
        }
    }
    
    // Salva lista de usuários no arquivo JSON
    public void salvarUsuarios() {
        try (FileWriter writer = new FileWriter("usuarios.json")) {
            gson.toJson(usuarios, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Usuario buscarUsuario(String login) {
        for (Usuario usuario : usuarios) {
            if (usuario != null && usuario.getLogin() != null && usuario.getLogin().equalsIgnoreCase(login)) {
                return usuario;
            }
        }
        return null;
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
        salvarUsuarios();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public Usuario autenticar(String nome, String senha) {
        for (Usuario u : usuarios) {
            if (u.getNome().equals(nome) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }

}

