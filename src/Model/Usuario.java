package Model;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private String tipo; // "aluno", "professor" ou "admin"
    private ArrayList<Curso> cursosMatriculados = new ArrayList<>();

    public Usuario(String nome, String login, String senha, String tipo) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
        
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }

    public boolean matricularEmCurso(Curso curso) {
        if (!cursosMatriculados.contains(curso)) {
            cursosMatriculados.add(curso);
            return true;
        }
        return false;
    }    
    
}
