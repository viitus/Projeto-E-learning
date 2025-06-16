package Controller;

import Model.Curso;
import Util.PersistenciaJson;
import java.util.ArrayList;
import java.util.List;

public class CursoController {
    private List<Curso> cursos;
    private final String arquivo = "cursos.json";

    public CursoController() {
        cursos = PersistenciaJson.carregarCursos(arquivo);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
        salvarCursos();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
        salvarCursos();
    }

    public void editarCurso(int index, String novoNome, String novaDescricao) {
        Curso curso = cursos.get(index);
        curso.setNome(novoNome);
        curso.setDescricao(novaDescricao);
        salvarCursos();
    }
    
    public Curso buscarCurso(String nome) {
        for (Curso curso : cursos) {
            if (curso.getNome().equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    public void removerCurso(int index) {
        cursos.remove(index);
        salvarCursos();
    }

    public void salvarCursos() {
        PersistenciaJson.salvarCursos(cursos, arquivo);
    }
} 
