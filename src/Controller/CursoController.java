package Controller;

import Model.Aula;
import java.util.ArrayList;
import java.util.List;
import Model.Curso;

public class CursoController {
    private List<Curso> cursos;

    public CursoController(){
        cursos = new ArrayList<>();
        inicializarCursosFixos();
    }
    
    private void inicializarCursosFixos() {
        Curso cursoJava = new Curso("Java Básico", "Aprenda os fundamentos do Java");
        cursoJava.adicionarAula(new Aula("Introdução ao Java", "Conteúdo da aula 1"));
        cursoJava.adicionarAula(new Aula("Tipos de dados", "Conteúdo da aula 2"));
        
        Curso cursoLogica = new Curso("Lógica de Programação", "Conceitos de lógica e algoritmos");
        cursoLogica.adicionarAula(new Aula("Algoritmos Básicos", "Conteúdo da aula 1"));
        
        cursos.add(cursoJava);
        cursos.add(cursoLogica);
        cursos.add(new Curso("Banco de Dados", "Introdução ao SQL e modelagem"));
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(int index) {
        if (index >= 0 && index < cursos.size()) {
            cursos.remove(index);
        }
    }

    public void editarCurso(int index, String novoNome, String novaDescricao) {
        if (index >= 0 && index < cursos.size()) {
            Curso curso = cursos.get(index);
            curso.setNome(novoNome);
            curso.setDescricao(novaDescricao);
        }
    }

    public List<Curso> getCursos(){
        return cursos;
    }
}
